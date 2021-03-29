package com.example.monidome1.Interface;

import com.example.monidome1.Bean.BannerBean;
import com.example.monidome1.Bean.HomeTopBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface HomeTopService {
    @GET
    Call<HomeTopBean> getUrl(@Url String string);
}
