package com.focustech.validation.config;

import java.util.HashMap;
import java.util.Map;

import com.focustech.validation.core.AbstractValidator;

/**
 * <p>
 * Parameter is used for validators. Different validators may need different parameters. For example,all validators need
 * the 'compareAll' parameter. The range validators need the 'min' and 'max' parameter. The compare validaor need target
 * and comparison parameter.
 * </p>
 * The parameter is used to store config values in the config file. And then passed to the correspond validators when
 * validation.
 * 
 * @see AbstractValidator
 * @author qiangbo
 */
public class Parameter {
    private Map<String, String> content = new HashMap<String, String>();

    public String getMin() {
        return this.content.get(XMLConfigConstant.MIN);
    }

    public void setMin(String min) {
        this.content.put(XMLConfigConstant.MIN, min);
    }

    public String getMax() {
        return this.content.get(XMLConfigConstant.MAX);
    }

    public void setMax(String max) {
        this.content.put(XMLConfigConstant.MAX, max);
    }

    public boolean getCompareAll() {
        String compareAll = this.content.get(XMLConfigConstant.COMPARE_ALL);
        if (compareAll == null) {
            return true;
        }
        if (Constants.FALSE.equals(compareAll)) {
            return false;
        }
        return true;
    }

    public void setCompareAll(String compareAll) {
        this.content.put(XMLConfigConstant.COMPARE_ALL, compareAll);
    }

    public boolean getReverse() {
        String reverse = this.content.get(XMLConfigConstant.REVERSE);
        if (reverse == null) {
            return false;
        }
        if (Constants.TRUE.equals(reverse)) {
            return true;
        }
        return false;
    }

    public void setReverse(String reverse) {
        this.content.put(XMLConfigConstant.REVERSE, reverse);
    }

    public void setSetting(String set) {
        this.content.put(XMLConfigConstant.SETTING, set);
    }

    public String getSetting() {
        return this.content.get(XMLConfigConstant.SETTING);
    }

    public String getType() {
        return this.content.get(XMLConfigConstant.TYPE);
    }

    public void setType(String type) {
        this.content.put(XMLConfigConstant.TYPE, type);
    }

    public String getComparison() {
        return this.content.get(XMLConfigConstant.COMPARISION);
    }

    public void setComparison(String comparison) {
        this.content.put(XMLConfigConstant.COMPARISION, comparison);
    }

    public String getTarget() {
        return this.content.get(XMLConfigConstant.TARGET);
    }

    public void setTarget(String target) {
        this.content.put(XMLConfigConstant.TARGET, target);
    }

    public void setEnum(String enumeration) {
        this.content.put(XMLConfigConstant.ENUM, enumeration);
    }

    public String getEnum() {
        return this.content.get(XMLConfigConstant.ENUM);
    }
}
