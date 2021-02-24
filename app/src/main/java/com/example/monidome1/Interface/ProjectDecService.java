package com.example.monidome1.Interface;

import com.example.monidome1.Bean.ProjectDecBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface ProjectDecService {

    @GET
    Call<ProjectDecBean> getUrl(@Url String string,@Query("cid") int id);

//    @GET("https://www.wanandroid.com/project/list/1/json?cid=294")
//    Call<ProjectDecBean> getUrl(@Path("curPage") int pageCount, @Query("cid") int id);
}
