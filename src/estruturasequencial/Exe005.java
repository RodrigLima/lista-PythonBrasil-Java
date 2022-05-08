package estruturasequencial;

import java.util.Scanner;

public class Exe005 {

    public static void main(String args[]) {
        double metros, centimetros;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor em metros(m²): ");
        metros = sc.nextFloat();

        centimetros = metros * 100;

        System.out.format("O valor em centímetros é de %.0fcm²\n", centimetros);
    }
}
