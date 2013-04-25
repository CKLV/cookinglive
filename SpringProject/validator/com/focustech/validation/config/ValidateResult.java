package com.focustech.validation.config;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * The ValidateResult contains multiple error messages and their locals. Users can get the error message by the local.If
 * the local doesn't exist ,it will return the message by the default local.(The current JVM local.)
 * 
 * @author Paul
 */
public class ValidateResult {
    private final Map<String, String> errorMsg;
    private Locale defaultLocal;

    public ValidateResult() {
        this.defaultLocal = Locale.getDefault();
        errorMsg = new HashMap<String, String>();
    }

    public Locale getDefaultLocal() {
        return defaultLocal;
    }

    /**
     * The default local is the current JVM's locale. User can also set the default local.
     * 
     * @param defaultLocal The local user specifies.
     */
    public void setDefaultLocal(Locale defaultLocal) {
        this.defaultLocal = defaultLocal;
    }

    /**
     * @return The erorr message by the defualt local.
     */
    public String getErrorMsg() {
        return this.errorMsg.get(this.defaultLocal.getLanguage());
    }

    /**
     * Get the error message by locale. If the locale doesn't exist in the ValidateRusult object ,it will try to return
     * the error message by the default locale.
     * 
     * @param locale
     * @return
     */
    public String getErrorMsg(Locale locale) {
        String msg = this.errorMsg.get(locale.getLanguage());
        if (msg == null) {
            msg = this.errorMsg.get(defaultLocal.getLanguage());
        }
        return msg;
    }

    /**
     * Add a new error message by the language. You can get the language by ISO 639. If the language doesn't exist,the
     * error message will be added by the default locale.
     * 
     * @see Locale
     * @param lan The language.
     * @param msg The error message.
     */
    public void addErrorMsg(String lan, String msg) {
        if (msg == null || msg.length() == 0) {
            return;
        }
        if (lan == null || lan.length() != 2) {
            this.errorMsg.put(this.defaultLocal.getLanguage(), msg);
        }
        else {
            lan = lan.toLowerCase();
            this.errorMsg.put(lan, msg);
        }
    }

    /**
     * Add an error message by the locale.
     * 
     * @param local The locale.
     * @param msg The error message.
     */
    public void addErrorMsg(Locale local, String msg) {
        this.addErrorMsg(local.getLanguage(), msg);
    }

    /**
     * 错误信息hash是否为空
     * 
     * @return
     */
    public boolean isErrorsEmpty() {
        return errorMsg.isEmpty();
    }
}
