package Condicional;
//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class ex1{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int numero;
    numero = sc.nextInt();
    if(numero >= 0){
        System.out.println("O número é positivo");
    }
    else{
        System.out.println("O número é negativo");
    }

    }
}
