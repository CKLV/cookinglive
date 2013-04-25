package com.focustech.validation.validator;

/**
 * 检查两个字段是否equal的校验器
 * 
 * @author geliang
 */
public class EqualToValidator extends CompareToValidator {

    public EqualToValidator() {
        super("equalTo");
    }

    @Override
    protected boolean compare(Object obj, Object target) {
        if (obj == null || target == null) {
            if (obj == null && target == null) {
                return true;
            }
            else {
                return false;
            }
        }
        return obj.equals(target);
    }

}
