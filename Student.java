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


import java.util.*;
public class Student{
    public static enum Gender { // Gender data type takes either: MALE or FEMALE
        MALE, FEMALE
    };

    private int id, yeargroup;
    private String name,email,course,nationality;
    private double gpa;
    private Gender gender;
    private int count;

    //Initialising hashtable and ArrayList
    HashMap <Integer, Student> students = new HashMap<Integer, Student>();
    ArrayList<Student> allstudents = new ArrayList<>();
    String[] studentarray = new String [10];

    //Constructor
    public Student(String name,int id, String course,int yeargroup, String email, Gender gender,
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
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
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
            System.out.println("There are no students in this database, the particular student doesn't exist");
        }
        //if not, remove the target student from both the hashtable and Arraylist
        students.remove(id); //remove from hashtable
        allstudents.remove(name); //remove from arraylist
        
    }

    /**
     * This method edits the name of the student
     * @param id
     * @param name
     */
    public void changeStudentname(int  id, String name) {
        for(Student student: allstudents){
            if(student.id==id){ //check for the particular id
                student.name = name; //replace the old name with the newname
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
     * This method returns the names of students with a gpa gher that 
     * @param gpa
     */
    public void printAboveAGPA(double gpa){
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
        for(Student student: allstudents){
            if(student.yeargroup == year){
                System.out.println(student.name);
            }
            //else{
            //     System.out.println("Student is in another year group or invalid year");
            // }
        }
    }

    /**This method prints the names of all students */
    public void printAllStudentnames(){
        for(int i=0; i<count;i++){
            System.out.println(studentarray[i]);
        }
    }

    /**
     * Main method for testing all the methods
     * @param args
     */
    public static void main(String[] args){
        /**
         * Testing all the methods previously created and all the edge cases
         */
        //Creating instances of Student class
        Student FirstStudent = new Student("Adwoa Buckman", 1232022, "Computer Science", 
        2022, "adwoabuckman@gmail.com", Gender.FEMALE, 3.45, "Ghanaian");

        Student SecondStudent = new Student("Nadia KJ", 12342025, "Management Information System", 
        2022, "nadiakj@gmail.com", Gender.FEMALE, 3.56, "Zimbabwean");

        Student ThirdStudent = new Student("Kofi Ofori", 1232024, "Computer Science", 
        2024
        , "kofiofori@gmail.com", Gender.MALE, 3.54, "Chinese");

        /**Testing the addStudent method */
        FirstStudent.addStudent(1232022, FirstStudent); //add a student
        SecondStudent.addStudent(12342026, SecondStudent);
        ThirdStudent.addStudent(1232024, ThirdStudent);

        /**Testing the findStudent method */
        FirstStudent.findStudent(1232022);  //find that student
        FirstStudent.findStudent(1242022);  //edge case
        SecondStudent.findStudent(12342025);  //find that student
        ThirdStudent.findStudent(1232024);  //find that student
        System.out.println();
        
        /**Testing the printStudentdetails method */
        FirstStudent.printStudentdetails(1232022);
        SecondStudent.printStudentdetails(12342025);
        ThirdStudent.printStudentdetails(1232024);
        SecondStudent.printStudentdetails(1234202); //edge case

        /**Testing the printAllstudent method */
        System.out.println();
        FirstStudent.printAllStudentnames();
        SecondStudent.printAllStudentnames();
        ThirdStudent.printAllStudentnames();

        /**Testing change student name */
        FirstStudent.changeStudentname(1232022, "Priscilla Gwumaah"); //change their name
        System.out.println();
        System.out.println("Student details after name change");
        FirstStudent.printStudentdetails(1232022);

        /**Testing printAboveGPA method */
        ThirdStudent.printAboveAGPA(3.7);
        FirstStudent.printAboveAGPA(3.1);
        SecondStudent.printAboveAGPA(3.1);

        /**Testing student in a particular year group method */
        System.out.println();
        FirstStudent.studentInaYeargroup(2022);
        SecondStudent.studentInaYeargroup(2024); //edge case
        SecondStudent.studentInaYeargroup(2022);
        ThirdStudent.studentInaYeargroup(2022); //edge case
        
        /**Testing delete student and empty hashtable analogy */
        System.out.println();
        FirstStudent.removeStudent(1232022, FirstStudent); //add a student
        SecondStudent.removeStudent(12342026, SecondStudent);
        ThirdStudent.removeStudent(1232024, ThirdStudent);
        ThirdStudent.removeStudent(1232024, ThirdStudent); //edge case
    }    
}