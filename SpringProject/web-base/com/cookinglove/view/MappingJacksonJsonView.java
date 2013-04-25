package com.cookinglove.view;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;

/**
 * 修改jackson json的view实现，修改两点<br/>
 * <ul>
 * <li>取消基本无用的renderedAttributes白名单而代之以 excludeAttributes黑名单，可以在XML里面设置</li>
 * <li>如果model里面只含有一个键值对，则只将这个值渲染为JSON，也就是说生成的JSON可以是数组、布尔、数字、字符串等等，而不仅仅是object</li>
 * </ul>
 * 
 * @author geliang
 * 
 */
public class MappingJacksonJsonView extends
		org.springframework.web.servlet.view.json.MappingJacksonJsonView {

	private Set<String> excludeAttributes;

	public Set<String> getExcludeAttributes() {
		return excludeAttributes;
	}

	public void setExcludeAttributes(Set<String> renderedAttributes) {
		this.excludeAttributes = renderedAttributes;
	}

	@Override
	protected Object filterModel(Map<String, Object> model) {
		Map<String, Object> result = new HashMap<String, Object>(model.size());
		Set<String> excludeAttributes = !CollectionUtils
				.isEmpty(this.excludeAttributes) ? this.excludeAttributes
				: new HashSet<String>();
		for (Map.Entry<String, Object> entry : model.entrySet()) {
			if (!(entry.getValue() instanceof BindingResult)
					&& !(excludeAttributes.contains(entry.getKey()))) {
				result.put(entry.getKey(), entry.getValue());
			}
		}
		// 如果只有一个键值对，则只渲染值
		if (result.size() == 1) {
			return result.values().iterator().next();
		} else {
			return result;
		}
	}
}
