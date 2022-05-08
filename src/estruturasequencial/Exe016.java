package estruturasequencial;

import java.util.Scanner;

public class Exe016 {

    public static void main(String args[]) {
        final float COBERTURATINTA = 3;
        int quantidadeLatas;
        float precoLata = 80.00f;
        float area, precoFinal, consumoArea;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a área em metros(m²): ");
        area = sc.nextFloat();

        consumoArea = area / COBERTURATINTA;
        quantidadeLatas = (int) (consumoArea / 18);
        precoFinal = (quantidadeLatas * precoLata);

        System.out.format("Quantidade de latas de tintas necessárias: %d\nPreço total:R$ %.2f\n", quantidadeLatas, precoFinal);

    }
}
