package com.example.gridviewdemo;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView=findViewById(R.id.gridview);

        ArrayList<Animals> animals = getItem();

        GridViewAdapter gridViewAdapter = new GridViewAdapter(MainActivity.this, animals);

        gridView.setAdapter(gridViewAdapter);

    }

    public ArrayList<Animals> getItem(){

        ArrayList<Animals> tmpItem=new ArrayList<>();
        String[] name ={
                "Lion",
                "Tiger",
                "Zebra",
                "Dog",
                "Cat",
                "horse"
        };

        int[] img ={
                R.drawable.lion,
                R.drawable.tiger,
                R.drawable.zebra,
                R.drawable.dog,
                R.drawable.cat,
                R.drawable.horse
        };
        for(int i=0;i<name.length;i++) {
            Animals animals = new Animals(i+1,img[i],name[i]);
            tmpItem.add(animals);
        }
        return tmpItem;
    }
}
