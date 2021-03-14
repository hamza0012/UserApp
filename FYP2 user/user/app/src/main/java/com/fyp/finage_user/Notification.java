package com.fyp.finage_user;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class Notification extends Fragment {

    ArrayList<Notification_Model> dataModels;
    ListView listView;
    private static AdapterClassNotification adapter;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

         View root = inflater.inflate(R.layout.fragment_notification, container, false);

        listView=root.findViewById(R.id.list);

        dataModels= new ArrayList<>();

        dataModels.add(new Notification_Model("Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        dataModels.add(new Notification_Model("Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        dataModels.add(new Notification_Model("Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        dataModels.add(new Notification_Model("Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        dataModels.add(new Notification_Model("Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        dataModels.add(new Notification_Model("Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        dataModels.add(new Notification_Model("Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        dataModels.add(new Notification_Model("Lorem ipsum dolor sit amet, consectetur adipiscing elit."));

        adapter= new AdapterClassNotification(dataModels,getActivity().getApplicationContext());

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Notification_Model dataModel= dataModels.get(position);

                Snackbar.make(view, dataModel.getName()+"\n"+dataModel.getType()+" API: "+dataModel.getVersion_number(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();
            }
        });



        return root;
    }
}