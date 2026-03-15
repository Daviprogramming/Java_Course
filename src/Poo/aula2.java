package Poo;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class aula2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double aX, bX, cX;
        double aY, bY, cY;
        double p,p2, area, area2;
        System.out.println("Enter the measures of triangle X:");
        aX = sc.nextDouble();
        bX = sc.nextDouble();
        cX = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        aY = sc.nextDouble();
        bY = sc.nextDouble();
        cY = sc.nextDouble();
        p = (aX + bX + cX) / 2;
        area = sqrt(p * (p-aX)* (p-bX)*(p-cX));
        p2 = (aY + bY + cY) / 2;
        area2 = sqrt(p2 * (p2-aY)* (p2-bY)*(p2-cY));

        System.out.printf("Triangle X area: %.4f\n", area);
        System.out.printf("Triangle Y area: %.4f\n", area2);
        System.out.println(area > area2 ? "Larger area: X" : "Larger area: Y");

        sc.close();
    }
}

