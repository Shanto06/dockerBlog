package com.taslim.dockerBlog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO (Data Transfer Object) representing a model for handling exceptions.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExceptionDto {

    private String errorMessage;  // Error message describing the exception.

}
