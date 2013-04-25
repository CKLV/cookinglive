package com.focustech.validation.config;

/**
 * The constants used for config file.
 * 
 * @author qiangbo
 */
public class Constants {
    /**
     * Each validate config file name must ends with "-validate.xml"
     */
    public static final String VALIDATE_FILE_SUFFIX = "-validate.xml";
    //
    public static final String TRUE = "true";
    public static final String FALSE = "false";
    /**
     * The file seperate used for windows.
     */
    public static final String FILE_SEPERATE = "/";
    //
    public static final String SEMICOLON = ";";
    /**
     * The name for the number range validator. Other validators can't use this name. Each validator must have a unique
     * name.
     */
    public static final String NUMBER_RANGE_VALIDATOR_NAME = "value";
    /**
     * The name for the date range validator. Other validators can't use this name. Each validator must have a unique
     * name.
     */
    public static final String DATE_RANGE_VALIDATOR_NAME = "date";
    /**
     * The name for the string length range validator. Other validators can't use this name. Each validator must have a
     * unique name.
     */
    public static final String STRING_LENGTH_RANGE_VALIDATOR_NAME = "length";
    /**
     * The name for the collection size range validator. Other validators can't use this name. Each validator must have
     * a unique name.
     */
    public static final String COLLECTION_SIZE_RANGE_VALIDATOR_NAME = "size";
    /**
     * The name for the file validator.Other validators can't use this name. Each validator must have a unique name.
     */
    public static final String File_SIZE_RANGE_VALIDATOR_NAME = "file";
    /**
     * The name for the file type validator.Other validators can't use this name. Each validator must have a unique
     * name.
     */
    public static final String FILE_TYPE_RANGE_VALIDATOR_NAME = "fileType";
    public static final String DOT = ".";
    // level
    public final static String SILVER_LEVEL = "silver";
    public final static String GOLD_LEVEL = "gold";
    public final static String GT_LEVEL = "gt";
    public static final String FREE_LEVEL = "free";
}
