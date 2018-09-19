package com.example.ahd.ahd.uttils;

import com.example.ahd.ahd.http.HttpService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 */

public class HttpUtil {
    private static HttpUtil utils;
    private final HttpService httpService;

    private HttpUtil(){
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttpClient build = builder.build();
        Retrofit beanRetrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        httpService = beanRetrofit.create(HttpService.class);

    }
    public static HttpUtil getInstance(){
        if (utils==null){
            synchronized (HttpUtil.class){
                if (utils==null){
                    utils=new HttpUtil();
                }
            }
        }
        return utils;
    }
    public  HttpService getShouYeService(){
        return httpService;
    }
}
