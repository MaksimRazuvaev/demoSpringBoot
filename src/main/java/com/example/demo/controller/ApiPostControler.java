package com.example.demo.controller;


import com.example.demo.model.Address;
import com.example.demo.model.Product;
import com.example.demo.model.Supplier;
import com.example.demo.model.Users;
import com.example.demo.repository.UsersRepository;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
public class ApiPostControler {
    @Autowired
    private AddressService addressService;
    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;
    @Autowired
    private SupplierService supplierService;


    @PostMapping (value = "/postUser")
    public void toPostUser(@RequestBody Users user) {
        userService.postUser(user);
    }

    @PostMapping(value = "/postAddress")
    public void toPostAddress(@RequestBody Address address) {
        addressService.postAddress(address);
    }

    @PostMapping(value = "/postProduct")
    public void toPostProduct(@RequestBody Product product) {
        productService.postProduct(product);
    }

    @PostMapping(value = "/postSupplier")
    public void toPostSupplier(@RequestBody Supplier supplier) {
        supplierService.toPostSupplier(supplier);
    }

}
