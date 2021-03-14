package com.fyp.finage_user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Code_Verification extends AppCompatActivity {
    String value;
    TextView codeverify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code__verification);



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

         value = getIntent().getExtras().getString("arg");
        codeverify = findViewById(R.id.verifycode);







    }
    public void verify_code (View v) {

        final RelativeLayout relativeLayout= findViewById(R.id.codeverification);

        final Animation animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fadein);
        relativeLayout.startAnimation(animFadeIn);

        Intent intent = new Intent(Code_Verification.this,Create_Account.class);
        intent.putExtra("arg", value);
        startActivity(intent);


    }
    }
