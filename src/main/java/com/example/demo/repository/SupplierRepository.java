package com.example.demo.repository;

import com.example.demo.model.Product;
import com.example.demo.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    List<Supplier> findAllBySupplierName(String supplierName);
    List<Supplier> findAllBySupplierCountry(String supplierCountry);
}

