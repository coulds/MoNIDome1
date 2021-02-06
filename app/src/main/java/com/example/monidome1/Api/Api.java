package com.example.monidome1.Api;

import android.util.Log;

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
import retrofit2.http.PUT;

public class Api {
    private static OkHttpClient client;
    private static String requesturl;
    private static HashMap<String,Object> mpamars;

    public static Api api= new Api();

    public Api(){

    }
    public static Api config(String url, HashMap<String,Object> pamars){

        client = new OkHttpClient
                .Builder()
                .build();
        requesturl = ApiUrl.BASE_URL+url;

        mpamars = pamars;
        return api;

    }
    public void postrequest(final TtitCallBack callBack) {

        JSONObject jsonObject = new JSONObject(mpamars);
        String objectstr = jsonObject.toString();
        RequestBody requestBodyJson = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), objectstr);
        final Request request = new Request
                .Builder()
                .url(requesturl)
                .post(requestBodyJson)
                .build();
        final Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {

               callBack.onFailure(e);

            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                final String string = request.body().toString();
                callBack.onSuccess(string);
            }
        });

    }
}
