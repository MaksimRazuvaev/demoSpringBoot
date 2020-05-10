package com.example.demo.controller;

import com.example.demo.model.Users;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class SimpleController {

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

    @PostMapping(value = "/register")
    public String registerUser(Users user) {
        userService.createUsers(user);
        return "redirect:/";
    }
}
