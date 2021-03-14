package com.fyp.finage_user;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Edit_Profile extends Fragment {

    TextView username,password,cpassword;
    EditText eusername, epassword, ecpassword;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_edit__profile, container, false);


        final RelativeLayout relativeLayout = root.findViewById(R.id.update);
        username = root.findViewById(R.id.e11);
        eusername = root.findViewById(R.id.e12);
        password = root.findViewById(R.id.e13);
        epassword = root.findViewById(R.id.e_14);
        cpassword = root.findViewById(R.id.e15);
        ecpassword = root.findViewById(R.id.e16);




        final Animation animFadeIn = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.fadein);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                relativeLayout.startAnimation(animFadeIn);

                showDialog();
            }
        });

        return root;
    }
    protected void showDialog(){

        Dialog dialog = new Dialog(getActivity());
        dialog.setCancelable(true);

        dialog.setContentView(R.layout.loading_box);
        dialog.show();
    };
}