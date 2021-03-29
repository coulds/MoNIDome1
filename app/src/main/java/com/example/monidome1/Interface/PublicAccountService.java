package com.example.monidome1.Interface;

import com.example.monidome1.Bean.PublicAccountBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface PublicAccountService {

    @GET
    Call<PublicAccountBean> geturl(@Url String url);

}
