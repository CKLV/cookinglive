package com.focustech.validation.exception;

public class ConfigException extends Exception {

    /**
	 *
	 */
    private static final long serialVersionUID = 1L;

    public ConfigException(String emptyValidatorName) {
        super(emptyValidatorName);
    }

}
