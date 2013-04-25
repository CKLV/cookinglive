package com.focustech.cookinglove.tool;

import java.util.Map;

import com.focustech.cookinglove.base.Page;

public class ReflectHelper {
	
	public static Object isPage(Object object,String fieldName){
		if(object instanceof Page){
			return object;
		}
		else if(object instanceof Map){
			Map map=(Map) object;
			return map.get(fieldName);
		}
		else{
			Class<?> classobject=object.getClass();
			while(classobject.getSuperclass()!=null && classobject.getSuperclass()!=Object.class){
				classobject=classobject.getSuperclass();
				try{
					return classobject.getDeclaredField(fieldName);
				}catch (Exception e) {
					
				}
			}
			return null;
		}
	}

}
