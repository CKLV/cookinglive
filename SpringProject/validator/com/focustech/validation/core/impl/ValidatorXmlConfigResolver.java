package com.focustech.validation.core.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.core.io.Resource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.focustech.validation.config.Constants;
import com.focustech.validation.config.ErrorMsg;
import com.focustech.validation.config.FieldConfig;
import com.focustech.validation.config.GroupConfig;
import com.focustech.validation.config.POJOConfig;
import com.focustech.validation.config.XMLConfigConstant;
import com.focustech.validation.core.AbstractValidator;
import com.focustech.validation.core.ConfigInfo;
import com.focustech.validation.core.ConfigResolver;
import com.focustech.validation.core.ValidatorRegistry;
import com.focustech.validation.exception.ConfigException;
import com.focustech.validation.util.BeanUtil;

/**
 * 根据XML配置文件，读取validator的配置和所有的校验规则，并保存在内存中
 *
 * @see ConfigResolver
 * @author geliang
 */
public class ValidatorXmlConfigResolver implements ConfigResolver {
    private final Resource validatorsConfig; // 配置校验器的文件
    private final Resource validateFilesFolder; // 所有校验规则文件所在的目录

    /**
     * Create a XML file Config resolver. The file path starts from the classpath.
     *
     * @param validatorFilePath The validator config file.
     * @param configFilesFolderPath The validate file folder path.
     * @throws ConfigException If the config file is invalid.
     * @throws IOException
     */
    public ValidatorXmlConfigResolver(Resource validatorFilePath, Resource configFilesFolderPath)
            throws ConfigException, IOException {
        super();
        if (validatorFilePath == null) {
            throw new ConfigException(ErrorMsg.VALIDATOR_CONFIG_FILE_DOES_NOT_EXIST);
        }
        if (configFilesFolderPath == null || !configFilesFolderPath.getFile().isDirectory()) {
            throw new ConfigException(ErrorMsg.VALIDATE_FILE_FOLDER_NOT_EXIST);
        }
        this.validatorsConfig = validatorFilePath;
        this.validateFilesFolder = configFilesFolderPath;
    }

