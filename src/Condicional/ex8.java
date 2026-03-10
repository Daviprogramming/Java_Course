package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class ex8{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double imposto;
        if(salario <= 2000){
            System.out.println("Isento");
        }
        else if(salario <= 3000){
            imposto = (salario - 2000) * 8 / 100;
            System.out.printf("R$ %.2f\n", imposto);
        }
        else if(salario <= 4500){
            imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        }
        else{
            imposto = (salario - 4000) * 0.28 + 1500 * 0.18 + 1000 * 0.08 ;
            System.out.printf("R$ %.2f\n", imposto);
        }
        sc.close();
    }
}