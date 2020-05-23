package com.example.demo.controller;

import com.example.demo.model.Address;
import com.example.demo.model.Users;
import com.example.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AddressControler {

    @Autowired
    private AddressService addressService;

    @GetMapping(value = "/addresses")
    public String getAddresesPage(ModelMap modelMap) {
        List<Address> addresses = addressService.findAllFromServises();
        modelMap.addAttribute("address", addresses);
        return "addresses";
    }
}
