package com.taslim.dockerBlog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO (Data Transfer Object) representing the request model for creating or updating a product.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
    private String productName;       // Name of the product.
    private Long productAmount;       // Amount of the product in stock.
    private String userName;          // Name of the user associated with the product.
    private Double productPrice;      // Price of the product.
}
