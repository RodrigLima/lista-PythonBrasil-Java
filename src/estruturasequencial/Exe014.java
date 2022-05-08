package estruturasequencial;

import java.util.Scanner;

public class Exe014 {

    public static void main(String args[]) {
        int pesoLimite = 50;
        float valorMulta = 4.00f, pesoPeixe, excesso, multa;
        Scanner sc = new Scanner(System.in);

        System.out.format("--------------------------------------------\nRegulamento de Pesca do Estado de São Paulo\n-------------------------------------------\nPeso Limite: %dKg\nPreço da Multa p/Quilo:R$ %.2f\n-------------------------------------------\n", pesoLimite, valorMulta);

        System.out.print("Informe o peso do peixe: ");
        pesoPeixe = sc.nextFloat();

        if (pesoPeixe <= pesoLimite) {
            System.out.println("Peso do peixe está nas normas do regulamento de pesca do estado de São Paulo");
        } else {
            excesso = pesoPeixe - pesoLimite;
            multa = excesso * valorMulta;
            System.out.format("Excesso: %.1fKg\nPreço da Multa:R$ %.2f\n", excesso, multa);
        }
    }
}
