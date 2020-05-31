package com.example.demo.service;


import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @PersistenceContext
    private EntityManager em;

    public List<Product> findAllByProductNameToController(String productName) {
        return productRepository.findAllByProductName(productName);
    }

    public List<Product> findAllBySupplierId(String supplierId) {
        return productRepository.findAllByProductName(supplierId);
    }

    public void postProduct(Product product) {
        em.persist(product);
    }

}
