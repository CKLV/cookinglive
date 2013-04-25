package com.focustech.validation.config;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * The POJO field config,each FieldConfig has a name and several RuleConfig.
 * </p>
 * <p>
 * A FieldConfig object is used to represent validator rules for a pojo bean field . Each field may has several rules to
 * be validated.Such as range,pattern and compare.
 * </p>
 * 
 * @see RuleConfig
 * @author qiangbo
 */
public class FieldConfig {
    private List<RuleConfig> rules;
    private String fieldName;

    public List<RuleConfig> getRules() {
        return rules;
    }

    public void setRules(List<RuleConfig> rules) {
        this.rules = rules;
    }

    public void addRule(RuleConfig rule) {
        if (rule == null) {
            return;
        }
        this.rules.add(rule);
    }

    public void addRules(List<RuleConfig> rules) {
        if (rules == null) {
            return;
        }
        this.rules.addAll(rules);
    }

    public String getFieldName() {
        return fieldName;
    }

    public FieldConfig(String fieldName) {
        super();
        this.fieldName = fieldName;
        this.rules = new ArrayList<RuleConfig>();
    }
}
