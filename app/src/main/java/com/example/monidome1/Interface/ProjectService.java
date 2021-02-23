package com.example.monidome1.Interface;

import com.example.monidome1.Bean.ProjectNameBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ProjectService {

    @GET
    Call<ProjectNameBean> getUrl(@Url String string);
}
