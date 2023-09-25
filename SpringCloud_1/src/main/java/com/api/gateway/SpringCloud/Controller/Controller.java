package com.api.gateway.SpringCloud.Controller;


import com.api.gateway.SpringCloud.Service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/employee")
public class Controller {

    @Autowired
    private ServiceImpl serviceImpl;

    @GetMapping("/message")
    public String test() {
        return "Hello JavaInUse Called in First Service";
    }

    @GetMapping("/secondservicevcall")
    public String getFromSecond(){
        return serviceImpl.fetchUrl();
    }
}
