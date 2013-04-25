package com.focustech.validation.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.focustech.validation.config.Constants;

public class BeanUtil {
    public static Object getPropertyValue(Object bean, String fieldName) {
        if (StringUtil.isEmpty(fieldName) || bean == null) {
            return null;
        }
        if (fieldName.contains(Constants.DOT)) {
            String[] fieldNames = fieldName.split("\\.");
            Object refBean = bean;
            for (int i = 0; i < fieldNames.length; i++) {
                refBean = getPropertyValueByFieldName(refBean, fieldNames[i]);
                if (refBean == null) {
                    return null;
                }
            }
            return refBean;
        }
        else {
            return getPropertyValueByFieldName(bean, fieldName);
        }
    }

    private static Object getPropertyValueByFieldName(Object bean, String fieldName) {
        try {
            String methodName = "get" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1);
            Method getMethod;
            getMethod = bean.getClass().getMethod(methodName);
            if (getMethod == null) {
                return null;
            }
            Object result = getMethod.invoke(bean);
            return result;
        }
        catch (SecurityException e) {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Judge whether a object is a number. Byte,Double,Float,Integer,Long,Short are all numbers. Others aren't.
     * 
     * @param obj
     * @return
     */
    public static boolean isNumber(Object obj) {
        String className = obj.getClass().getName();
        boolean byteObj = Byte.class.getName().equals(className);
        boolean doubleObj = Double.class.getName().equals(className);
        boolean floatObj = Float.class.getName().equals(className);
        boolean intObj = Integer.class.getName().equals(className);
        boolean longObj = Long.class.getName().equals(className);
        boolean shortObj = Short.class.getName().equals(className);
        return byteObj || doubleObj || floatObj || intObj || longObj || shortObj;
    }

    /**
     * Call a method on the object with one argument.
     * 
     * @param obj the object to invoke the method on.
     * @param methodName the name of the method to call
     * @param argType the type of argument.
     * @param arg the value of the argument.
     * @return the object returned by the method
     */
    @SuppressWarnings("rawtypes")
    public static Object invoke(Object obj, String methodName, Class argType, Object arg) {
        try {
            Method method;
            method = obj.getClass().getMethod(methodName, new Class[]{argType});
            return method.invoke(obj, new Object[]{arg});
        }
        catch (Exception t) {
            return null; // NotReached
        }
    }
}
