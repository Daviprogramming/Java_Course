package IntroducaoAProgramacao;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class aula1 {
    public static void main(String[] args){


        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        LocalDate dataAnterior = LocalDate.of(2006, 07,04);
        long idade = dataAnterior.until(agora, ChronoUnit.DAYS);
        System.out.println("Idade em dias: " + idade);

        LocalDate dataFutura = agora.plus(90, ChronoUnit.DAYS);
        System.out.println("Data futura: "+ dataFutura);

        Scanner sc = new Scanner(System.in);
        int vindoDoTeclado = sc.nextInt();
        int soma = 0;
        for(int i = 0; i < vindoDoTeclado; i++){
            System.out.println("Digite um número: ");
            soma += sc.nextInt();
        }
        System.out.printf("O resultado da soma: %d", soma); // %d = inteiro %.2f = double

        sc.close();

    }
}
