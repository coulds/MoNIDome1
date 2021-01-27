package com.example.monidome1.Activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.monidome1.Api.Api;
import com.example.monidome1.Api.ApiUrl;
import com.example.monidome1.Api.TtitCallBack;
import com.example.monidome1.R;
import com.example.monidome1.util.StringUtil;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class LoginActivity extends BaseActivity {
    private EditText editText_phone,editText_password;
    private Button button_login;
    private TextView register_text;

    @Override
    protected int initLayout() {
        return R.layout.login_activity;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        editText_phone = (EditText) findViewById(R.id.editTextPhone);
        editText_password = (EditText) findViewById(R.id.editTextPhone);
        register_text = (TextView) findViewById(R.id.register);
        button_login = (Button)findViewById(R.id.login_button);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = editText_phone.getText().toString();
                String password = editText_password.getText().toString();

                login(username,password);
            }


        });
        register_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                navigateTo(RegisterActivity.class);
            }
        });



    }

//    @Override
//    protected void initData() {
//
//    }
//
//    @Override
//    protected void initView() {
//
//        editText_phone = (EditText) findViewById(R.id.editTextPhone);
//        editText_phone = (EditText) findViewById(R.id.editTextPhone);
//        button_login = (Button)findViewById(R.id.login_button);
//        button_login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                String account = editText_phone.getText().toString();
//                String password = editText_password.getText().toString();
//
//                login(account,password);
//            }
//
//
//        });
//
//    }
//
//    @Override
//    protected int initLayout() {
//        return ;
//    }

    private void login(String username,String password) {
        if (StringUtil.isEmpty(username)){
            showToast(username);
            return;
        }
        if (StringUtil.isEmpty(password)){
            showToast(password);
            return;
        }

        HashMap<String,Object> parms = new HashMap<String,Object>();
        parms.put("username",username);
        parms.put("password",password);
        Api.config(ApiUrl.Login,parms).postrequest(new TtitCallBack() {
            @Override
            public void onSuccess(final String resulte) {
                Log.e("登录嘿嘿", "onSuccess: "+"请求成功" );
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        showToast(resulte);
                    }
                });
            }

            @Override
            public void onFailure(Exception e) {
                Log.e(TAG, "onFailure: "+"请求失败" );
            }
        });
    }
    
    
}
