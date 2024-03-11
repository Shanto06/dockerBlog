package com.taslim.dockerBlog.exception;

/**
 * Custom exception class to indicate that a product was not found.
 */
public class ProductNotFoundException extends RuntimeException {

    /**
     * Constructs a new ProductNotFoundException with the specified detail message.
     *
     * @param message the detail message (which is saved for later retrieval by the getMessage() method).
     */
    public ProductNotFoundException(String message) {
        super(message);
    }
}
