package com.focustech.validation.validator;

import java.lang.reflect.Array;
import java.math.BigDecimal;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.focustech.validation.config.ErrorMsg;
import com.focustech.validation.config.RuleConfig;
import com.focustech.validation.core.AbstractValidator;
import com.focustech.validation.exception.ConfigException;
import com.focustech.validation.util.BeanUtil;

/**
 * 检查字段的数字值是否在min和max之间的校验器
 * 
 * @author geliang
 */
public class RangeValidator extends AbstractValidator {

    public RangeValidator() {
        super("range");
    }

    @Override
    public boolean validate(Object pojo, String fieldName, RuleConfig ruleConfig) {
        if (pojo == null || fieldName == null || ruleConfig == null) {
            return true;
        }
        Object value = BeanUtil.getPropertyValue(pojo, fieldName);
        if (value == null) {
            return true;
        }
        String min = (String) ruleConfig.getParam("min");
        String max = (String) ruleConfig.getParam("max");
        if (!value.getClass().isArray()) {
            return validateSingleValue(value, min, max);
        }
        else if (value.getClass().isArray()) {
            if (super.isCompareAll()) {
                return compareAll(value, min, max);
            }
            else {
                return compareOne(value, min, max);
            }
        }
        return false;
    }

    @Override
    public RuleConfig parseRuleConfig(Node node) throws ConfigException {
        RuleConfig ruleConfig = super.parseRuleConfig(node);
        NamedNodeMap attrs = node.getAttributes();
        Node minAttr = attrs.getNamedItem("min");
        Node maxAttr = attrs.getNamedItem("max");
        if (minAttr == null || maxAttr == null) {
            throw new ConfigException(ErrorMsg.RULE_ELEMENT_EMPTY + "no min/max for range");
        }
        ruleConfig.addParam("min", minAttr.getNodeValue());
        ruleConfig.addParam("max", maxAttr.getNodeValue());
        return ruleConfig;
    }

    private boolean validateSingleValue(Object value, String min, String max) {
        if ((value instanceof String)) {
            BigDecimal theValue = new BigDecimal(0);
            try {
                theValue = new BigDecimal((String) value);
            }
            catch (NumberFormatException e) {
                return true;
            }
            return this.validate(theValue, min, max);
        }
        if (value instanceof Integer) {
            BigDecimal theValue = new BigDecimal((Integer) value);
            return this.validate(theValue, min, max);
        }
        if (value instanceof Byte) {
            BigDecimal theValue = new BigDecimal((Byte) value);
            return this.validate(theValue, min, max);
        }
        if (value instanceof Float) {
            BigDecimal theValue = new BigDecimal((Float) value);
            return this.validate(theValue, min, max);
        }
        if (value instanceof Long) {
            BigDecimal theValue = new BigDecimal((Long) value);
            return this.validate(theValue, min, max);
        }
        if (value instanceof Short) {
            BigDecimal theValue = new BigDecimal((Short) value);
            return this.validate(theValue, min, max);
        }
        if (value instanceof Double) {
            BigDecimal theValue = new BigDecimal((Double) value);
            return this.validate(theValue, min, max);
        }
        return false;
    }

    private boolean compareOne(Object array, String min, String max) {
        boolean result = false;
        for (int index = 0; index < Array.getLength(array); index++) {
            Object item = Array.get(array, index);
            result = result || this.validateSingleValue(item, min, max);
            if (result) {
                return true;
            }
        }
        return false;
    }

    private boolean compareAll(Object array, String min, String max) {
        boolean result = true;
        for (int index = 0; index < Array.getLength(array); index++) {
            String item = (String) Array.get(array, index);
            result = result && this.validateSingleValue(item, min, max);
            if (!result) {
                return result;
            }
        }
        return true;
    }

    private boolean validate(BigDecimal value, String min, String max) {
        return this.notGreaterThanMax(value, max) && this.notLessThanMin(value, min);
    }

    private boolean notGreaterThanMax(BigDecimal value, String max) {
        if (max == null) {
            return true;
        }
        int result = value.compareTo(new BigDecimal(max));
        return result == -1 || result == 0;
    }

    private boolean notLessThanMin(BigDecimal value, String min) {
        if (min == null) {
            return true;
        }
        int result = value.compareTo(new BigDecimal(min));
        return result == 1 || result == 0;
    }
}
