package com.example.demo.service;


import com.example.demo.model.Supplier;
import com.example.demo.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;
    @PersistenceContext
    private EntityManager em;

    public List<Supplier> findAllBySupplierName(String supplierName) {
        return supplierRepository.findAllBySupplierName(supplierName);
    }
    public List<Supplier> findAllBySupplierCountry(String supplierCountry) {
        return supplierRepository.findAllBySupplierCountry(supplierCountry);
    }

    public void toPostSupplier(Supplier supplier) {
        em.persist(supplier);
    }

}
