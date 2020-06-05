package com.example.demo.controller;

import com.example.demo.model.Address;
import com.example.demo.model.Product;
import com.example.demo.model.Supplier;
import com.example.demo.model.Users;
import com.example.demo.service.AddressService;
import com.example.demo.service.ProductService;
import com.example.demo.service.SupplierService;
import com.example.demo.service.UserService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiGetControler {
    @Autowired
    private AddressService addressService;
    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;
    @Autowired
    private SupplierService supplierService;

    @GetMapping(value = "/supplierForName")
    public List<Supplier> findAllBySupplierName(@PathVariable(value = "supplierName") String supplierName) throws NotFoundException {
        return supplierService.findAllBySupplierName(supplierName);
    }
    @GetMapping(value = "/supplierForCountry")
    public List<Supplier> findAllBySupplierCountry(@PathVariable(value = "supplierCountry") String supplierCountry) throws NotFoundException {
        return supplierService.findAllBySupplierCountry(supplierCountry);
    }

    @GetMapping(value = "/productForProductName/{prName}")
    public List<Product> findAllByProductNameToController(@PathVariable(value = "prName") String product) throws NotFoundException {
        return productService.findAllByProductNameToController(product);
    }
    @GetMapping(value = "/productForProductSupplierId/{prSupplier}")
    public List<Product> findAllBySupplierId(@PathVariable(value = "prSupplier") String supplierId) throws NotFoundException {
        return productService.findAllBySupplierId(supplierId);
    }


    @GetMapping(value = "/allAddresses")
    public List<Address> getAllAdresses() {
        return addressService.findAllFromServises();
    }
    @GetMapping(value = "/address/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable(value = "id") Long userId) throws NotFoundException {
        Address address = addressService.findById(userId);
        return ResponseEntity.ok().body(address);
    }
    @GetMapping(value = "/addressez/city")
    @ResponseBody
    public List<Address> getAllAdresses(@RequestParam(value = "city") String city) {
        return addressService.findAllByCity(city);
    }


    @GetMapping(value = "/userByEmail/{email}")
    public ResponseEntity<Users> getUserByEmail(@PathVariable(value = "email") String email) throws NotFoundException {
        Users user = userService.getUserByEmail(email);
        return ResponseEntity.ok().body(user);
    }
    @GetMapping(value = "/userById/{id}")
    public ResponseEntity<Users> getUserByEmail(@PathVariable(value = "id") Long id) throws NotFoundException {
        Users user = userService.findById(id);
        return ResponseEntity.ok().body(user);
    }

    @GetMapping(value = "/getUserFromWebPage/email")
    @ResponseBody
    public String getUserByEmailTest(@RequestParam (value = "email") String email) {
        Users user = userService.getUserByEmail(email);
        return user.getName();
    }

    @GetMapping(value = "/postUserWithEmailSearch")
    @ResponseBody
    public String postUserByEmail(@RequestParam (value = "email") String email) {
        Users user = new Users();
        user.setEmail(email);
        userService.postUser(user);
        return "Successful";
    }

    @GetMapping(value = "/postUserWithEmailAndName")
    @ResponseBody
    public String postUserByEmail(@RequestParam (value = "email") String email, @RequestParam (value = "name") String name) {
        Users user = new Users();
        user.setEmail(email);
        user.setName(name);
        userService.postUser(user);
        return "Successful";
    }

    @GetMapping(value = "/getUserFromWebPage/phone")
    @ResponseBody
    public String getUserByPhoneTest(@RequestParam (value = "phone") String phone) {
        Users user = userService.getUserByPhone(phone);
        return user.getName();
    }

}
