package kr.dataeum.nuriclassapi.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorInfo {

	/** parameter */
	private String param;

	/** parameter message */
	private String message;
}
