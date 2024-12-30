package org.example.htmlprogram.conyroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/menu")
    public String start(){
        return "/index";
    }
    @GetMapping("/login")
    public String login(){
        return "/login";
    }
    @GetMapping("/registration")
    public String reg(){
        return "/registration";
    }
}
