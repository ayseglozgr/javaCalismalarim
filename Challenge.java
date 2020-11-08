/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        String first = scanner.nextLine();
        System.out.println("Enter last name:");
        String last = scanner.nextLine();
        System.out.println("Enter monthly salary:");
        double salary = scanner.nextDouble();
        Employee e1 = new Employee(first, last, salary);

        System.out.println("First name:" + e1.getFirst());
        System.out.println("Last name:" + e1.getLast());
        System.out.println("Salary:" + e1.getSalary());
    }

}

class Employee {

    private String first;
    private String last;
    private double salary;

    public Employee(String first, String last, Double salary) {
        this.first = first;
        this.last = last;
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;

        }
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public double getSalary() {
        return salary;

    }

    public void setSalary(double salary) {
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }
}
