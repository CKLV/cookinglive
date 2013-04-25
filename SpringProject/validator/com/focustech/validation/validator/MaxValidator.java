package com.focustech.validation.validator;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.focustech.validation.config.ErrorMsg;
import com.focustech.validation.config.RuleConfig;
import com.focustech.validation.exception.ConfigException;

/**
 * 检查字段的数字值最大为max的校验器
 * 
 * @author geliang
 */
public class MaxValidator extends RangeValidator {

    public MaxValidator() {
        setName("max");
    }

    @Override
    public RuleConfig parseRuleConfig(Node node) throws ConfigException {
        RuleConfig ruleConfig = createRuleConfig(node);
        NamedNodeMap attrs = node.getAttributes();
        Node paramNode = attrs.getNamedItem("param");
        if (paramNode == null) {
            throw new ConfigException(ErrorMsg.RULE_ELEMENT_EMPTY + "no param for max");
        }
        ruleConfig.addParam("max", paramNode.getNodeValue());
        return ruleConfig;
    }
}
