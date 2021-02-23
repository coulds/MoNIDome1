package com.example.monidome1.Interface;

import com.example.monidome1.Bean.BannerBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface BannerService {

    @GET
    Call<BannerBean> getUrl(@Url String string);
}
