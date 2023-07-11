package kr.dataeum.nuriclassapi.api.dto;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.collections4.map.ListOrderedMap;

import java.util.List;

@Getter
@Setter
public class ApiResult {

	private boolean isSuccess = false;

	private String message;

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
