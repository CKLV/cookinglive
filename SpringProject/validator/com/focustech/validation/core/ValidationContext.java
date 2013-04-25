package com.focustech.validation.core;

import java.util.List;

/**
 * The validate context. This object contains the ConfigInfo, and it needs a ConfigResolver to resolve the validate
 * config.
 * 
 * @see ConfigResolver
 * @see ConfigInfo
 * @author Paul
 */
public class ValidationContext {
    private ConfigInfo configInfo;

    /**
     * The constructor for the ValidateContext.You must have a ConfigResolver. It will use the resolver to resolve
     * validators and configurations. The validators will all be registered in the ValidatorRegistry. And the
     * configurations will be stored in the ConfigInfo object.
     */
    public ValidationContext(ConfigResolver resolver) {
        super();
        try {
            this.initializeContext(resolver);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Get the ConfigIno.
     * 
     * @return
     */
    public ConfigInfo getConfigInfo() {
        return configInfo;
    }

    public void setConfigInfo(ConfigInfo configInfo) {
        this.configInfo = configInfo;
    }

    private void initializeContext(ConfigResolver resolver) throws Exception {
        List<AbstractValidator> validators = resolver.resolveValidator();
        ValidatorRegistry.getInstance().registerValidator(validators);
        this.configInfo = resolver.resolveConfig();
    }
}
