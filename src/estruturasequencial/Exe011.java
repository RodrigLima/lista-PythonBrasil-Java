package estruturasequencial;

import java.util.Scanner;

public class Exe011 {

    public static void main(String args[]) {
        int num1, num2;
        float num3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número inteiro: ");
        num1 = sc.nextInt();
        System.out.print("Segundo número inteiro: ");
        num2 = sc.nextInt();
        System.out.print("Terceiro número real: ");
        num3 = sc.nextFloat();

        float produto = ((num1 * 2) * ((float) num2 / 2));
        float soma = (float) ((num1 * 3) + (num3));
        float elevado = (float) (Math.pow(num3, 3));

        System.out.format("O produto do dobro primeiro com metade do segundo = %.1f\nA soma do triplo do primeiro com o terceiro = %.1f\nO terceiro elevado ao cubo = %.1f\n", produto, soma, elevado);
    }
}
