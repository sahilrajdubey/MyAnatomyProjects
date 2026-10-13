package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller 
public class HomeController {
    @GetMapping ("/")
    public String home(Model model) {
        model.addAttribute("message", "");
        return "index";
    }

    @GetMapping ("/about")
    public String about() {
        return "about";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping ("/features")
        public String services() {
        return "features";      
    }
    @GetMapping ("/products")
        public String products() {
        return "product";      
    }
    
}