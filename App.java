/*
 * File: Student.java
 * Project: Student Information Management System
 * File Created: Wednesday, 27th April 2022 
 * Author: Farida Eleshin, Ann-Vanessa Lartey
 * Email: faridaeleshin@gmail.com
 * Version: 1.0
 * Brief: 
 * -----A main nethod to all the finctionalities of the Student Management System
 * Copyright ©2022 Farida Eleshin
 */
import java.util.*;
public class App extends Functionalities{
    public static void main(String[] args) throws Exception {

       /**
        * Testing all the methods previously created and all the edge cases
        */
        Student studentone = new Student();

        int num=0;
        do {
            System.out.println();
            System.out.println("Hello, Welcome to my Student Information Management System!");
            System.out.println("What do you want to do? Check the functionalities below");
            System.out.println("Enter 1 to Add a student");
            System.out.println("Enter 2 remove to remove a student");
            System.out.println("Enter 3 to print all student names");
            System.out.println("Enter 4 to list students within a particular yeargroup");
            System.out.println("Enter 5 to find a student");
            System.out.println("Enter 6 to find students above a certain GPA");
            System.out.println("Enter 7 to find print the details of a particular student");
            System.out.println("Enter 8 to change a student name");
            System.out.println("Enter 9 to print the names of all students");
            System.out.println("Enter 10 to quit to exit application");
            System.out.println();

            System.out.println("Enter number:");
            try {
                Scanner input = new Scanner(System.in);
                num = input.nextInt();

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
                            System.out.println();

                            System.out.println("Enter Student gpa:");
                            Scanner Sgpa = new Scanner(System.in);
                            Double gpa = Sgpa.nextDouble();
                            studentone.setGpa(gpa);
                            System.out.println();

                            studentone.addStudent(id, studentone);
                            break;

                        case (2):
                            System.out.println("Enter id of the student you want to delete:");
                            Scanner SId2 = new Scanner(System.in);
                            int id2 = SId2.nextInt();
                            System.out.println();
                            studentone.removeStudent(id2, studentone);
        
                            break;
                        case(3):
                        studentone.printAllStudentnames();
                            System.out.println();
                            break;
                        case(4):
                            System.out.println("Enter the yeargroup:");
                            Scanner SYeargroup2 = new Scanner(System.in);
                            int yearGroup2 = SYeargroup2.nextInt();
                            studentone.printStudent();
                            studentone.studentInaYeargroup(yearGroup2);
                            break;
                        case(5):
                            System.out.println("Enter id of the student you want to find:");
                            Scanner SId4 = new Scanner(System.in);
                            int id4 = SId4.nextInt();
                            studentone.printStudent();
                            studentone.findStudent(id4);
                            break;
                        case(6):
                            System.out.println("Enter gpa:");
                            Scanner Sgpa2 = new Scanner(System.in);
                            Double gpa2 = Sgpa2.nextDouble();
                            studentone.printStudent();
                            studentone.printAboveAGPA(gpa2);
                            break;
                        case(7):
                            System.out.println("Enter id of the student:");
                            Scanner SId5 = new Scanner(System.in);
                            int id5 = SId5.nextInt();
                            studentone.printStudentdetails(id5);
                            break;
                        case(8):
                            System.out.println("Enter id of the student whose name you want to change:");
                            Scanner SId6 = new Scanner(System.in);
                            int id6 = SId6.nextInt();

                            System.out.println("Enter the new Student name:");
                            Scanner Sname2 = new Scanner(System.in);
                            String name2 = Sname2.nextLine();
                            studentone.changeStudentname(id6, name2);
                            break;
                        case(9):
                            studentone.printAllStudentnames();
                            System.out.println();
                            studentone.printStudent();
                            break;
                        case(10):
                            System.out.println();
                            System.out.println("Exiting application.....");
                            break;
                    }
                }
            }catch (Exception e) {
                throw new IllegalArgumentException("Please enter a number only");
            }
        }while (num!=10);
    }
}
