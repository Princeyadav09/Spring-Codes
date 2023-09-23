package com.api.gateway.SpringCloud.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class Controller {

    @GetMapping("/message")
    public String test() {
        return "Hello JavaInUse Called in First Service";
    }
}
