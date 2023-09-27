package com.client.Controller;


import com.client.Service.ServiceImpl;
import com.google.protobuf.Descriptors;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
public class GrpcController {


    final ServiceImpl serviceImpl;

    @GetMapping("/user")
    public Map<Descriptors.FieldDescriptor, Object> getUser(){
        return serviceImpl.getUser();
    }
}
