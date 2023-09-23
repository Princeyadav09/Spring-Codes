package com.api.gateway.SpringCloud.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class Controller {

    @GetMapping("/message")
    public String test() {
        return "Hello JavaInUse Called in Second Service";
    }

}