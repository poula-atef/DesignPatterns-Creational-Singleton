package com.mycode.designpatternscreationalsingleton;

import com.mycode.designpatternscreationalsingleton.entities.Student;

public class SingletonDesignPattern {
    public static void main(String[] args) {
        Student student1 = Student.getInstance();
        student1.setFirstName("Peter");
        // will print Peter
        System.out.println(student1.getFirstName());


        Student student2 = Student.getInstance("Poula","Atef");
        // will print Poula
        System.out.println(student1.getFirstName());
        // will print Poula
        System.out.println(student2.getFirstName());


        student1.setFirstName("Ahmed");

        // will print Ahmed
        System.out.println(student2.getFirstName());

    }
}
