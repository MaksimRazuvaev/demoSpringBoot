package com.example.demo.service;

import com.example.demo.model.Discount;
import com.example.demo.model.Orders;
import com.example.demo.repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DiscountService {
    @Autowired
    private DiscountRepository discountRepository;

    @PersistenceContext
    private EntityManager em;

    public void postDiscount(Discount discount) {
        em.persist(discount);
    }

    public List<Orders> findAllByIdToController(int discount) {
        return discountRepository.findAllById(discount);
    }
}
