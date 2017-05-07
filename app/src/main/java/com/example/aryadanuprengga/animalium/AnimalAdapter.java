package com.example.aryadanuprengga.animalium;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Arya Danu Prengga on 5/7/2017.
 */

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.MyViewHolder> {
    List<AnimalModel> animalModelList;
    Context context;

    public AnimalAdapter(Context context,List<AnimalModel>animalModelList){
        this.animalModelList=animalModelList;
        this.context=context;
    }

    @Override
    public AnimalAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AnimalAdapter.MyViewHolder holder, int position) {
        final  AnimalModel animalModel=animalModelList.get(position);

        holder.judul.setText(animalModel.getNamaIndonesia());
        holder.gambar.setImageResource(animalModel.getGambar());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,animalModel.getNamaEnglish(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return animalModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView judul;
        ImageView gambar;
        LinearLayout layout;

        public MyViewHolder(View itemView) {
            super(itemView);
            judul=(TextView) itemView.findViewById(R.id.judul);
            gambar=(ImageView) itemView.findViewById(R.id.gambar);
            layout=(LinearLayout) itemView.findViewById(R.id.layout);
        }
    }
}
