package com.example.monidome1.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.monidome1.Api.Api;
import com.example.monidome1.Api.ApiUrl;
import com.example.monidome1.Api.TtitCallBack;
import com.example.monidome1.Entity.RegisterEntity;
import com.example.monidome1.Interface.RegisterService;
import com.example.monidome1.R;
import com.example.monidome1.RetrofitUrl.WanAdroidUrl;
import com.example.monidome1.util.StringUtil;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegisterActivity extends AppCompatActivity {

    private String url="https://www.wanandroid.com/user/register";
    private EditText register_editText_phone,register_editText_password,register_commite_password;
    private Button register_buttons;
    private List<RegisterEntity.DataBean> data = new ArrayList<>();
    private String registe_username,register_password,register_compassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        init();
    }

    private void init() {
        register_editText_phone = (EditText) findViewById(R.id.register_editTextPhone);
        register_editText_password = (EditText) findViewById(R.id.register_editTextpassword);
        register_commite_password = (EditText) findViewById(R.id.register_comteTextpassword);
        register_buttons = (Button)findViewById(R.id.register_button);
        register_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registe_username = register_editText_phone.getText().toString();
                register_password = register_editText_password.getText().toString();
                register_compassword = register_commite_password.getText().toString();
//                registe(registe_username,register_password,register_compassword);
                Retrofit retrofit = new Retrofit
                        .Builder()
                        .baseUrl(WanAdroidUrl.Base_url)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                RegisterService registerService = retrofit.create(RegisterService.class);
                Call<RegisterEntity> call = registerService.register(url,registe_username,register_password,register_compassword);
                call.enqueue(new Callback<RegisterEntity>() {
                    @Override
                    public void onResponse(Call<RegisterEntity> call, Response<RegisterEntity> response) {
                        Log.e("注册请求", "请求成功:"+response);
                        RegisterEntity registerEntity = response.body();
                        if (registerEntity.getErrorCode() == 0){
                            data.add(registerEntity.getData());
                            Toast.makeText(RegisterActivity.this, registerEntity.getErrorMsg(),Toast.LENGTH_SHORT).show();
                            finish();
                        }else {
                            Toast.makeText(RegisterActivity.this,"注册失败：",Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onFailure(Call<RegisterEntity> call, Throwable t) {
                        Log.e("TAG", "请求失败:"+t );
                    }
                });

            }
        });

    }

//    @Override
//    protected int initLayout() {
//       return R.layout.register_activity;
//    }
//    @Override
//    protected void initData() {
//
//    }
//
//    @Override
//    protected void initView() {
//
//    }
//    private void registe(String username,String password,String repassword){
//
//        if (StringUtil.isEmpty(username)){
//            showToast("请完善信息");
//            return;
//        }
//        if (StringUtil.isEmpty(password)){
//            showToast("请完善信息");
//
//            return;
//        }if (StringUtil.isEmpty(repassword)){
//            showToast("请完善信息");
//            return;
//        }
//
//        HashMap<String,Object> parms = new HashMap<String,Object>();
//        parms.put("username",username);
//        parms.put("password",password);
//        parms.put("repassword",repassword);
//
//        Api.config(ApiUrl.Resigte,parms).postrequest(new TtitCallBack() {
//            @Override
//            public void onSuccess(final String resulte) {
//                Log.e("注册嘿嘿", "onSuccess: "+"请求成功" );
//                Log.e("注册嘿嘿", "onSuccess: " );
//                showToast("注册成功");
//                finish();
//            }
//
//            @Override
//            public void onFailure(Exception e) {
//                Log.e("哈哈哈",e.toString());
//            }
//        });
//
//    }






}
