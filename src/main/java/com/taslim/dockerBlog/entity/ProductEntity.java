package com.taslim.dockerBlog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entity class representing a product in the system.
 */
@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                  // Unique identifier for the product.

    private String productName;       // Name of the product.

    private Long productAmount;       // Amount of the product in stock.

    private String userName;          // Name of the user associated with the product.

    private Double productPrice;      // Price of the product.
}
