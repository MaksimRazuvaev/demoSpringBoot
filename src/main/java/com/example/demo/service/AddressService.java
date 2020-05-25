package com.example.demo.service;

import com.example.demo.model.Address;
import com.example.demo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @PersistenceContext
    private EntityManager em;

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

    public void postAddress(Address address) {
        em.persist(address);
    }
}
