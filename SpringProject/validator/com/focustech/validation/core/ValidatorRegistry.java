package com.focustech.validation.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.focustech.validation.config.ErrorMsg;
import com.focustech.validation.exception.ConfigException;

/**
 * The ValidatorRegistr is a singleton. It is used by the ValidateContext. Each validator must be registered in the
 * Registry before being used. 注册需要使用validator.xml来注册
 * 
 * @see AbstractValidator
 * @see ValidateContext
 * @author Paul,geliang
 */
public class ValidatorRegistry {
    private final Map<String, AbstractValidator> validators;
    private static final ValidatorRegistry instance = new ValidatorRegistry();

    // Private constructor ,this is a singleton.
    private ValidatorRegistry() {
        this.validators = new HashMap<String, AbstractValidator>();
    }

    public static ValidatorRegistry getInstance() {
        return instance;
    }

    /**
     * Register the validator in the registry. Each validator should have a unique name.
     * 
     * @param validator The validator to be registered.The validator's name mustn't be null or empty.
     * @param cover When there is a validator has the same name,whether the validator cover the old one.
     * @throws ConfigException When the validator's name is null or empty.
     */
    public void registerValidator(AbstractValidator validator) throws ConfigException {
        if (validator == null) {
            return;
        }
        if (validator.getName() == null || validator.getName().length() == 0) {
            throw new ConfigException(ErrorMsg.VALIDATOR_NAME_EMPTY);
        }
        this.validators.put(validator.getName(), validator);
    }

    /**
     * Register several validators in the registry,when there are name conflict,the old one will be replaced.
     * 
     * @param validators
     * @throws ConfigException
     */
    public void registerValidator(List<AbstractValidator> validators) throws ConfigException {
        if (validators == null) {
            return;
        }
        for (AbstractValidator val : validators) {
            this.registerValidator(val);
        }
    }

    /**
     * Get a validator by name.
     * 
     * @param name The validator's name
     * @return The validator.If the name hasn't been registered,it will return null.
     */
    public AbstractValidator getValidator(String name) {
        if (name == null) {
            return null;
        }
        return this.validators.get(name);
    }
}
