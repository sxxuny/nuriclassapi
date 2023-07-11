package kr.dataeum.nuriclassapi.common.map;

import kr.dataeum.nuriclassapi.common.util.CamelUtil;
import org.apache.commons.collections4.map.ListOrderedMap;

public class EumMap<K,V> extends ListOrderedMap<K, V> {

	private static final long serialVersionUID = -5464344630593921452L;

	@SuppressWarnings("unchecked")
	@Override
	public V put(K key, V value) {
		return super.put((K) CamelUtil.stringToCamelCase((String)key), value);
	}

	/**
	 * LowerCase put
	 * @param key
	 * @param value
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public V lcPut(K key, V value) {
		String lowerKey = ((String)key).toLowerCase();
		return super.put((K) lowerKey, value);
	}
}
