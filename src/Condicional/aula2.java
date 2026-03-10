package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class aula2{
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double conta = 50.0;
    double valor = sc.nextDouble();

    if(valor > 100){
        conta += (valor - 100) * 2;
        System.out.printf("O valor da conta foi de %.2f\n", conta);
    }
    else{
        System.out.printf("O valor da conta foi de: 50");
    }
    }
}