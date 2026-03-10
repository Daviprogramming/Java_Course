package Condicional;

import java.util.Scanner;

// Leia a hora inicial e a hora final de um jogo.
// A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima
// de 1 hora e máxima de 24 horas.
public class ex4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inicio, fim, total;
        inicio = sc.nextInt();
        fim = sc.nextInt();
        if (inicio >= fim){
            total = 24 - inicio + fim;
            System.out.printf("A duração total do jogo foi de: %d Horas", total);

        }
        else {
            total = fim - inicio;
            System.out.printf("A duração total do jogo foi de: %d Horas2", total);
        }
        sc.close();
    }
}