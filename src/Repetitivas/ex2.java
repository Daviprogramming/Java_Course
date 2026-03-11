package Repetitivas;
// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
import java.util.Scanner;

public class ex2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        while(x != 0 && y!= 0){
             if(x > 0 && y > 0){
                System.out.println("Q1");
             }
             else if(x > 0 && y < 0){
                 System.out.println("Q4");
             }
             else if(x < 0 && y > 0){
                 System.out.println("Q2");
             }
             else{
                 System.out.println("Q3");
             }
             x = sc.nextDouble();
             y = sc.nextDouble();
        }

        sc.close();
    }
}