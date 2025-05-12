package com.AssignmentJavaNit;

public class Employee {
    public int employeeNumber;
    public String employeeName;
    public double employeeSalary;

    public Employee(int employeeNumber, String employeeName, double employeeSalary) //parameterized constructor
    {
        if (employeeNumber <= 0) {
            System.err.println("Id must be always positive");
        } else if (employeeName == null || employeeName.isEmpty()) {
            System.err.println("Name must be initialized with any default name");
        } else if (employeeSalary <= 0) {
            System.err.println("Salary cannot be negative or zero");
        } else {
            this.employeeNumber = employeeNumber;
            this.employeeName = employeeName;
            this.employeeSalary = employeeSalary;
        }
    }

    @Override
    public String toString() {
        return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSalary="
                + employeeSalary + "]";
    }
}
