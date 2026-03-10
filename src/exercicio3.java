import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("SOMA = " + c);
        sc.close();
    }
    
}
