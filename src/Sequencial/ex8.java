package Sequencial;
// Fazer um programa para ler o código de uma peça 1
// , o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
// Calcule e mostre o valor a ser pago.
import java.util.Scanner;
import java.util.Locale;

public class ex8{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo1, pecas1, codigo2, pecas2 ;
        double valorpeca1, valorpeca2, total;


        codigo1 = sc.nextInt();
        pecas1 = sc.nextInt();
        valorpeca1 = sc.nextDouble();
        codigo2 = sc.nextInt();
        pecas2 = sc.nextInt();
        valorpeca2 = sc.nextDouble();
        total = (pecas1 * valorpeca1) + (pecas2 * valorpeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
        sc.close();


    }
}
