package com.example.challenge16mar.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.challenge16mar.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView app_name;
    public ImageView App_icon;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        app_name=itemView.findViewById(R.id.App_name);
        App_icon=itemView.findViewById(R.id.App_icon);

    }
}
