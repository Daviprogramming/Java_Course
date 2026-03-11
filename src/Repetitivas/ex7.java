package Repetitivas;

import java.util.Scanner;

// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
public class ex7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            if (y == 0){
                System.out.println("Divisão impossível");
            }
            else{
                System.out.println(x/y);
            }
        }

        sc.close();
    }
}