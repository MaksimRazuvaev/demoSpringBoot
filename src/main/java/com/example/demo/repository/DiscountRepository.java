package com.example.demo.repository;

import com.example.demo.model.Discount;
import com.example.demo.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiscountRepository extends JpaRepository<Discount, Long> {
    List<Orders> findAllById(int discountId);

}
