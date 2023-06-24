package com.mycode.designpatternscreationalsingleton.entities;


import lombok.Getter;
import lombok.Setter;

public class Student {
    @Setter
    @Getter
    private String firstName;

    @Setter
    @Getter
    private String lastName;
    private static Student student = null;

    private Student() {

    }

    private Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static Student getInstance() {
        if (student == null)
            student = new Student();
        return student;
    }

    public static Student getInstance(String firstName, String lastName) {
        if (student == null)
            student = new Student(firstName, lastName);
        else {
            student.setFirstName(firstName);
            student.setLastName(lastName);
        }
        return student;
    }

}
