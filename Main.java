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
public class Main {
     /**
     * Main method for testing all the methods
     * @param args
     */
    public static void main(String[] args) throws Exception{
        /**
        * Testing all the methods previously created and all the edge cases
        */
        Student studentone = new Student();

        System.out.println("Hello, Welcome to my Student Information Management System!");
        System.out.println("What do you want to do? Check the functionalities below");
        System.out.println("Enter 1 to Add a student");
        System.out.println("Enter 2 remove to remove a student");
        System.out.println("Enter 3 to print a student details");
        System.out.println("Enter 4 to list students within a particular yeargroup");
        System.out.println("Enter 5 to find a student");
        System.out.println("Enter 6 to find students above a certain GPA, in an alphabetical order");
        System.out.println("Enter 7 to find print the details of a particular student");
        System.out.println("Enter 8 to change a student name");
        System.out.println("Enter 9 quit to exit application");
        System.out.println("Enter 10 to repeat this menu");
        System.out.println();
       
        /* Takes as input the number of tasks you want to perform in the application at a go */
        try {
            System.out.println("Enter number:");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();

            if(num > 10 || num < 1){
                System.out.println("Enter only numbers between 1 and 10");
            }else{
                switch (num) {
                    case 1:
                        System.out.println("Enter Student id:");
                        Scanner SId = new Scanner(System.in);
                        int id = SId.nextInt();
                        studentone.setId(id);

                        System.out.println("Enter Student name:");
                        Scanner Sname = new Scanner(System.in);
                        String name = Sname.nextLine();
                        studentone.setName(name);

                        System.out.println("Enter Student email:");
                        Scanner Semail = new Scanner(System.in);
                        String email = Semail.next();
                        studentone.setEmail(email);

                        System.out.println("Enter Student yeargroup:");
                        Scanner SYeargroup = new Scanner(System.in);
                        int yearGroup = SYeargroup.nextInt();
                        studentone.setYeargroup(yearGroup);

                        System.out.println("Enter Student course:");
                        Scanner Scourse = new Scanner(System.in);
                        String course = Scourse.nextLine();
                        studentone.setCourse(course);

                        System.out.println("Enter Student gender:");
                        Scanner Sgender = new Scanner(System.in);
                        String gender = Sgender.next();
                        studentone.setGender(gender);

                        System.out.println("Enter Student nationality:");
                        Scanner Snationality = new Scanner(System.in);
                        String nationality = Snationality.next();
                        studentone.setNationality(nationality);

                        studentone.addStudent(id, studentone);
                        break;
                    case (2):
                        System.out.println("Enter id of the student you want to delete:");
                        Scanner SId2 = new Scanner(System.in);
                        int id2 = SId2.nextInt();
                        studentone.removeStudent(id2);

                
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            //TODO: handle exception
            throw new IllegalArgumentException("Please enter a number only");
        }
        
        
        
        

        










        //Creating instances of Student class
        // Student FirstStudent = new Student("Adwoa Buckman", 1232022, "Computer Science", 
        // 2022, "adwoabuckman@gmail.com", Gender.FEMALE, 3.45, "Ghanaian");

        // Student SecondStudent = new Student("Nadia KJ", 12342025, "Management Information System", 
        // 2022, "nadiakj@gmail.com", Gender.FEMALE, 3.56, "Zimbabwean");

        // Student ThirdStudent = new Student("Kofi Ofori", 1232024, "Computer Science", 
        // 2024
        // , "kofiofori@gmail.com", Gender.MALE, 3.54, "Chinese");

        // /**Testing the addStudent method */
        // FirstStudent.addStudent(1232022, FirstStudent); //add a student
        // SecondStudent.addStudent(12342026, SecondStudent);
        // ThirdStudent.addStudent(1232024, ThirdStudent);

        // /**Testing the findStudent method */
        // FirstStudent.findStudent(1232022);  //find that student
        // FirstStudent.findStudent(1242022);  //edge case
        // SecondStudent.findStudent(12342025);  //find that student
        // ThirdStudent.findStudent(1232024);  //find that student
        // Systemfunctionalities.out.println();
        
        // /**Testing the printStudentdetails method */
        // FirstStudent.printStudentdetails(1232022);
        // SecondStudent.printStudentdetails(12342025);
        // ThirdStudent.printStudentdetails(1232024);
        // SecondStudent.printStudentdetails(1234202); //edge case

        // /**Testing the printAllstudent method */
        // Systemfunctionalities.out.println();
        // FirstStudent.printAllStudentnames();
        // SecondStudent.printAllStudentnames();
        // ThirdStudent.printAllStudentnames();

        // /**Testing change student name */
        // FirstStudent.changeStudentname(1232022, "Priscilla Gwumaah"); //change their name
        // Systemfunctionalities.out.println();
        // Systemfunctionalities.out.println("Student details after name change");
        // FirstStudent.printStudentdetails(1232022);

        // /**Testing printAboveGPA method */
        // ThirdStudent.printAboveAGPA(3.7);
        // FirstStudent.printAboveAGPA(3.1);
        // SecondStudent.printAboveAGPA(3.1);

        // /**Testing student in a particular year group method */
        // Systemfunctionalities.out.println();
        // FirstStudent.studentInaYeargroup(2022);
        // SecondStudent.studentInaYeargroup(2024); //edge case
        // SecondStudent.studentInaYeargroup(2022);
        // ThirdStudent.studentInaYeargroup(2022); //edge case
        
        // /**Testing delete student and empty hashtable analogy */
        // Systemfunctionalities.out.println();
        // FirstStudent.removeStudent(1232022, FirstStudent); //add a student
        // SecondStudent.removeStudent(12342026, SecondStudent);
        // ThirdStudent.removeStudent(1232024, ThirdStudent);
        // ThirdStudent.removeStudent(1232024, ThirdStudent); //edge case
    }    
    
}
