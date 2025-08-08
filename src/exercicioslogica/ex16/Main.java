package exercicioslogica.ex16;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 16
         * Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule
         * a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
         * Fórmula: C = (5 * ( F-32) / 9)
         */

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("----- CONVERSOR DE FAHRENHEIT PARA CELSIUS -----");
        System.out.print("Digite a temperatura em °F: ");
        double temperaturaFahrenheit = input.nextDouble();

        double temperaturaCelsius = 5 * (temperaturaFahrenheit - 32) / 9;
        System.out.println("Temperatura em °C: " + df.format(temperaturaCelsius));

        input.close();
    }
}
