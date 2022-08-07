package com.company;

import java.util.ArrayList;

public class Student extends Person {

    private int grade;

    public Student(String name, int id, int age, int grade) {
        super(name,id,age);
        this.grade = grade;
    }

    public Student( int id, int grade) {
        super(id);
        this.grade = grade;
    }

    public Student(){

    }



    public int getGrade() {

        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setGrade(double grade) {
        //
    }

    @Override
    public void addClass(String newClass) {
       if(!super.getClassList().contains(newClass)){
           throw new RuntimeException("Error in the add class");
       }
    }

    @Override
    public void removeClass(String newClass) {

    }

    @Override
    public void editClass(String newClass) {

    }


}
