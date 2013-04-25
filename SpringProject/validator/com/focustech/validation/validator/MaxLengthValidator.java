package com.focustech.validation.validator;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.focustech.validation.config.ErrorMsg;
import com.focustech.validation.config.RuleConfig;
import com.focustech.validation.exception.ConfigException;

/**
 * 检验字段字符串长度最大是否超过MAX的校验器<br>
 * 注意如果此字段为null，则为判断为通过校验
 * 
 * @author geliang
 */
public class MaxLengthValidator extends RangeLengthValidator {
    public MaxLengthValidator() {
        setName("maxlength");
    }

    @Override
    public RuleConfig parseRuleConfig(Node node) throws ConfigException {
        RuleConfig ruleConfig = createRuleConfig(node);
        NamedNodeMap attrs = node.getAttributes();
        Node paramNode = attrs.getNamedItem("param");
        if (paramNode == null) {
            throw new ConfigException(ErrorMsg.RULE_ELEMENT_EMPTY + "no param for maxlength");
        }
        ruleConfig.addParam("max", paramNode.getNodeValue());
        return ruleConfig;
    }
}
