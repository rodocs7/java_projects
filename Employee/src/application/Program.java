package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Gross salary: ");
        double grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        double tax = sc.nextDouble();
        

        Employee emp = new Employee(name, grossSalary, tax);

        System.out.println("Employee: " + emp);

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        

        System.out.println("Updated data: " + emp);

        sc.close();
    }
}