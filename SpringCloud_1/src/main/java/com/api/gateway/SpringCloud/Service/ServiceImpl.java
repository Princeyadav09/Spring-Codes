package com.api.gateway.SpringCloud.Service;


import com.api.gateway.SpringCloud.FeignClient.SecondApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceImpl {

    @Autowired
    SecondApi secondApi;

    public String fetchUrl(){
        String response = secondApi.fetch();
        return response;
    }
}
