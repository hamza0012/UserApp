package com.fyp.finage_user;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("signup")
    Call<ResponseBody> signup(
      @Field("email")String email,
      @Field("pass") String pass,
      @Field("number") String number
    );

    @FormUrlEncoded
    @POST("signin")
    Call<ResponseBody> signin(
            @Field("number") String number,
            @Field("pass") String pass
    );
}
