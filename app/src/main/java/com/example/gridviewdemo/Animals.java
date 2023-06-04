package com.example.gridviewdemo;

public class Animals {
    private final int image;
    private final String name;
    private final int id;

    public Animals(int id, int image, String name){
        this.image=image;
        this.name=name;
        this.id=id;
    }

    public int getId() {   return id;  }

    public int getImage() { return image;   }


    public String getName() { return name;  }
}
