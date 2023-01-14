package com.audipasuatmadi.eversince.everpeace.util;

import com.audipasuatmadi.eversince.everpeace.dto.BaseResponse;

public class BaseResponseUtil {
	public static <T> BaseResponse<T> createSuccessResponse(T data) {
		return BaseResponse.<T>builder().code(0).message("success").data(data).build();
	}

	public static BaseResponse<Object> createErrorResponse(int code, String message) {
		return BaseResponse.builder().code(code).message(message).build();
	}
}
