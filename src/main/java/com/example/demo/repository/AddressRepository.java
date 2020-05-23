package com.example.demo.repository;

import com.example.demo.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findAllByCityAndStreet(String city, String street);
    List<Address> findAllByCity(String city);
    //Address findById(Long id);
}
