package com.example.monidome1.Interface;

import com.example.monidome1.Bean.PADecBean;
import com.example.monidome1.Bean.ProjectDecBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface PADecService {
    @GET
//    Call<PADecBean> getUrl(@Query("cid") int id,@Url String string);
    Call<PADecBean> getUrl(@Url String string);
}
