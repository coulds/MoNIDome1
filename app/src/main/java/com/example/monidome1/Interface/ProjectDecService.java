package com.example.monidome1.Interface;

import com.example.monidome1.Bean.ProjectDecBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface ProjectDecService {

    @GET
    Call<ProjectDecBean> getUrl(@Url String string,@Query("cid") int id );
}
