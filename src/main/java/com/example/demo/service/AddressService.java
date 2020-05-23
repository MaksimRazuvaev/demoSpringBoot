package com.example.demo.service;

import com.example.demo.model.Address;
import com.example.demo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    public void createAddress(Address address){
        addressRepository.save(address);
    }

    public List<Address> findAllFromServises() {
        return addressRepository.findAll();
    }

    public List<Address> findAllByStreetAndCity(String street, String city) {
        return addressRepository.findAllByCityAndStreet(street, city);
    }

    public List<Address> findAllByCity(String city) {
        return addressRepository.findAllByCity(city);
    }
    public Address findById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }

}
