package com.kuang.pojo;

public class userT {
    private String name;

    public userT(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name"+ name);
    }
}
