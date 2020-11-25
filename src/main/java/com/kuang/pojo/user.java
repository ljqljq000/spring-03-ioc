package com.kuang.pojo;

public class user {
    private String name;

    public user(){
        System.out.println("user无参构造方法");
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
