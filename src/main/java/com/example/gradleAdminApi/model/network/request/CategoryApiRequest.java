package com.example.gradleAdminApi.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryApiRequest {

	private Long id;

	@NotBlank
	private String cateName;

	@NotBlank
	private String cateCode;

	private String cateCodeRef;
}
