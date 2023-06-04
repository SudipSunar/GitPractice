package com.example.gridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {

    private final ArrayList<Animals> animals;

    private final LayoutInflater layoutInflater;

    GridViewAdapter(Context context, ArrayList<Animals> animals){

        this.animals =animals;
        this.layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return animals.size();
    }

    @Override
    public Object getItem(int i) {
        return animals.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TextView tvName;
        ImageView imageView;

        Animals animal = (Animals)getItem(i);
        if(view==null){
            view=layoutInflater.inflate(R.layout.view_item,viewGroup,false);
        }

        tvName=view.findViewById(R.id.tv_name);
        imageView=view.findViewById(R.id.image_view);

        tvName.setText(animal.getName());
        imageView.setImageResource(animal.getImage());


        return view;
    }
}
