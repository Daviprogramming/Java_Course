package Condicional;
//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

import java.util.Scanner;

public class ex5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int codigo, quantidade;
        double total = 0;
        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if(codigo == 1){
            total = quantidade * 4;
        }
        else if(codigo == 2){
            total = quantidade * 4.5;
        }
        else if(codigo == 3){
            total = quantidade * 5;
        }
        else if(codigo == 4){
            total = quantidade * 2;
        }
        else if(codigo == 5){
            total = quantidade * 1.5;
        }

        System.out.printf("O total a pagar é de: %.2fR$\n", total);

        sc.close();

    }
}