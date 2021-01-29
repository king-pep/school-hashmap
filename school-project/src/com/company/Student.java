package com.company;

public class Student {

    private String firstName;
    private String lastName;
    private long idNo;
    private String faculty;

    public Student(String firstName, String lastName, long idNo, String faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNo = idNo;
        this.faculty = faculty;
    }

    public Student(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getIdNo() {
        return idNo;
    }

    public void setIdNo(long idNo) {
        this.idNo = idNo;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNo=" + idNo +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
