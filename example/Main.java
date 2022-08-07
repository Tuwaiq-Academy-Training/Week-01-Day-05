package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student=new Student("Saleh",123,23,50);
        Teacher teacher=new Teacher("Ali",333,50,1000);

     //  student.addClass("Math");
//        student.welcomeMessage();

        helloMessage("saleh",23);
        helloMessage(50,"Ali");

        Student student1=new Student(123,123);

//        Scanner scanner=new Scanner()

        Student student2=new Student();

        Course course=new Course(1);

//        Person person1=new Student();
//        Person person2=new Teacher(null,0,0,0);


//        Person person=new Person(12);

    //    person.addClass("Math");


        teacher.addClass("Math");

        teacher.removeClass("Math");

        student.addClass("Math");



    }

    public static void helloMessage(String name,int age){
        System.out.println("Hey message 2");
    }

    public static void helloMessage(int age,String name){
        System.out.println("Hey "+name+" , welcome to the class");
    }
}
