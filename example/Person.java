package com.company;

import java.util.ArrayList;

public  abstract class Person   {

    private String name;
    private int id;
    private int age;
    private ArrayList<String> classList;

    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.classList=new ArrayList<>();

    }

    public Person(int id) {
        this.id = id;
        this.classList=new ArrayList<>();
    }

    public Person() {
        this.classList=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getClassList() {
        return classList;
    }

    public abstract void addClass(String newClass);
    public  abstract void removeClass(String newClass);
    public abstract  void editClass(String newClass);








}
