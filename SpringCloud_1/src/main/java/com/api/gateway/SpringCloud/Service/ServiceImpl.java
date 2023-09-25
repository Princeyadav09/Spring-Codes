package com.api.gateway.SpringCloud.Service;

import com.api.gateway.SpringCloud.RetrofitClient.RetrofitUtil;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

@Service
public class ServiceImpl {

    private Api api;
    private Retrofit retrofit;

    public ServiceImpl(){
        retrofit = RetrofitUtil.getRetrofitInstance();
        api = retrofit.create(Api.class);
    }

    public String fetchUrl(){
        String resp = "";
        Call<String> call =  api.fetch();
        try {
            Response<String> responce = call.execute();
            if(responce.isSuccessful() && responce.body()!=null){
                resp=responce.body();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return resp;
    }
}
