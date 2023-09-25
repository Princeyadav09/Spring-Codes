package com.api.gateway.SpringCloud.Service;

import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.http.GET;

@Service
public interface Api {

    @GET("message")
    Call<String> fetch();
}
