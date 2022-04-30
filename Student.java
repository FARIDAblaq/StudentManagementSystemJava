/*
 * File: Student.java
 * Project: Student Information Management System
 * File Created: Wednesday, 27th April 2022 
 * Author: Farida Eleshin, Ann-Vanessa Lartey
 * Email: faridaeleshin@gmail.com
 * Version: 1.0
 * Brief: 
 * -----
 * Copyright ©2022 Farida Eleshin
 */

//import java.util.*;
public class Student{
    // public static enum Gender { // Gender data type takes either: MALE or FEMALE
    //     MALE, FEMALE
    // };

    protected int id, yeargroup;
    protected String name,email,course,nationality;
    protected double gpa;
    protected String gender;
    //default constructor
    public Student(){}
    //Constructor
    public Student(String name,int id, String course,int yeargroup, String email, String gender,
		double gpa, String nationality) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.yeargroup = yeargroup;
        this.email = email;
        this.gender = gender;
        this.gpa = gpa;
        this.nationality = nationality;
    }

    /**
     * Setters and getters of all variables in the program
     * @author Ann-Vannessa Lartey
     * @return id, name, email,nationality, course, yeargroup, gpa, gender
     */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public int getYeargroup() {
        return yeargroup;
    }
    public void setYeargroup(int yeargroup) {
        this.yeargroup = yeargroup;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa; 
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void addStudent(int id2, Student studentone) {
    }
}