package Repetitivas;

import java.util.Scanner;

public class aula2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int soma = 0;
        for(int i = 0; i < N; i++){
            int numero = sc.nextInt();
            soma += numero;
        }
        System.out.println(soma);
        sc.close();
    }
}