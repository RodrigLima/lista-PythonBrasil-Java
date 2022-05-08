package estruturasequencial;

import java.util.Scanner;

public class Exe007 {

    public static void main(String args[]) {
        float base, altura, area, dobroArea;
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        base = sc.nextFloat();
        System.out.print("Altura: ");
        altura = sc.nextFloat();

        area = base * altura;
        dobroArea = area * 2;

        System.out.format("Área do Quadrado: %.1f\nDobro da área: %.1f\n", area, dobroArea);
    }
}
