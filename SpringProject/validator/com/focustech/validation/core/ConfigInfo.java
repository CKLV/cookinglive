package com.focustech.validation.core;

import java.util.HashMap;
import java.util.Map;

import com.focustech.validation.config.ErrorMsg;
import com.focustech.validation.config.POJOConfig;
import com.focustech.validation.exception.ConfigException;

/**
 * When the ValidateContext initialize,it will use a ConfigResolver to resolve the config information,and then they will
 * be stored in this objecy. The ConfigInfo contains several POJOConfigs,each POJOConfig contains several GroupConfigs.
 * Each GroupConfig contains several FieldConfigs.Each FieldConfig contains several RuleConfigs.
 * 
 * @see POJOConfig.
 * @see ValidateContext
 * @see ConfigResolver
 */
public class ConfigInfo {
    private Map<String, POJOConfig> configMap = new HashMap<String, POJOConfig>();

    public Map<String, POJOConfig> getConfigMap() {
        return configMap;
    }

    public void setConfigMap(Map<String, POJOConfig> configMap) {
        this.configMap = configMap;
    }

    /**
     * Add a new pojo Config to the ConfigInfo.
     * 
     * @see POJOConfig
     * @param config The POJOConfig to be added.It must have a className property.And the class it indicates must exist.
     */
    public void addConfig(POJOConfig config) throws ConfigException {
        if (config == null) {
            return;
        }
        if (config.getClassName() == null) {
            throw new ConfigException(ErrorMsg.NO_SUCH_CLASS_ERROR);
        }
        String className = config.getClassName();
        try {
            Class.forName(className);
        }
        catch (ClassNotFoundException e) {
            throw new ConfigException(ErrorMsg.NO_SUCH_CLASS_ERROR + " : " + className);
        }
        this.configMap.put(config.getClassName(), config);
    }

    /**
     * Get the config by class Name.
     * 
     * @param className The class name you want to get.
     * @return The POJOConfig .
     */
    public POJOConfig getConfig(String className) {
        if (className == null) {
            return null;
        }
        return this.configMap.get(className);
    }
}
