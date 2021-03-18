
/**
 * StudentDriver is a class that contains the main method and uses
 * the Student class to create and display objects.
 *
 * @author (Ms. Schulze)
 * @version (1.2)
 */

import java.util.Scanner;

public class StudentDriver
{
    static void clearScreen() {
        System.out.print('\u000C');
    }
    
    public static void main(String[] args) {
        // Clear Screen
        clearScreen();
        
        // Initialize Input Scanner
        Scanner key = new Scanner(System.in);
        
        /// Initialize Student
        Student newStudent = new Student("name", 1, "department", 0.0);
        
        // Initialize Variables
        String inputName;
        int inputId;
        String inputDepartment;
        float inputGPA;
        
        // Introductory greeting
        System.out.println("Welcome, Classy Student, to the Student class.");
        
        // Input a new student
        System.out.print("Input the student's name:  ");
        inputName = key.next();
        
        System.out.print("Input the student's id:  ");
        inputId = key.nextInt();
        
        System.out.print("Input the student's department:  ");
        inputDepartment = key.next();
        
        System.out.print("Input the student's GPA:  ");
        inputGPA = key.nextFloat();
        
        // Input a second new student
        System.out.println("Let's try another student!");
        Student anotherStudent = Student.inputStudentData();
        
        // Initialize a student with the given data
        newStudent.setStudent(inputName, inputId, inputDepartment, inputGPA);
        
        // Print both students' information
        newStudent.printStudentInfo();
        anotherStudent.printStudentInfo();
        
        // Print out first student's information
        System.out.println();
        System.out.println("Here's the student's information.");
        System.out.println("Name:  " + newStudent.getName());
        System.out.println("ID:  "  + newStudent.getId());
        System.out.println("Department:  " + newStudent.getDepartment());
        System.out.println("GPA:  " + newStudent.getGPA()); 
    }
}