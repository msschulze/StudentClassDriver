
/**
 * Student is a free-standing class that can be used by other classes
 * or the main program to create obejects and drive the class.
 *
 * @author (Ms. Schulze)
 * @version (1.1)
 */

import java.util.Scanner;

public class Student
{
    String name;
    int id;
    String department;
    double gpa;
    
    // Define parameters for the Student object
    public Student(String newName, int newId, String newDepartment, double newGPA) {
        name = newName;
        id = newId;
        department = newDepartment;
        gpa = newGPA;
    }
    
    public void setStudent(String newName, int newId, String newDepartment, double newGPA) {
        name = newName;
        id = newId;
        department = newDepartment;
        gpa = newGPA;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public double getGPA() {
        return gpa;
    }
    
    static void print(String toPrint) {
        System.out.println(toPrint);
    }
    
    static Student inputStudentData() {
        // Initialize Input Scanner
        Scanner key = new Scanner(System.in);
        
        // Initialize Variables
        String inputName;
        int inputId;
        String inputDepartment;
        float inputGPA;
        
        System.out.print("Input the student's name:  ");
        inputName = key.next();
        
        System.out.print("Input the student's id:  ");
        inputId = key.nextInt();
        
        System.out.print("Input the student's department:  ");
        inputDepartment = key.next();
        
        System.out.print("Input the student's GPA:  ");
        inputGPA = key.nextFloat();
        
        Student thisStudent = new Student(inputName, inputId, inputDepartment, inputGPA);
        
        thisStudent.setStudent(inputName, inputId, inputDepartment, inputGPA);
        
        return thisStudent;
    }
    
    public void printStudentInfo() {
        System.out.println();
        System.out.println("Here's the student's information.");
        System.out.println("Name:  " + name);
        System.out.println("ID:  "  + id);
        System.out.println("Department:  " + department);
        System.out.println("GPA:  " + gpa);
    }
    
    
}