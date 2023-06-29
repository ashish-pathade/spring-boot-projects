package com.student.management.model;

public class Student {
    int studentId;
    String firstname;
    String lastName;

    public Student(int studentId, String firstname, String lastName) {
        this.studentId = studentId;
        this.firstname = firstname;
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
