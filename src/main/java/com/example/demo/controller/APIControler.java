package com.example.demo.controller;

import com.example.demo.model.Address;
import com.example.demo.model.Users;
import com.example.demo.service.AddressService;
import com.example.demo.service.UserService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class APIControler {
    @Autowired
    private AddressService addressService;
    @Autowired
    private UserService userService;

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
}
