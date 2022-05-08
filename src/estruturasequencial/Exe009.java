package estruturasequencial;

import java.util.Scanner;

public class Exe009 {

    public static void main(String args[]) {
        float temperaturaFahrenheit, temperaturaCelsius;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em Fahrenheit: ");
        temperaturaFahrenheit = sc.nextFloat();

        temperaturaCelsius = (5 * (temperaturaFahrenheit - 32) / 9);
        System.out.format("Temperatura em Celsius: %.1f°C\n", temperaturaCelsius);

    }
}
