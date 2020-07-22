package com.panha.asus.yoempanha.service;

import com.panha.asus.yoempanha.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiUtils {
    @GET("orders.php")
    Call<Result> getOrderList();

    @GET("profile.php")
    Call<Result> getProfile();
}
