package estruturasequencial;

import java.util.Scanner;

public class Exe008 {

    public static void main(String args[]) {
        int horaMensal;
        float salarioHora, salario;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o seu Salário-Hora: ");
        salarioHora = sc.nextFloat();
        System.out.print("Informe as horas trabalhadas no mês: ");
        horaMensal = sc.nextInt();

        salario = salarioHora * horaMensal;

        System.out.format("Salário: %.2f\n", salario);
    }
}
