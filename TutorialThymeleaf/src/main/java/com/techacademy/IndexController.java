package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
   
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
}
