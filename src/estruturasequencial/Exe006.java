package estruturasequencial;

import java.util.Scanner;

public class Exe006 {

    public static void main(String args[]) {
        double raio, area;
        final float VALOR_DE_PI = 3.14f;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do raio do círculo: ");
        raio = sc.nextDouble();

        area = (Math.pow(raio, 2) * VALOR_DE_PI);

        System.out.format("A área do círculo é de aproximadamente %.1fcm²\n", area);
    }
}
