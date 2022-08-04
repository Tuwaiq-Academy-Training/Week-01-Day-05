package com.company.OOP;


import java.util.ArrayList;
import java.util.stream.Stream;

public class Student {

    public  String name;
    private int age;
    private String id;
    private String phoneNumber;
    private ArrayList <Course>courseList=new ArrayList();
    public static String schoolName;

    public Student(String name, int age, String id, String phoneNumber) {
        setName(name);
        this.age=age;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public void addCourse(Course course){
        courseList.add(course);
    }

    public void removeCourse(Course course){
        courseList.remove(course);
    }

    public void printCourseList() {
        System.out.println(sortCourse());
    }

    private Stream<Course> sortCourse(){
        return courseList.stream().sorted();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<3){
         return;
        }
        this.name = name;
    }

    public int getAge() {
        System.out.println(phoneNumber);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static boolean checkSchoolName(){

        setAge(10);
        if (schoolName == null) {
            return false;
        } else {
            return true;
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}




