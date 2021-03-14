package com.fyp.finage_user;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Task_History extends Fragment {
    RecyclerView RV;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_task__history, container, false);

        RV = root.findViewById(R.id.RVTB);
        make_list();

        return root;
    }
        public  void make_list() {
            ArrayList<Item_Task_History> list = new ArrayList<>();
            RV_Task_Items rv_homeItems = new RV_Task_Items(list, getActivity().getApplicationContext());


            Item_Task_History homeItemModel3 = new Item_Task_History("Plumber","200$","Hassan","3 hrs ","12,Oct 21");
            list.add(homeItemModel3);

            Item_Task_History homeItemModel4 = new Item_Task_History("Baby Sitter ","610$","Ahmad","2 hrs ","22,jan 21");
            list.add(homeItemModel4);

            Item_Task_History homeItemModel5 = new Item_Task_History("Shifting","510$","Hamza","1 hrs ","34, feb 21");
            list.add(homeItemModel5);




            RV.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
            RV.setAdapter(rv_homeItems);
        }

    }