package com.hugopinto.seriesapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.startActivity;

public abstract class serieAdapter extends  RecyclerView.Adapter<serieAdapter.SerieViewHolder>{
    private ArrayList<serie> series;

    public static class SerieViewHolder extends RecyclerView.ViewHolder {
        CardView card;
        TextView name;
        ImageView img;
        CheckBox btn;
        Context context;
        int validar;

        public SerieViewHolder(View itemView){
            super(itemView);
            context=itemView.getContext();
            card=itemView.findViewById(R.id.card_view);
            name=itemView.findViewById(R.id.name);
            img=itemView.findViewById(R.id.img);
            btn=itemView.findViewById(R.id.boton);


        }

    }

    public serieAdapter(ArrayList<serie> series) {
        this.series = series;
    }

    @Override
    public SerieViewHolder onCreateViewHolder(ViewGroup parent, int ViewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview,parent,false);
        return (new SerieViewHolder(v));
    }

    @Override
    public void onBindViewHolder(SerieViewHolder holder, final int position){
        holder.name.setText(series.get(position).getName());
        holder.img.setImageResource(series.get(position).getImg());
        holder.btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                series.get(position).setCheck(isChecked);
                onVerClick(buttonView, position);
                /*if (series.get(position).isCheck()) {
                    series.remove(position);
                    notifyItemRemoved(position);
                    notifyItemRangeChanged(position, series.size());
                }*/
            }
        });


    }



    @Override
    public int getItemCount(){
        return series.size();
    }
    public abstract void onVerClick(View v,int position);
}





