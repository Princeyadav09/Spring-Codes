package com.api.gateway.SpringCloud.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@Service
@RestController
@RequestMapping("/employee")
public class Controller {

    private RestTemplate restTemplate;

    @Autowired
    public Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/message")
    public String test() {
        return "Hello JavaInUse Called in First Service";
    }

    @GetMapping("/secondservicevcall")
    public String getFromSecond(){
        String responseEntity = restTemplate
                .getForObject("http://localhost:8080/consumer/message", String.class );
        return responseEntity;
    }
}
