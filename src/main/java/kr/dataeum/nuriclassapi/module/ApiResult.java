package kr.dataeum.nuriclassapi.module;

import kr.dataeum.nuriclassapi.module.api.uprism.service.UserLog;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.collections4.map.ListOrderedMap;

import java.util.*;

@Getter
@Setter
public class ApiResult {

	private boolean isSuccess = false;

	private String code;
	private String message;
	private Map<String, List<UserLog>> response;

	private ListOrderedMap data;

	private List<ErrorInfo> errorList = null;

	private String eventCode;

	private String redirectUrl;

	public ApiResult() {
		this.data = new ListOrderedMap();
	}

	public void put(String key, Object value) {
		data.put(key, value);
	}
}
