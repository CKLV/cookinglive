package com.focustech.validation.validator;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.focustech.validation.config.ErrorMsg;
import com.focustech.validation.config.RuleConfig;
import com.focustech.validation.core.AbstractValidator;
import com.focustech.validation.exception.ConfigException;
import com.focustech.validation.util.BeanUtil;

/**
 * 比较验证的抽象类，子类有EqualTo，NotEqualTo等等
 * 
 * @author geliang
 */
public abstract class CompareToValidator extends AbstractValidator {

    public CompareToValidator(String name) {
        super(name);
    }

    @Override
    public boolean validate(Object pojo, String fieldName, RuleConfig ruleConfig) {
        if (pojo == null || fieldName == null || ruleConfig == null) {
            return false;
        }
        String targetFieldName = (String) ruleConfig.getParam("target");
        Object obj = BeanUtil.getPropertyValue(pojo, fieldName);
        Object targetObj = BeanUtil.getPropertyValue(pojo, targetFieldName);
        return compare(obj, targetObj);
    }

    @Override
    public RuleConfig parseRuleConfig(Node node) throws ConfigException {
        RuleConfig ruleConfig = super.parseRuleConfig(node);
        NamedNodeMap attrs = node.getAttributes();
        Node targetNode = attrs.getNamedItem("target");
        if (targetNode == null) {
            throw new ConfigException(ErrorMsg.RULE_ELEMENT_EMPTY + "no target for " + getName());
        }
        ruleConfig.addParam("target", targetNode.getNodeValue());
        return ruleConfig;
    }

    /**
     * 具体的比较运算
     * 
     * @param obj
     * @param target
     * @return
     */
    protected abstract boolean compare(Object obj, Object target);

}
