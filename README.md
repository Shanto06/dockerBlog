# Docker Blog

This repository contains code for managing products in a Dockerized blog application.

## Overview

The Docker-Blog application is designed to handle product management operations such as creating, updating, retrieving, and deleting products. It consists of several components including controllers, services, repositories, DTOs (Data Transfer Objects), entities, and an exception handler.

## Components

### Controllers

- **ProductController**: Handles HTTP requests related to products.

### Services

- **ProductService**: Provides business logic for managing products.

### Repositories

- **ProductRepository**: Interface for interacting with the database for product entities.

### DTOs (Data Transfer Objects)

- **ProductDto**: Represents the request model for creating or updating a product.
- **ExceptionDto**: Represents the response model for handling exceptions.

### Entities

- **ProductEntity**: Represents a product in the system.

### Exceptions

- **InvalidProductIdException**: Custom exception class to indicate that the product ID provided is invalid.
- **ProductNotFoundException**: Custom exception class to indicate that a product was not found.

### Utilities

- **GlobalExceptionHandler**: Global exception handler to manage exceptions across the application.

## Usage

To run this application locally:

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/Docker-Blog.git
