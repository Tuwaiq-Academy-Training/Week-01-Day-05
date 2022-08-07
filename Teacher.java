package com.company;

import java.lang.reflect.Type;
import java.time.temporal.Temporal;
import java.util.ArrayList;

public class Teacher extends Person implements School {

    private int salary;

    public Teacher(String name, int id, int age, int salary) {
        super(name,id,age);
        this.salary = salary;
        System.out.println(SCHOOL_NAME);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void addClass(String newClass) {
        super.getClassList().add(newClass);
    }

    @Override
    public void removeClass(String newClass) {

    }

    @Override
    public void editClass(String newClass) {

    }

    @Override
    public String getSchoolName() {
        return null;
    }

    @Override
    public String getAdmin() {
        return null;
    }

    @Override
    public String print() {
        return "Teacher{" +
                "salary=" + salary +
                '}';
    }
}
