package estruturasequencial;

import java.util.Scanner;

public class Exe010 {

    public static void main(String args[]) {
        float temperaturaFahrenheit, temperaturaCelsius;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius: ");
        temperaturaCelsius = sc.nextFloat();

        temperaturaFahrenheit = ((temperaturaCelsius * 9 / 5) + 32);
        System.out.format("Temperatura em Fahrenheit: %.1f°F\n", temperaturaFahrenheit);
    }
}
