package com.focustech.validation.validator;

/**
 * 检查两个字段是否<b>不</b>equal的校验器
 * 
 * @author geliang
 */
public class NotEqualToValidator extends CompareToValidator {
    public NotEqualToValidator() {
        super("notEqualTo");
    }

    @Override
    protected boolean compare(Object obj, Object target) {
        if (obj == null || target == null) {
            if (obj == null && target == null) {
                return false;
            }
            else {
                return true;
            }
        }
        return !obj.equals(target);
    }
}
