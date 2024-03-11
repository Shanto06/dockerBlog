package com.taslim.dockerBlog.repository;

import com.taslim.dockerBlog.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for interacting with the database for ProductEntity entities.
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
