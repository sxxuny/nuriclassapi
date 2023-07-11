package kr.dataeum.nuriclassapi.common.util;

public class CamelUtil {
	/**
	 * CamelCase 로 변환
	 * @param strVal
	 * @return
	 */
	public static String stringToCamelCase(String strVal) {
		if (strVal.indexOf('_') < 0 && Character.isLowerCase(strVal.charAt(0))) {
			return strVal;
		}

		char[] charArry = strVal.toCharArray();
		StringBuilder result = new StringBuilder();

		boolean isUp = false;
		for(char ch : charArry) {
			if(ch == '_') {
				isUp = true;
			}else {
				if(isUp) {
					result.append(Character.toUpperCase(ch));
					isUp = false;
				}else {
					result.append(Character.toLowerCase(ch));
				}
			}
		}

		return result.toString();
	}
}
