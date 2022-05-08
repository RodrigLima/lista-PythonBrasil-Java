package estruturasequencial;

import java.util.Scanner;

public class Exe002 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float num;

        System.out.print("Informe um número: ");
        num = sc.nextFloat();

        if (Math.round(num) == num) {
            System.out.format("O número informado foi %.0f\n", num);
        } else {
            System.out.format("O número informado foi %.1f\n", num);
        }
    }
}
