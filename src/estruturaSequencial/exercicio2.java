package estruturaSequencial;
import java.util.Scanner;
import java.util.Locale;
public class exercicio2{
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double largura, altura, valorMetroQuadrado, area, preco;
    largura = sc.nextDouble();
    altura = sc.nextDouble();
    valorMetroQuadrado = sc.nextDouble();
    area = largura * altura;
    preco = area * valorMetroQuadrado;
        
    System.out.printf("AREA = %.2f\n", area);
    System.out.printf("PRECO = %.2f\n", preco);
    }
}