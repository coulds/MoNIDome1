package com.example.monidome1.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.monidome1.Api.Api;
import com.example.monidome1.Api.ApiUrl;
import com.example.monidome1.Api.TtitCallBack;
import com.example.monidome1.Entity.RegisterEntity;
import com.example.monidome1.R;
import com.example.monidome1.util.StringUtil;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class RegisterActivity extends BaseActivity {
    private EditText register_editText_phone,register_editText_password,register_commite_password;
    private Button register_buttons;

    @Override
    protected int initLayout() {
        return R.layout.register_activity;
    }
    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        register_editText_phone = (EditText) findViewById(R.id.register_editTextPhone);
        register_editText_password = (EditText) findViewById(R.id.register_editTextpassword);
        register_commite_password = (EditText) findViewById(R.id.register_comteTextpassword);
        register_buttons = (Button)findViewById(R.id.register_button);
        register_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String registe_username = register_editText_phone.getText().toString();
                String register_password = register_editText_password.getText().toString();
                String register_compassword = register_commite_password.getText().toString();



                registe(registe_username,register_password,register_compassword);
            }
        });

    }
    private void registe(String username,String password,String repassword){

        if (StringUtil.isEmpty(username)){
            showToast("请完善信息");
            return;
        }
        if (StringUtil.isEmpty(password)){
            showToast("请完善信息");

            return;
        }if (StringUtil.isEmpty(repassword)){
            showToast("请完善信息");
            return;
        }

        HashMap<String,Object> parms = new HashMap<String,Object>();
        parms.put("username",username);
        parms.put("password",password);
        parms.put("repassword",repassword);

        Api.config(ApiUrl.Resigte,parms).postrequest(new TtitCallBack() {
            @Override
            public void onSuccess(final String resulte) {
                Log.e("注册嘿嘿", "onSuccess: "+"请求成功" );
                showToast("注册成功");
                finish();
            }

            @Override
            public void onFailure(Exception e) {
                Log.e("哈哈哈",e.toString());
            }
        });

    }

//    public void onRegister(RegisterEntity registerData) {
//        if (registerData != null) {
//            if (registerData.getErrorCode() == 0) {
//                showToast("注册成功");
//                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
//                intent.putExtra("referrer", mUsername.getText().toString());
//                intent.putExtra("collect", mPassword.getText().toString());
//                startActivity(intent);
//                finish();
//            } else {
//                ToastUtils.showShort(registerData.getErrorMsg());
//            }
//        }
//    }




}
