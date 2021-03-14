package com.fyp.finage_user;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Create_Account extends AppCompatActivity {

    RelativeLayout relativeLayout;
    private RequestQueue requestQueue;
    EditText username , password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create__account);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        relativeLayout= findViewById(R.id.createnewaccount);
        final Animation animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fadein);

        final String value = getIntent().getExtras().getString("arg");
        Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show();

        username = findViewById(R.id.usernametext);
        password = findViewById(R.id.passwordtext);



        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                relativeLayout.startAnimation(animFadeIn);


                Call<ResponseBody> call  =RetrofitClient
                        .getInstance()
                        .getApi()
                        .signup(username.getText().toString(),password.getText().toString(),value);

                Toast.makeText(getApplicationContext(),username.getText().toString(),Toast.LENGTH_SHORT).show();

                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        String s = null;
                        try {
                            s = response.body().string();
                            Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        Toast.makeText(getApplicationContext(),"fail",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });



    }
}