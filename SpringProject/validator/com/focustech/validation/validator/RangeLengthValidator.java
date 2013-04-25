package com.focustech.validation.validator;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.focustech.validation.config.ErrorMsg;
import com.focustech.validation.config.RuleConfig;
import com.focustech.validation.core.AbstractValidator;
import com.focustech.validation.exception.ConfigException;
import com.focustech.validation.util.BeanUtil;

/**
 * 检验字符串长度必须在某个范围内的校验器<br>
 * 注意如果此字段为null，则为判断为通过校验
 * 
 * @author geliang
 */
public class RangeLengthValidator extends AbstractValidator {

    public RangeLengthValidator() {
        super("rangelength");
    }

    @Override
    public boolean validate(Object pojo, String fieldName, RuleConfig ruleConfig) {
        if (pojo == null || fieldName == null || ruleConfig == null) {
            return true;
        }
        String min = (String) ruleConfig.getParam("min");
        String max = (String) ruleConfig.getParam("max");
        Object value = BeanUtil.getPropertyValue(pojo, fieldName);
        if (value == null) {
            return true;
        }
        int length = String.valueOf(value).length();
        return notLongerThanMax(length, max) && notShorterThanMin(length, min);
    }

    @Override
    public RuleConfig parseRuleConfig(Node node) throws ConfigException {
        RuleConfig ruleConfig = super.parseRuleConfig(node);
        NamedNodeMap attrs = node.getAttributes();
        Node minAttr = attrs.getNamedItem("min");
        Node maxAttr = attrs.getNamedItem("max");
        if (minAttr == null || maxAttr == null) {
            throw new ConfigException(ErrorMsg.RULE_ELEMENT_EMPTY + "no min/max for rangelength");
        }
        ruleConfig.addParam("min", minAttr.getNodeValue());
        ruleConfig.addParam("max", maxAttr.getNodeValue());
        return ruleConfig;
    }

    private boolean notLongerThanMax(int length, String max) {
        if (max == null) {
            return true;
        }
        int maxInt = Integer.valueOf(max);
        return length <= maxInt;
    }

    private boolean notShorterThanMin(int length, String min) {
        if (min == null) {
            return true;
        }
        int minInt = Integer.valueOf(min);
        return length >= minInt;
    }

}
