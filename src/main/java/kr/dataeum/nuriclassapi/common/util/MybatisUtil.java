package kr.dataeum.nuriclassapi.common.util;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

@Slf4j
public class MybatisUtil {

	public static boolean hasText(CharSequence str) {
		return (str != null && str.length() > 0 && containsText(str));
	}

	private static boolean containsText(CharSequence str) {
		int strLen = str.length();
		for(int i = 0; i < strLen; i++) {
			if(!Character.isWhitespace(str.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	public static boolean isEmpty(Object o) throws IllegalArgumentException {
		try {
			if(o == null) return true;

			if(o instanceof String) {
				if(((String)o).length() == 0){
					return true;
				}
			} else if(o instanceof Collection) {
				if(((Collection<?>)o).isEmpty()){
					return true;
				}
			} else if(o.getClass().isArray()) {
				if(Array.getLength(o) == 0){
					return true;
				}
			} else if(o instanceof Map) {
				if(((Map<?, ?>)o).isEmpty()){
					return true;
				}
			}else {
				return false;
			}

			return false;
		} catch(IllegalArgumentException e) {
			log.error("[IllegalArgumentException] Try/Catch...usingParameters Runing : "+ e.getMessage());
		} catch(Exception e) {
			log.error("["+e.getClass()+"] Try/Catch...Exception : " + e.getMessage());
		}
		return false;
	}

	public static boolean isNotEmpty(Object o) {
		return !isEmpty(o);
	}

	public static boolean isEquals(Object obj, Object obj2){
		if(isEmpty(obj)) return false;

		if(obj instanceof String && obj2 instanceof String) {
			if( (String.valueOf(obj)).equals( String.valueOf(obj2) )){
				return true;
			}
		}else if(obj instanceof String && obj2 instanceof Character) {
			if( (String.valueOf(obj) ).equals( String.valueOf(obj2) )){
				return true;
			}
		}else if(obj instanceof String && obj2 instanceof Integer) {
			if( (String.valueOf(obj)).equals( String.valueOf((Integer)obj2) )){
				return true;
			}

		}else if(obj instanceof Integer && obj2 instanceof String) {
			if( (String.valueOf(obj2)).equals( String.valueOf((Integer)obj) )){
				return true;
			}
		} else if(obj instanceof Integer && obj instanceof Integer) {
			if((Integer)obj == (Integer)obj2){
				return true;
			}
		}

		return false;
	}
	public static boolean isNotEquals(Object obj, Object obj2){
		return !isEquals(obj, obj2);
	}
}
