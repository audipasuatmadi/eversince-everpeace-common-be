package com.audipasuatmadi.eversince.everpeace.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PingResponse {
	@JsonProperty("server_name")
	private String serverName;
	
	private long timestamp;
	
	@JsonProperty("server_version")
	private String serverVersion;
}
