package com.fyp.finage_user;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RV_Task_Items extends RecyclerView.Adapter<RV_Task_Items.RVPB> {
    ArrayList<Item_Task_History> list;

    Context context;
    public RV_Task_Items(ArrayList<Item_Task_History> list, Context applicationContext) {
        this.list = list;
        this.context = applicationContext;
    }

    @NonNull
    @Override
    public RVPB onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_rv_sample,parent,false);
        return new RVPB(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RVPB holder, int position) {

        holder.tduration.setText(list.get(position).gettduration());
        holder.namework.setText(list.get(position).getDescription());
        holder.cattag.setText(list.get(position).getName());
        holder.price.setText(list.get(position).getPrice());
        holder.datetime.setText(list.get(position).getDatetime());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RVPB extends RecyclerView.ViewHolder
    {

        TextView tduration,price,namework,cattag,datetime;


        public RVPB(@NonNull View itemView) {
            super(itemView);

            cattag= itemView.findViewById(R.id.categorytag);
            price=itemView.findViewById(R.id.pricetag);
            namework= itemView.findViewById(R.id.namework);
            tduration = itemView.findViewById(R.id.tduration);
            datetime= itemView.findViewById(R.id.datetime);


        }
    }
}
