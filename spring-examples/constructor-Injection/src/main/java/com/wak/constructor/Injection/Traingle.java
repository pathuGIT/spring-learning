package com.wak.constructor.Injection;

public class Traingle {
    private String name;
    private int age;

    public Traingle(String name) {
        this.name = name;
    }
    public Traingle(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Traingle(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void draw(){
        System.out.println(getName()+":"+getAge());
    }
}
