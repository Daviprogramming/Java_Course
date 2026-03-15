package Poo.triangle.application;

import java.util.Scanner;
import Poo.triangle.entities.Triangle;

public class aula2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        double p,p2, area, area2;
        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);
        System.out.println(areaX > areaY ? "Larger area: X" : "Larger area: Y");

        sc.close();
    }
}

