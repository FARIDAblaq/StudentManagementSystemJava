/*
 * File: Student.java
 * Project: Student Information Management System
 * File Created: Wednesday, 27th April 2022 
 * Author: Farida Eleshin, Ann-Vanessa Lartey
 * Email: faridaeleshin@gmail.com
 * Version: 1.0
 * Brief: 
 * -A student management systems that allows adding, removal, and changing a students name
 * It also allows functionalities such as finding a student. printing a particular student's details, 
 * listing all students etc.  
 * Copyright ©2022 Farida Eleshin
 */

import java.util.*;
public class Student{
    //Initialising hashtable and ArrayList
    HashMap <Integer, Student> students = new HashMap<Integer, Student>();
    ArrayList<Student> allstudents = new ArrayList<>();
    String[] studentarray = new String [10];
    
    private int count;

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

   /**
    * This method adds a student to the students hashtable and allstudents arraylist
    * @param id
    * @param name
    */
    public void addStudent(int id, Student name){
        students.putIfAbsent(id, name); //Adds student only if they are absent in the hashtable
        allstudents.add(name); //adds the same student into the arraylist
        studentarray[count]=name.name; //adds name of student to studentarray
        count++;
        System.out.println("Student with id "+id+" has been added");
    }
 
    /**
    * This method deletes a students from the hashtable and arraylist
    * @param id
    * @param name
    * @throws NullPointerException
    */
    public void removeStudent (int id, Student name)throws NullPointerException{
        //check if both data structures are empty
        if(students.isEmpty()|| allstudents.isEmpty()){
            System.out.println("There are no students in this system, the particular student doesn't exist");
        }
        for(Student student: allstudents){
            if(student.id==id){
                students.remove(id); //remove from hashtable
                allstudents.remove(name); //remove from arraylist
                System.out.println("Student"+name+"been removed");
            }
            else{
                System.out.println("Invalid 1D");  //if not, remove the target student from both the hashtable and Arraylist
            }
        }        
    }
 
    /**
    * This method edits the name of the student
    * @param id
    * @param name
    */
    public void changeStudentname(int  id, String name) {
        //check if all databases are empty
        if(students.isEmpty()|| allstudents.isEmpty()||count==0){
            System.out.print("This database is empty");
        }
        //changing the name in the arraylist all students
        for(Student student: allstudents){
            if(student.id==id){ //check for the particular id
                student.name = name; //replace the old name with the newname

                //changing the name in the array studentarray
                for(int i=0; i< count; i++){ //traverse the student array
                    if(studentarray[i]==student.name){ 
                        studentarray[i]=name; //replace the original name
                    }
                }
            } else{
                System.out.print("Invalid ID "); //print invalid id if the id cannot be found
            }
        }
    }
 
    /**
    * This methods looks up a student if their information is present
    * @param id
    */
    public void findStudent(int id) throws IllegalFormatException{
        if(students.isEmpty()|| allstudents.isEmpty()||count==0){
            System.out.print("This database is empty");
        }
        for(Student student: allstudents){ //traverse the arraylist
            if(student.id==id){  //find the target id
                System.out.println("Student with id number "+id+" is here");
            }
            else{
                System.out.println("Student with id number "+id+" is not here, INVALID ID"); //error message
            }
        } 
    }
 
    /**
    * This method looks up a student and print their details
    * @param id
    */
    public void printStudentdetails(int id){
        if(students.isEmpty()|| allstudents.isEmpty()||count==0){
            System.out.print("This database is empty");
        }
        for(Student student: allstudents){
            if(student.id==id){
                //print all the details of the student
                System.out.println(" ID: "+student.getId()+"\n NAME: "+student.getName()+"\n GENDER: "+student.getGender()
                +"\n EMAIL: "+student.getEmail()+"\n COURSE: "+student.getCourse()+"\n GPA: "+student.getGpa()+"\n YEARGROUP: "+
                student.getYeargroup()+"\n NATIONALITY: "+student.getNationality());System.out.println();
            }
            else{
                System.out.println("Invalid ID");
            }
        }
    }

    /**
     * This method prints the names of all students in the system
     * @throws NullPointerException
     */
    public void printStudent() throws NullPointerException{
        if(students.isEmpty()|| allstudents.isEmpty()||count==0){
            System.out.print("This database is empty");
        }
        for(Student student: allstudents){
            //print all the details of students
            System.out.println(" ID: "+student.getId()+"\n NAME: "+student.getName()+"\n GENDER: "+student.getGender()
            +"\n EMAIL: "+student.getEmail()+"\n COURSE: "+student.getCourse()+"\n GPA: "+student.getGpa()+"\n YEARGROUP: "+
            student.getYeargroup()+"\n NATIONALITY: "+student.getNationality());System.out.println();
        }
    }
 
    /**
    * This method returns the names of students with a gpa gher that 
    * @param gpa
    */
    public void printAboveAGPA(double gpa){
        if(students.isEmpty()|| allstudents.isEmpty()||count==0){
            System.out.print("This database is empty");
        }
        for(Student student: allstudents){
            if(student.gpa > gpa){
                System.out.println(student.name);
            }else{
                System.out.println(student.name+" has a lower gpa");
            }
        }
    }
 
    /**
    * This method returns the names of students in a particular yeargroup 
    * @param year
    */
     public void studentInaYeargroup(int year){
        if(students.isEmpty()|| allstudents.isEmpty()||count==0){
            System.out.print("This database is empty");
        }
        for(Student student: allstudents){
            if(student.yeargroup == year){
                System.out.println(student.name);
            }
            else{
                System.out.println("There are no students in this yeargroup or invalid year");
            }
        }
    }
 
     /**This method prints the names of all students */
    public void printAllStudentnames(){
        if(students.isEmpty()|| allstudents.isEmpty()||count==0){
            System.out.print("This system is empty");
        }
        for(int i=0; i<count;i++){
            System.out.println(studentarray[i]);
        }
    } 
}