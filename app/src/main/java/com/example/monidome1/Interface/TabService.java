package com.example.monidome1.Interface;

import com.example.monidome1.BeanClass.BannerBean;
import com.example.monidome1.BeanClass.HomeBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface TabService {

    @GET
    Call<HomeBean> getUrl(@Url String string);

}
