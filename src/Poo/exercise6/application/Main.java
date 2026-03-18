package Poo.exercise6.application;

import Poo.exercise6.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("What is the dollar price ?");
        converter.setDollarValue(sc.nextDouble());
        System.out.println("How many dollars will be bought ?");
        converter.setDollarQuantity(sc.nextDouble());
        System.out.println(converter);
        sc.close();
}
    }
