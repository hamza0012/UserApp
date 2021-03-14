package com.fyp.finage_user;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    CardView babyS,plumber,kitchening, Ironing, cleaning, HomeS;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        babyS=root.findViewById(R.id.baby);
        plumber=root.findViewById(R.id.plumberX);
        kitchening=root.findViewById(R.id.cheff);
        Ironing=root.findViewById(R.id.iron);
        cleaning=root.findViewById(R.id.Cleaning);
        HomeS=root.findViewById(R.id.shifting);


        babyS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity().getApplicationContext(),Info_Screen_From_Category.class);
                intent.putExtra("message1", "1");
                startActivity(intent);
            }
        });


       plumber.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity().getApplicationContext(),Info_Screen_From_Category.class);
                intent.putExtra("message1", "2");
                startActivity(intent);
            }
        });

        kitchening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity().getApplicationContext(),Info_Screen_From_Category.class);
                intent.putExtra("message1", "3");
                startActivity(intent);
            }
        });


        Ironing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity().getApplicationContext(),Info_Screen_From_Category.class);
                intent.putExtra("message1", "4");
                startActivity(intent);
            }
        });


        cleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity().getApplicationContext(),Info_Screen_From_Category.class);
                intent.putExtra("message1", "5");
                startActivity(intent);
            }
        });


        HomeS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity().getApplicationContext(),Info_Screen_From_Category.class);
                intent.putExtra("message1", "6");
                startActivity(intent);
            }
        });



        return root;
    }
}