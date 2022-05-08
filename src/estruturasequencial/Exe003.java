package estruturasequencial;

import java.util.Scanner;

public class Exe003 {

    public static void main(String args[]) {
        float num1, num2, soma;
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        num1 = sc.nextFloat();
        System.out.print("Segundo número: ");
        num2 = sc.nextFloat();

        soma = num1 + num2;

        System.out.format("A soma dos número foi %.1f\n", soma);

    }
}
