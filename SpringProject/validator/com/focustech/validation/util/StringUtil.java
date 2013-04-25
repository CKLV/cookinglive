package com.focustech.validation.util;

public class StringUtil {
    public static boolean isEmpty(String str) {
        if (str == null) {
            return true;
        }
        if (str.trim().length() == 0) {
            return true;
        }
        return false;
    }

}
