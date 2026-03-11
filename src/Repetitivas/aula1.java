package Repetitivas;

import java.util.Scanner;

public class aula1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        int contador = 0;
        while(numero != 0){
            numero = sc.nextInt();
            contador += numero;

        }
        System.out.printf("%d", contador);
    sc.close();
    }
}