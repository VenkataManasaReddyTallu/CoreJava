import java.util.*;
class Employee {
    int salary = 30000;
    void displaySalary() {
        System.out.println("Base Salary: " + salary);
    }
}

class Manager extends Employee {
    int bonus = 10000;

    void displaySalary() {
        System.out.println("Total Salary: " + (salary + bonus));
    }

    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.displaySalary();
    }
}