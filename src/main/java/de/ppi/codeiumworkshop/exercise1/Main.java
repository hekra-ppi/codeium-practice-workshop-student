package de.ppi.codeiumworkshop.exercise1;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("John Doe", 30, "john.doe@example.com", "Developer", 60000);
        System.out.println(emp.getEmployeeDetails());

        emp.promote("Senior Developer", 10);
        System.out.println(emp.getEmployeeDetails());
    }    
}
