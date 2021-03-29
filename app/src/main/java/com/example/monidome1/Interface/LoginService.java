package com.example.monidome1.Interface;

import com.example.monidome1.Entity.LoginEntity;
import com.example.monidome1.Entity.RegisterEntity;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface LoginService {

    @POST
    Call<LoginEntity> sendLogin(@Url String url, @Query("username") String usernameStr, @Query("password") String passwordStr);
}
