package com.example.demo.controller;

import com.example.demo.model.Users;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/index")
    public String getIndexPage(ModelMap modelMap) {
        List<Users> users = userService.findAll();
        modelMap.addAttribute("persons", users);
        return "index";
    }


    @GetMapping(value = "/register")
    public String getRegisterPage() {
        return "register";
    }
    /*@PostMapping(value = "/register")
    public String addPersonSave(@ModelAttribute("userForm") Users userForm) {
        String name = userForm.getName();
        String email = userForm.getEmail();
        Users user = new Users(name, email);
        userService.createUsers(user);
        return "redirect:/index";
    }*/


}
