package Poo.exercise3.application;

import Poo.exercise3.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student estudante = new Student();

        System.out.println("Name: ");
        estudante.name = sc.nextLine();

        System.out.println("First trimester:");
        estudante.primeiroTrimestre = sc.nextDouble();

        System.out.println("Second trimester:");
        estudante.segundoTrimestre = sc.nextDouble();

        System.out.println("Third trimester:");
        estudante.terceiroTrimestre = sc.nextDouble();

        System.out.println(estudante);


        sc.close();
    }

}
