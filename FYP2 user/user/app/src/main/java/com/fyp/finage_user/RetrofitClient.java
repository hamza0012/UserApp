package com.fyp.finage_user;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String Base_URL = "http://10.0.2.2:5000/api/";
    private static RetrofitClient minstance;
    private Retrofit retrofit;

    private  RetrofitClient() {


            retrofit = new Retrofit.Builder()
                    .baseUrl(Base_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
    }

    public static synchronized RetrofitClient getInstance() {
        if(minstance==null)
        {
            minstance=new RetrofitClient();
        }
        return minstance;
    }

    public Api getApi(){
        return retrofit.create(Api.class);
    }
}
