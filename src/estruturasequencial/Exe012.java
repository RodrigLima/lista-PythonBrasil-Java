package estruturasequencial;

import java.util.Scanner;

public class Exe012 {

    public static void main(String args[]) {
        float altura;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a sua altura: ");
        altura = sc.nextFloat();

        float pesoIdeal = (float) ((72.7 * altura) - 58);
        System.out.format("Peso Ideal: %.1fKg\n", pesoIdeal);
    }
}
