package com.panha.asus.yoempanha.service;

import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    private static final String BASE_URL = "http://ite-rupp.ap-southest-1.elasticbeanstalk.com/";
    private static ServiceGenerator serviceGenerator;
    private static Retrofit builder;

    private ServiceGenerator() {
        Log.e("IP",BASE_URL);
        builder = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    public static synchronized ServiceGenerator getInstance() {
        if (serviceGenerator == null) {
            serviceGenerator = new ServiceGenerator();
        }
        return serviceGenerator;
    }

    public ApiUtils createServiceApi() {
        return builder.create(ApiUtils.class);
    }
}
