package com.audipasuatmadi.eversince.everpeace.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse<T extends Object> {
	
	private int code;
	private String message;
	private T data;
}
