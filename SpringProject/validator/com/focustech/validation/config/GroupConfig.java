package com.focustech.validation.config;

import java.util.ArrayList;
import java.util.List;

/**
 * Each GroupConfig has a name and several FieldConfig. A group maybe correspond to a form. For example,a register form
 * may contain a name,password and other information.They are all in one group.
 * 
 * @see FieldConfig
 * @see POJOConfig
 * @author qiangbo
 */
public class GroupConfig {
    private List<FieldConfig> fieldConfigList = new ArrayList<FieldConfig>();
    private String name;

    public void addFieldConfig(FieldConfig config) {
        if (config == null) {
            return;
        }
        this.fieldConfigList.add(config);
    }

    public List<FieldConfig> getFieldConfigList() {
        return fieldConfigList;
    }

    public void setFieldConfigList(List<FieldConfig> fieldConfigList) {
        this.fieldConfigList = fieldConfigList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
