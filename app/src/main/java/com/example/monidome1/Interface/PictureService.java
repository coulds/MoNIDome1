package com.example.monidome1.Interface;

import com.example.monidome1.Bean.PictureBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface PictureService {
    @GET
    Call<PictureBean> getURL(@Url String string);
}
