package com.api.gateway.SpringCloud.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "second-service", url = "http://localhost:8080", path = "/consumer")
public interface SecondApi {

    @GetMapping("/message")
    public String fetch();
}
