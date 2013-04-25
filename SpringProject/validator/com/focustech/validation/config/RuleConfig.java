package com.focustech.validation.config;

import java.util.HashMap;

/**
 * @author geliang
 * @author taofucheng
 */
public class RuleConfig {
    private ValidateResult msg;
    private final HashMap<String, String> param = new HashMap<String, String>();
    private String validatorName;
    private String forLevel;

    public String getForLevel() {
        return forLevel;
    }

    public void setForLevel(String forLevel) {
        this.forLevel = forLevel;
    }

    public HashMap<String, String> getParam() {
        return param;
    }

    public Object getParam(String name) {
        return this.param.get(name);
    }

    public void addParam(String name, String value) {
        this.param.put(name, value);
    }

    public ValidateResult getValidateResult() {
        return msg;
    }

    public void setMsg(ValidateResult msg) {
        this.msg = msg;
    }

    public String getValidatorName() {
        return validatorName;
    }

    public void setValidatorName(String validatorName) {
        this.validatorName = validatorName;
    }
}
