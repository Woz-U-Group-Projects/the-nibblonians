package com.example.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

@RequestMapping("/")
    public String index() {
        return "index.html";
    }
@RequestMapping("/post")
public String post() {
    return "post.html";
}
}

