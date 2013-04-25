package com.focustech.validation.core;

import org.apache.commons.lang.StringUtils;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.focustech.validation.config.ErrorMsg;
import com.focustech.validation.config.RuleConfig;
import com.focustech.validation.config.ValidateResult;
import com.focustech.validation.config.XMLConfigConstant;
import com.focustech.validation.exception.ConfigException;

/**
 * <p>
 * The base class for all Validator,each validator must have a unique name. The validator may contain some parameters.
 * All validators has a compareAll property,only when the value is a array,this property will take effect. It indicates
 * whether each element of the array need to be validated.
 * </p>
 * <p>
 * Users can implement their own validators. All validators must extend from the AbstractValidator or its subclass. And
 * then the validator must by configed in the validator-config.xml file. Finally,it can be used in the validate config
 * file by the customeValidator element.
 * </p>
 * 
 * @author qiangbo
 */
public abstract class AbstractValidator {
    private String name;
    private boolean compareAll = true;

    /**
     * Every validator has this property.
     * 
     * @return Whether each element of the array need to be validated.
     */
    public boolean isCompareAll() {
        return compareAll;
    }

    public void setCompareAll(boolean compareAll) {
        this.compareAll = compareAll;
    }

    /**
     * You need to specify a unique name for every validator.
     * 
     * @param name The validator's name.
     */
    public AbstractValidator(String name) {
        super();
        this.name = name;
    }

    /**
     * Get the validator's name.
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The validate method is used to validate rules.
     * 
     * @param value The pojo bean need to be validated.
     * @param fieldName The field name of the bean need to be validated.
     * @param ruleConfig ruleconfig
     * @return Whether the validation is successful.
     */
    public abstract boolean validate(Object pojo, String fieldName, RuleConfig ruleConfig);

    /**
     * 从XML节点中解析出rule config规则
     * 
     * @param node
     * @return
     * @throws ConfigException
     */
    public RuleConfig parseRuleConfig(Node node) throws ConfigException {
        return createRuleConfig(node);
    }

    /**
     * 根据节点创建ruleConfig对象，设置基本的属性
     * 
     * @param ruleNode
     * @return
     * @throws ConfigException
     */
    protected RuleConfig createRuleConfig(Node ruleNode) throws ConfigException {
        RuleConfig ruleConfig = new RuleConfig();
        ruleConfig.setMsg(parseErrorMsg(ruleNode));
        ruleConfig.setValidatorName(getName());
        return ruleConfig;
    }

    /**
     * 从XML节点中解析出错误提示信息
     * 
     * @param ruleNode
     * @return
     * @throws ConfigException
     */
    protected ValidateResult parseErrorMsg(Node ruleNode) throws ConfigException {
        ValidateResult result = new ValidateResult();
        NodeList children = ruleNode.getChildNodes();
        if (children == null) {
            throw new ConfigException(ErrorMsg.NO_ERROR_TIP);
        }
        else {
            for (int i = 0; i < children.getLength(); i++) {
                Node attrNode = children.item(i);
                if (attrNode.getNodeName().startsWith(XMLConfigConstant.ERROR_TIP)) {
                    String name = attrNode.getNodeName();
                    String lan = name.substring(XMLConfigConstant.ERROR_TIP.length());
                    String msg = StringUtils.trimToEmpty(attrNode.getTextContent());
                    msg = replaceErrorTip(msg, ruleNode);
                    if (StringUtils.isNotBlank(msg)) {
                        result.addErrorMsg(lan, msg);
                    }
                }
            }
        }
        if (result.isErrorsEmpty()) {
            throw new ConfigException(ErrorMsg.NO_ERROR_TIP);
        }
        return result;
    }

    /**
     * 替换error信息中的动态内容
     * 
     * @return
     */
    protected String replaceErrorTip(String msg, Node ruleNode) {
        NamedNodeMap attrs = ruleNode.getAttributes();
        for (int i = 0; i < attrs.getLength(); i++) {
            Node attr = attrs.item(i);
            msg = msg.replaceAll("\\{" + i + "\\}", attr.getNodeValue());
        }
        return msg;
    }
}
