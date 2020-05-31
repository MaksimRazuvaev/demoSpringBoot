package com.example.demo.service;


import com.example.demo.model.Orders;
import com.example.demo.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;

    @PersistenceContext
    private EntityManager em;

    public void postOrders(Orders order) {
        em.persist(order);
    }

    public List<Orders> findAllByIdToController(int order) {
        return ordersRepository.findAllById(order);
    }
}
