package com.restapi.dockerexample.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DtoResponse {
	private Object body;
	private String status;
	private String message;

}
