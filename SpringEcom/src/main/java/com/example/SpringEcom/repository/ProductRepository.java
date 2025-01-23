package com.example.SpringEcom.repository;

import com.example.SpringEcom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("SELECT p FROM Product p WHERE " +
            "LOWER(p.name) LIKE CONCAT('%', LOWER(?1), '%') OR " +
            "LOWER(p.description) LIKE CONCAT('%', LOWER(?1), '%') OR " +
            "LOWER(p.brand) LIKE CONCAT('%', LOWER(?1), '%') OR " +
            "LOWER(p.category) LIKE CONCAT('%', LOWER(?1), '%')")
    List<Product> searchProducts(String keyword);
}