    @Override
    public ConfigInfo resolveConfig() throws ConfigException, IOException {
        List<File> configFiles = new ArrayList<File>();
        try {
            configFiles = listConfigFile();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ConfigInfo configInfo = new ConfigInfo();
        for (File configFile : configFiles) {
            POJOConfig config = parseConfigFile(configFile);
            configInfo.addConfig(config);
        }
        return configInfo;
    }

    // Parse a pojo config file
    private POJOConfig parseConfigFile(File configFile) throws ConfigException {
        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            builderFactory.setIgnoringComments(true);
            builderFactory.setIgnoringElementContentWhitespace(true);
            Document doc = builderFactory.newDocumentBuilder().parse(configFile);
            Element rootEle = doc.getDocumentElement();
            String className = rootEle.getAttribute(XMLConfigConstant.CLASS_NAME);
            POJOConfig pojoConfig = new POJOConfig(className);
            List<FieldConfig> fieldConfigs = parseFieldsConfig(rootEle);
            List<GroupConfig> groupConfig = parseGroupConfig(rootEle, fieldConfigs);
            pojoConfig.putAll(groupConfig);
            return pojoConfig;
        }
        catch (SAXException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Parse all fields config.
    private List<FieldConfig> parseFieldsConfig(Element rootEle) throws ConfigException {
        NodeList fields = rootEle.getElementsByTagName(XMLConfigConstant.FIELDS);
        if (fields == null || fields.getLength() < 1) {
            throw new ConfigException(ErrorMsg.NO_FIELDS_ELEMENT);
        }
        Node fieldsNode = fields.item(0);
        if (fieldsNode == null) {
            throw new ConfigException(ErrorMsg.NO_FIELDS_ELEMENT);
        }
        List<FieldConfig> result = new ArrayList<FieldConfig>();
        NodeList fieldNodes = fieldsNode.getChildNodes();
        if (fieldNodes == null) {
            throw new ConfigException(ErrorMsg.NO_FIELD_ELEMENT);
        }
        for (int i = 0; i < fieldNodes.getLength(); i++) {
            Node fieldNode = fieldNodes.item(i);
            if (XMLConfigConstant.FIELD_RULE.equals(fieldNode.getNodeName())) {
                FieldConfig fieldConfig = parseFieldConfig(fieldNode);
                if (fieldConfig != null) {
                    result.add(fieldConfig);
                }
            }
        }
        return result;
    }

    private FieldConfig parseFieldConfig(Node fieldNode) throws ConfigException {
        NamedNodeMap attr = fieldNode.getAttributes();
        Node nameNode = attr.getNamedItem(XMLConfigConstant.NAME);
        if (nameNode == null) {
            throw new ConfigException(ErrorMsg.NO_NAME_PROPERTY_FOR_FIELD);
        }
        FieldConfig fieldConfig = new FieldConfig(nameNode.getNodeValue());
        NodeList validateRule = fieldNode.getChildNodes();
        if (validateRule == null || validateRule.getLength() == 0) {
            return null;
        }
        for (int i = 0; i < validateRule.getLength(); i++) {
            Node node = validateRule.item(i);
            if (node.getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
            AbstractValidator validator = ValidatorRegistry.getInstance().getValidator(node.getNodeName());
            if (validator == null) {
                throw new ConfigException(ErrorMsg.NO_SUCH_VALIDATOR_ERROR + node.getNodeName());
            }
            else {
                fieldConfig.addRule(validator.parseRuleConfig(node));
            }
        }
        return fieldConfig;
    }

    // Parse the group config.
    private List<GroupConfig> parseGroupConfig(Element rootEle, List<FieldConfig> fieldConfigs) throws ConfigException {
        Map<String, FieldConfig> configMap = new HashMap<String, FieldConfig>();
        for (FieldConfig config : fieldConfigs) {
            configMap.put(config.getFieldName(), config);
        }
        List<GroupConfig> groupConfigs = new ArrayList<GroupConfig>();
        NodeList groupsNode = rootEle.getElementsByTagName(XMLConfigConstant.ACTIONS);
        if (groupsNode == null || groupsNode.getLength() == 0) {
            return null;
        }
        NodeList groupList = groupsNode.item(0).getChildNodes();
        for (int i = 0; i < groupList.getLength(); i++) {
            Node groupNode = groupList.item(i);
            if (XMLConfigConstant.XCASE.equals(groupNode.getNodeName())) {
                GroupConfig groupConfig = parseGroup(configMap, groupNode);
                if (groupConfig != null) {
                    groupConfigs.add(groupConfig);
                }
            }
        }
        return groupConfigs;
    }

    private GroupConfig parseGroup(Map<String, FieldConfig> configMap, Node groupNode) throws ConfigException {
        GroupConfig groupConfig = new GroupConfig();
        NamedNodeMap attr = groupNode.getAttributes();
        if (attr == null) {
            throw new ConfigException(ErrorMsg.NO_NAME_FOR_GROUP_ELEMENT);
        }
        Node nameNode = attr.getNamedItem(XMLConfigConstant.NAME);
        if (nameNode == null || nameNode.getNodeValue() == null) {
            throw new ConfigException(ErrorMsg.NO_NAME_FOR_GROUP_ELEMENT);
        }
        groupConfig.setName(nameNode.getNodeValue());
        NodeList fieldNodes = groupNode.getChildNodes();
        if (fieldNodes == null || fieldNodes.getLength() <= 1) {
            return null;
        }
        for (int i = 0; i < fieldNodes.getLength(); i++) {
            Node fieldNode = fieldNodes.item(i);
            if (XMLConfigConstant.FIELD.equals(fieldNode.getNodeName())) {
                NamedNodeMap fieldAttr = fieldNode.getAttributes();
                if (fieldAttr == null) {
                    throw new ConfigException(ErrorMsg.CONFIG_ERROR);
                }
                Node nameAttr = fieldAttr.getNamedItem(XMLConfigConstant.NAME);
                if (nameAttr == null) {
                    throw new ConfigException(ErrorMsg.CONFIG_ERROR);
                }
                FieldConfig fieldConfig = configMap.get(nameAttr.getNodeValue());
                if (fieldConfig != null) {
                    groupConfig.addFieldConfig(fieldConfig);
                }
            }
        }
        // check whether the groupConfig is valid
        if (groupConfig.getName() == null || groupConfig.getFieldConfigList() == null
                || groupConfig.getFieldConfigList().size() == 0) {
            return null;
        }
        return groupConfig;
    }

    private List<File> listConfigFile() throws IOException {
        File folder = validateFilesFolder.getFile();
        if (!folder.exists()) {
            throw new FileNotFoundException(ErrorMsg.VALIDATE_FILE_FOLDER_NOT_EXIST);
        }
        File[] files = folder.listFiles();
        List<File> resultFile = new ArrayList<File>();
        for (File file : files) {
            if (file.getPath().endsWith(Constants.VALIDATE_FILE_SUFFIX)) {
                resultFile.add(file);
            }
        }
        return resultFile;
    }

    @Override
    public List<AbstractValidator> resolveValidator() throws Exception {
        File file = validatorsConfig.getFile();
        if (!file.exists()) {
            throw new FileNotFoundException(ErrorMsg.VALIDATOR_CONFIG_FILE_DOES_NOT_EXIST);
        }
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
        return parseValidators(doc);

    }

    /**
     * 将XML配置中节点解析出来返回一个validator的list
     *
     * @param doc
     * @return
     * @throws ConfigException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     */
    private List<AbstractValidator> parseValidators(Document doc) throws ConfigException, InstantiationException,
            IllegalAccessException, ClassNotFoundException {
        NodeList children = doc.getDocumentElement().getChildNodes();
        List<AbstractValidator> validators = new ArrayList<AbstractValidator>();
        for (int i = 0; i < children.getLength(); i++) {
            Node node = children.item(i);
            if (XMLConfigConstant.VALIDATOR.equals(node.getNodeName())) {
                NamedNodeMap attrMap = node.getAttributes();
                Node classNameAttr = attrMap.getNamedItem(XMLConfigConstant.CLASS_NAME);
                if (classNameAttr == null) {
                    throw new ConfigException(ErrorMsg.VALIDATOR_CLASS_NAME_EMPTY);
                }
                String className = classNameAttr.getNodeValue();
                Object obj = Class.forName(className).newInstance();
                if (!(obj instanceof AbstractValidator)) {
                    throw new ConfigException(ErrorMsg.VALIDATOR_BASE_CLASS_ERROR);
                }
                AbstractValidator validator = (AbstractValidator) obj;
                if (validator != null) {
                    validators.add(validator);
                    // 如果XML中指定了name属性，则重置name
                    Node nameAttr = attrMap.getNamedItem(XMLConfigConstant.NAME);
                    if (nameAttr != null) {
                        validator.setName(nameAttr.getNodeValue());
                    }
                    // 如果有property子元素，则赋值给validator
                    NodeList properties = node.getChildNodes();
                    for (int j = 0; j < properties.getLength(); j++) {
                        Node propNode = properties.item(j);
                        if (XMLConfigConstant.PROPERTY.equals(propNode.getNodeName())) {
                            NamedNodeMap propAttr = propNode.getAttributes();
                            Node propName = propAttr.getNamedItem(XMLConfigConstant.NAME);
                            if (propName != null) {
                                String methodName = propName.getNodeValue();
                                methodName = methodName.substring(0, 1).toUpperCase() + methodName.substring(1);
                                BeanUtil.invoke(validator, "set" + methodName, String.class, propNode.getTextContent());
                            }
                        }
                    }
                }
            }
        }
        return validators;
    }
}
