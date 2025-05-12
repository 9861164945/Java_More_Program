package com.AssignmentJavaNit;

import java.util.Scanner;

public class EmpTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter EmployeeId:");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter the name of the employee:");
        String name = sc.nextLine();
        System.out.println("Enter salary of the Employee:");
        double salary = sc.nextDouble();
        
        
        Employee e1 = new Employee(id, name, salary);
        //System.out.println(e1);

   
        if (salary >= 60000) {
            System.out.println(name+" is a Developer.");
        } else if (salary >= 40000 && salary < 60000) {
            System.out.println(name+" is a Designer.");
        } else if(salary<40000 && salary>0){
            System.out.println(name+" is a Tester.");
        }
        else {
        	System.err.println("Employee Doesnot exist");
        }

        sc.close(); 
    }
}
