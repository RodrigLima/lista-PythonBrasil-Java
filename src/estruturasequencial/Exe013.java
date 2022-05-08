package estruturasequencial;

import java.util.Scanner;

public class Exe013 {

    public static void main(String args[]) {
        float altura, pesoIdealMasculino, pesoIdealFeminino;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a sua altura: ");
        altura = sc.nextFloat();

        pesoIdealMasculino = (float) ((72.7 * altura) - 58);
        pesoIdealFeminino = (float) ((62.1 * altura) - 58);

        System.out.format("Peso Ideal Masculino: %.1fKg\nPeso ideal Feminino: %.1fKg\n", pesoIdealMasculino, pesoIdealFeminino);
    }
}
