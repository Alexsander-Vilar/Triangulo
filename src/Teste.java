import java.io.IOException;
import java.util.Scanner;
public class Teste{
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();
        String resultado = (a + b > c && b + c > a && a + c > b) ? "Perimetro = " + (a + b + c) : "Area = " + (((a + b) * c) / 2);
        System.out.println(resultado);
    }
}