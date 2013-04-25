package com.focustech.validation.validator;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.focustech.validation.config.RuleConfig;
import com.focustech.validation.core.AbstractValidator;
import com.focustech.validation.util.BeanUtil;

/**
 * 检查字段的字符串值是否符合正则表达式的校验器
 * 
 * @author geliang
 */
public class RegValidator extends AbstractValidator {
    protected String reg;
    protected boolean reverse = false;

    public RegValidator() {
        super("reg");
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    /**
     * 是否反向验证，即当正则符合时，返回false
     * 
     * @param reverse
     */
    public void setReverse(String reverse) {
        this.reverse = Boolean.parseBoolean(reverse);
    }

    @Override
    public boolean validate(Object pojo, String fieldName, RuleConfig ruleConfig) {
        if (pojo == null || fieldName == null || ruleConfig == null) {
            return false;
        }
        Object obj = BeanUtil.getPropertyValue(pojo, fieldName);
        if (obj == null) {
            return true;
        }
        if (obj instanceof String) {
            String value = (String) obj;
            value = StringUtils.trimToEmpty(value);
            if (StringUtils.isEmpty(value)) {
                return true;
            }
            if (reverse) {
                return !Pattern.compile(reg, Pattern.DOTALL).matcher(value).matches();
            }
            else {
                return Pattern.compile(reg, Pattern.DOTALL).matcher(value).matches();
            }
        }
        return false;
    }

}
