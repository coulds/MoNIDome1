package com.example.monidome1.Interface;

import com.example.monidome1.BeanClass.YinliaoBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface YinliaoService {

    @GET
    Call<YinliaoBean> getURL(@Url String string);
}
