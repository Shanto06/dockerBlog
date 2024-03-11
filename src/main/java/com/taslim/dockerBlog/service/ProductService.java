package com.taslim.dockerBlog.service;

import com.taslim.dockerBlog.dto.ProductDto;
import com.taslim.dockerBlog.entity.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Service interface for managing product-related operations.
 */
public interface ProductService {

    /**
     * Creates a new product.
     *
     * @param productDto The request model containing product details.
     * @return ResponseEntity containing the created ProductEntity.
     */
    ResponseEntity<Object> createProduct(ProductDto productDto);

    /**
     * Retrieves a list of all products.
     *
     * @return List of ProductEntity.
     */
    List<ProductEntity> getAllProducts();

    /**
     * Retrieves a product by its ID.
     *
     * @param productId The ID of the product to retrieve.
     * @return ResponseEntity containing the retrieved ProductEntity.
     */
    ResponseEntity<Object> getProductById(Long productId);

    /**
     * Updates an existing product.
     *
     * @param productId           The ID of the product to update.
     * @param productDto The request model containing updated product details.
     * @return ResponseEntity containing the updated ProductEntity.
     */
    ResponseEntity<Object> updateProduct(Long productId, ProductDto productDto);

    /**
     * Deletes a product by its ID.
     *
     * @param productId The ID of the product to delete.
     * @return ResponseEntity with a confirmation message.
     */
    ResponseEntity<Object> deleteProduct(Long productId);
}
