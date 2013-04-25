package com.focustech.validation.validator;

import java.util.AbstractMap;

import com.focustech.validation.config.RuleConfig;
import com.focustech.validation.core.AbstractValidator;
import com.focustech.validation.util.BeanUtil;

/**
 * 字段不为空的校验器，可以校验字符串、数组、hash
 * 
 * @author geliang
 */
public class RequiredValidator extends AbstractValidator {

    public RequiredValidator() {
        super("required");
    }

    @SuppressWarnings("rawtypes")
    @Override
    public boolean validate(Object pojo, String fieldName, RuleConfig ruleConfig) {
        if (pojo == null || fieldName == null || ruleConfig == null) {
            return true;
        }
        Object value = BeanUtil.getPropertyValue(pojo, fieldName);
        if (value == null) {
            return false;
        }
        if (value.getClass().isArray()) {
            Object[] arr = (Object[]) value;
            return arr.length > 0;
        }
        else if (Iterable.class.isAssignableFrom(value.getClass())) {
            Iterable lst = (Iterable) value;
            return lst.iterator().hasNext();
        }
        else if (AbstractMap.class.isAssignableFrom(value.getClass())) {
            AbstractMap map = (AbstractMap) value;
            return map.isEmpty();
        }
        else {
            String strVal = String.valueOf(value);
            return strVal.length() > 0;
        }
    }
}
