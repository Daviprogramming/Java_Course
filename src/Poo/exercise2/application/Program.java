package Poo.exercise2.application;
import Poo.exercise2.entities.Employee;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee trabalhador = new Employee();
        System.out.println("Name: ");
        trabalhador.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        trabalhador.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        trabalhador.tax = sc.nextDouble();

        System.out.println("Employee: " + trabalhador);
        System.out.println("Which percentage to increase salary? ");
        trabalhador.increaseSalary(sc.nextDouble());

        System.out.println("Updated data: "+ trabalhador);






        sc.close();

    }
}
