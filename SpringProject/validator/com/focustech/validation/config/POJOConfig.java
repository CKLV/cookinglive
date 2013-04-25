package com.focustech.validation.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Each POJOConfig has a className and several GroupConfig.
 * 
 * @see GroupConfig
 * @author qiangbo
 */
public class POJOConfig {
    private String className;
    private Map<String, GroupConfig> groupConfigMap;

    public POJOConfig(String className) {
        super();
        this.className = className;
        this.groupConfigMap = new HashMap<String, GroupConfig>();
    }

    public Map<String, GroupConfig> getGroupConfigMap() {
        return groupConfigMap;
    }

    public GroupConfig getGroupConfig(String groupName) {
        if (this.groupConfigMap != null && groupName != null) {
            return this.groupConfigMap.get(groupName);
        }
        return null;
    }

    public void setGroupConfigMap(Map<String, GroupConfig> groupConfigMap) {
        this.groupConfigMap = groupConfigMap;
    }

    public String getClassName() {
        return className;
    }

    /**
     * Add a new GroupConfig ,if the name has already existed , it will do nothing. Else the GroupConfig will be added.
     * The groupConfig and its name mustn't be null
     * 
     * @param groupConfig
     */
    public void addGroupConfig(GroupConfig groupConfig) {
        if (groupConfig == null || groupConfig.getName() == null) {
            return;
        }
        if (this.groupConfigMap.get(groupConfig.getName()) == null) {
            this.groupConfigMap.put(groupConfig.getName(), groupConfig);
        }
    }

    /**
     * Put a new GroupConfig,if the name has already existed,the older will be replaced . Else the GroupConfig will be
     * added. The groupConfig and its name mustn't be null.
     * 
     * @param groupConfig
     */
    public void putGroupConfig(GroupConfig groupConfig) {
        if (groupConfig == null || groupConfig.getName() == null) {
            return;
        }
        this.groupConfigMap.put(groupConfig.getName(), groupConfig);
    }

    public void addAll(List<GroupConfig> configs) {
        if (configs == null) {
            return;
        }
        for (GroupConfig config : configs) {
            this.addGroupConfig(config);
        }
    }

    public void putAll(List<GroupConfig> configs) {
        if (configs == null) {
            return;
        }
        for (GroupConfig config : configs) {
            this.putGroupConfig(config);
        }
    }

}
