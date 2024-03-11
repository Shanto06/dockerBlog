package com.taslim.dockerBlog.controllers;

import com.taslim.dockerBlog.dto.ProductDto;
import com.taslim.dockerBlog.entity.*;
import com.taslim.dockerBlog.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller handling operations related to products.
 */
@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    /**
     * Endpoint for creating a new product.
     *
     * @param productDto Request body containing details for creating a new product.
     * @return ResponseEntity containing the result of the operation.
     */
    @PostMapping("/create")
    public ResponseEntity<Object> createProduct(@RequestBody ProductDto productDto) {
        return productService.createProduct(productDto);
    }

    /**
     * Endpoint for retrieving a list of all products.
     *
     * @return List of ProductEntity representing all products.
     */
    @GetMapping("/all")
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }

    /**
     * Endpoint for retrieving a product by its ID.
     *
     * @param productId ID of the product to retrieve.
     * @return ResponseEntity containing the result of the operation.
     */
    @GetMapping("/id/{productId}")
    public ResponseEntity<Object> getProductById(@PathVariable Long productId) {
        return productService.getProductById(productId);
    }

    /**
     * Endpoint for updating an existing product.
     *
     * @param productId   ID of the product to update.
     * @param productDto  Request body containing details for updating the product.
     * @return ResponseEntity containing the result of the operation.
     */
    @PutMapping("/update/{productId}")
    public ResponseEntity<Object> updateProduct(@PathVariable Long productId, @RequestBody ProductDto productDto) {
        return productService.updateProduct(productId, productDto);
    }

    /**
     * Endpoint for deleting an existing product.
     *
     * @param productId ID of the product to delete.
     * @return ResponseEntity containing the result of the operation.
     */
    @DeleteMapping("/delete/{productId}")
    public ResponseEntity<Object> deleteProduct(@PathVariable Long productId) {
        return productService.deleteProduct(productId);
    }
}
