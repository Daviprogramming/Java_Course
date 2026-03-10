package Condicional;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
public class ex2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Numero par");
        }
        else{
            System.out.println("Numero ímpar");
        }
        sc.close();
    }
}