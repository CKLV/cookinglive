package com.focustech.validation.config;

public class ErrorMsg {
    // config error
    public static final String VALIDATE_FILE_FOLDER_NOT_EXIST = "Sorry,the validate file folder doesn't exist!";
    public static final String VALIDATOR_CONFIG_FILE_DOES_NOT_EXIST =
            "Sorry,the validator config file doesn't exist!You must get it before initializing the context!";
    public static final String CONFIG_ERROR = "Config error!";
    public static final String NO_CONTEXT_ERROR = "Sorry,you must set a context before validate!";
    public static final String NO_SUCH_CLASS_ERROR =
            "Sorry,the class name you specify doesn't exist! Check the class for the name: ";
    // validator error
    public static final String VALIDATOR_NAME_EMPTY = "Sorry,you must specify a name for the validator!";
    public static final String VALIDATOR_CLASS_NAME_EMPTY = "Sorry,you must specify a class name for the validator!";
    public static final String NO_SUCH_VALIDATOR_ERROR = "There is no such validator called :";
    public static final String VALIDATOR_BASE_CLASS_ERROR =
            "Sorry,the custom validator must derive form AbstractValidator,please view your validator impelment.";
    // xml parse error
    public static final String NO_FIELDS_ELEMENT =
            "Sorry,the config file isn't valid.Maybe you forget the 'fileds' element.";
    public static final String NO_FIELD_ELEMENT =
            "Sorry,the config file isn't valid.Maybe you forget the 'filed' element.";
    public static final String NO_NAME_PROPERTY_FOR_FIELD =
            "Sorry,the config file isn't valid.Maybe you forget the 'name' property for the 'field' element.";
    public static final String RULE_ELEMENT_EMPTY = "Sorry,maybe you forget the property for the rule elements:";
    public static final String NO_ERROR_TIP = "Error tip for field elements can't be empty!";
    public static final String NO_NAME_FOR_GROUP_ELEMENT = "Sorry,every group element must has a name!";
}
