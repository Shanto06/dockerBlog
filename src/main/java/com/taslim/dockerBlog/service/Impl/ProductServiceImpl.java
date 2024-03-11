package com.taslim.dockerBlog.service.Impl;

import com.taslim.dockerBlog.dto.ProductDto;
import com.taslim.dockerBlog.entity.ProductEntity;
import com.taslim.dockerBlog.exception.*;
import com.taslim.dockerBlog.repository.ProductRepository;
import com.taslim.dockerBlog.service.ProductService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    /**
     * Creates a new product.
     *
     * @param productDto The model containing product details.
     * @return ResponseEntity containing the saved ProductEntity.
     */
    @Override
    public ResponseEntity<Object> createProduct(ProductDto productDto) {
        ProductEntity productEntity = ProductEntity.builder()
                .productName(productDto.getProductName())
                .productAmount(productDto.getProductAmount())
                .userName(productDto.getUserName())
                .productPrice(productDto.getProductPrice())
                .build();

        ProductEntity savedProduct = productRepository.save(productEntity);

        return ResponseEntity.ok(savedProduct);
    }

    /**
     * Retrieves a list of all products.
     *
     * @return List of ProductEntity.
     */
    @Override
    public List<ProductEntity> getAllProducts() {
        List<ProductEntity> productList = productRepository.findAll();
        if (productList.isEmpty()) {
            throw new ProductNotFoundException("There are no products");
        }
        return productList;
    }

    /**
     * Retrieves a product by its ID.
     *
     * @param productId The ID of the product to retrieve.
     * @return ResponseEntity containing the retrieved ProductEntity.
     */
    @Override
    public ResponseEntity<Object> getProductById(Long productId) {
        Optional<ProductEntity> product = productRepository.findById(productId);
        if (product.isPresent()) {
            return ResponseEntity.ok(product.get());
        } else {
            throw new ProductNotFoundException("Product not found with id " + productId);
        }
    }

    /**
     * Updates a product with the given ID.
     *
     * @param productId           The ID of the product to update.
     * @param productDto The model containing updated product details.
     * @return ResponseEntity containing the updated ProductEntity.
     */
    @Override
    public ResponseEntity<Object> updateProduct(Long productId, ProductDto productDto) {
        Optional<ProductEntity> product = productRepository.findById(productId);
        if (product.isEmpty()) {
            throw new InvalidProductIdException("Invalid product Id " + productId);
        } else {
            ProductEntity product1 = product.get();
            product1.setProductName(productDto.getProductName());
            product1.setProductAmount(productDto.getProductAmount());
            product1.setUserName(productDto.getUserName());

            ProductEntity updatedProduct = productRepository.save(product1);

            return ResponseEntity.ok(updatedProduct);
        }
    }

    /**
     * Deletes a product by its ID.
     *
     * @param productId The ID of the product to delete.
     * @return ResponseEntity indicating the success of the deletion.
     */
    @Override
    public ResponseEntity<Object> deleteProduct(Long productId) {
        Optional<ProductEntity> product = productRepository.findById(productId);
        if (product.isEmpty()) {
            throw new InvalidProductIdException("Invalid product Id " + productId);
        } else {
            productRepository.deleteById(productId);

            return ResponseEntity.ok("Product with ID: " + productId + " has been deleted.");
        }
    }
}
