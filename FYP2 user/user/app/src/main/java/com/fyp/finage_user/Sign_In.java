package com.fyp.finage_user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Sign_In extends AppCompatActivity {
    EditText userphone, userpasswoed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__in);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        userphone = findViewById(R.id.userphonenumber);
        userpasswoed = findViewById(R.id.userpassword);



    }

    public void CreateAccount (View v) {


        final RelativeLayout createaccount= findViewById(R.id.caccountbutton);
        final Animation animFadeIn2 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fadein);
        createaccount.startAnimation(animFadeIn2);


        Intent intent = new Intent(Sign_In.this,MainActivity.class);
        startActivity(intent);

    }

    public void Login (View v) {


        final RelativeLayout Login= findViewById(R.id.fbutton);
        final Animation animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fadein);
        Login.startAnimation(animFadeIn);

        Call<ResponseBody> call2  =RetrofitClient
                .getInstance()
                .getApi()
                .signin(userphone.getText().toString(),userpasswoed.getText().toString());

        call2.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                  String s = null;
                try {
                    s = response.body().string();
                    if(s.equals("null"))
                    {
                        Toast.makeText(getApplicationContext(),"INVALID",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                     Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Sign_In.this,NAVIGATION_BAR.class);
                    startActivity(intent);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });





    }
}