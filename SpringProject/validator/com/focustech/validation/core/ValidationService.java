package com.focustech.validation.core;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.focustech.validation.config.ErrorMsg;
import com.focustech.validation.config.FieldConfig;
import com.focustech.validation.config.GroupConfig;
import com.focustech.validation.config.POJOConfig;
import com.focustech.validation.config.RuleConfig;
import com.focustech.validation.config.ValidateResult;
import com.focustech.validation.exception.ConfigException;

/**
 * The framework service Object. User will use this object to validate.
 * 
 * @see ValidationContext
 * @see AbstractValidator
 */
public class ValidationService {
    private ValidationContext context;
    private Locale locale = Locale.getDefault();

    /**
     * The locale contained in the ValidateService.
     * 
     * @return The locale contained in the ValidateService.If the user doesn't specify,the locale is the current JVM's
     *         locale.
     */
    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    /**
     * Set the default locale for the ValidateService.
     * 
     * @see java.util.Locale
     * @param lan The lan must refer to a ISO 639 language.
     */
    public void setLocale(String lan) {
        if (lan == null || lan.length() != 2) {
            return;
        }
        locale = new Locale(lan);
    }

    public ValidationContext getContext() {
        return context;
    }

    public ValidationService(ValidationContext context) throws ConfigException {
        super();
        if (context == null) {
            throw new ConfigException(ErrorMsg.NO_CONTEXT_ERROR);
        }
        this.context = context;
    }

    public void setContext(ValidationContext context) {
        this.context = context;
    }

    /**
     * Validate the pojo bean.
     * 
     * @param pojoBean The bean need to be validated.
     * @param groupName Validate Group
     * @param locale The locale is used for the error message.If it is null,the default locale will be used
     * @return 如果没有错误信息，将返回null，否则返回有元素的有序hash
     */
    public Map<String, String> validate(Object pojoBean, String groupName, Locale locale) {
        if (locale == null) {
            locale = this.locale;
        }
        ConfigInfo configInfo = context.getConfigInfo();
        if (configInfo == null) {
            return null;
        }
        String className = pojoBean.getClass().getName();
        POJOConfig pojoConfig = configInfo.getConfig(className);
        if (pojoConfig == null) {
            return null;
        }
        GroupConfig groupConfig = pojoConfig.getGroupConfig(groupName);
        if (groupConfig == null) {
            return null;
        }
        List<FieldConfig> fieldConfigs = groupConfig.getFieldConfigList();
        if (fieldConfigs == null) {
            return null;
        }
        Map<String, String> result = new LinkedHashMap<String, String>();
        for (FieldConfig fieldConfig : fieldConfigs) {
            ValidateResult validateResult = validateFieldConfig(pojoBean, fieldConfig, null);
            if (validateResult != null) {
                result.put(fieldConfig.getFieldName(), validateResult.getErrorMsg(locale));
            }
        }
        if (result.keySet().size() == 0) {
            return null;
        }
        return result;
    }

    private ValidateResult validateFieldConfig(Object pojoBean, FieldConfig fieldConfig, String level) {
        if (fieldConfig == null) {
            return null;
        }
        List<RuleConfig> ruleConfigList = fieldConfig.getRules();
        for (RuleConfig ruleConfig : ruleConfigList) {
            if (level != null && ruleConfig.getForLevel() != null && !ruleConfig.getForLevel().contains(level)) {
                continue;
            }
            AbstractValidator validator = ValidatorRegistry.getInstance().getValidator(ruleConfig.getValidatorName());
            if (!validator.validate(pojoBean, fieldConfig.getFieldName(), ruleConfig)) {
                return ruleConfig.getValidateResult();
            }
        }
        return null;
    }

    public Map<String, String> validate(Object pojoBean, String groupName, Locale locale, String level)
            throws Exception {
        if (context == null) {
            throw new ConfigException(ErrorMsg.NO_CONTEXT_ERROR);
        }
        if (locale == null) {
            locale = this.locale;
        }
        ConfigInfo configInfo = context.getConfigInfo();
        if (configInfo == null) {
            return null;
        }
        String className = pojoBean.getClass().getName();
        POJOConfig pojoConfig = configInfo.getConfig(className);
        if (pojoConfig == null) {
            return null;
        }
        GroupConfig groupConfig = pojoConfig.getGroupConfig(groupName);
        if (groupConfig == null) {
            return null;
        }
        List<FieldConfig> fieldConfigs = groupConfig.getFieldConfigList();
        if (fieldConfigs == null) {
            return null;
        }
        Map<String, String> result = new LinkedHashMap<String, String>();
        for (FieldConfig fieldConfig : fieldConfigs) {
            ValidateResult validateResult = validateFieldConfig(pojoBean, fieldConfig, level);
            if (validateResult != null) {
                result.put(fieldConfig.getFieldName(), validateResult.getErrorMsg(locale));
            }
        }
        if (result.keySet().size() == 0) {
            return null;
        }
        return result;
    }
}
