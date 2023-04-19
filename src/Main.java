import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double area;
        double soma;

        if((A<B+C) && (B<A+C) && (C<A+B)){
            soma = A + B + C;

            System.out.println("Perimetro = " + soma);
        }else{
            area = ((A + B) * C) / 2;

            System.out.println("Area = " + area);
        }

    }
}
