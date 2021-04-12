package com.example.demo.controller;

import com.example.demo.service.LoginService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {

    private final LoginService service;

    public LoginController(LoginService service) {
        this.service = service;
    }

    @PostMapping("")
    public String login(@RequestParam(value = "id", required = false) int id, @RequestParam(value = "password", required = false) String password, Model model) {
        boolean sucessful = service.login(id, password);
        if(sucessful == true) {
            return "homepage";
        } else {
            model.addAttribute("message", "Unable to login");
            return "index";
        }
    }
}
