package com.example.demo.repository;

import com.example.demo.model.Product;
import com.example.demo.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByProductName(String productName);
    List<Product> findAllBySupplierId(String supplierId);

}
