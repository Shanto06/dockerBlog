package com.taslim.dockerBlog.exception;

/**
 * Custom exception class to indicate that the product ID provided is invalid.
 */
public class InvalidProductIdException extends RuntimeException {

    /**
     * Constructs a new InvalidProductIdException with the specified detail message.
     *
     * @param message the detail message (which is saved for later retrieval by the getMessage() method).
     */
    public InvalidProductIdException(String message) {
        super(message);
    }
}
