package com.example.demo;

import com.example.demo.model.Address;
import com.example.demo.model.Product;
import com.example.demo.model.Supplier;
import com.example.demo.model.Users;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.persistence.EntityManager;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    private AddressService addressService;
    @Autowired
    private UserService userService;
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private ProductService productService;

    @EventListener(ApplicationReadyEvent.class)
    private void testJpaMethods() {
        Address address = new Address();
        address.setCity("Kazan");
        address.setHomeNumber("4");
        address.setStreet("Main Street");

        Address address1 = new Address();
        address1.setCity("Moscow");

        Users users = new Users();
        users.setAddress(address);
        users.setEmail("someEmail@gmail.com");
        users.setName("Smith");

        //userService.createUsers(users);

        Users users1 = new Users();
        users1.setName("John");
        users1.setEmail("gmailEmail@gmail.com");
        users1.setAddress(address1);

        //userService.createUsers(users1);


        userService
                .findAll() // returns list of users
                .forEach(user-> System.out.println(user));

      //  userService.findAllByName("Smith").forEach(it-> System.out.println(it));

        Users user2 = new Users();
        user2.setName("TestUser");
        user2.setEmail("testEmail@gmail.com");

        //userService.postUser(user2);

        Address address2 = new Address();
        address2.setCity("Orel");
        address2.setHomeNumber("5");
        address2.setStreet("Test Street");

        //addressService.postAddress(address2);

        Supplier supplier3 = new Supplier();
        supplier3.setSupplierName("Drink Cola");
        supplier3.setSupplierPhone("(687) 897-6654");
        supplier3.setSupplierCountry("Chilly");

        //supplierService.toPostSupplier(supplier3);

        Product product = new Product();
        product.setProductName("Morning Snack");
        product.setIsLiquid(false);
        product.setSupplier(supplier3);

        //productService.postProduct(product);
    }

}
