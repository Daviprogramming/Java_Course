package Poo.application;

import java.util.Scanner;
import Poo.entities.Triangle;
import static java.lang.Math.sqrt;

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
        p = (x.a + x.b + x.c) / 2;
        area = sqrt(p * (p-x.a)* (p-x.b)*(p-x.c));
        p2 = (y.a + y.b + y.c) / 2;
        area2 = sqrt(p2 * (p2-y.a)* (p2-y.b)*(p2-y.c));

        System.out.printf("Triangle X area: %.4f\n", area);
        System.out.printf("Triangle Y area: %.4f\n", area2);
        System.out.println(area > area2 ? "Larger area: X" : "Larger area: Y");

        sc.close();
    }
}

