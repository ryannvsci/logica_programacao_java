package exercicioslogica.ex23;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercícios 23
         * Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
         * sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem
         * a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
         * Fórmula: distância = tempo x velocidade.
         *
         * litros usados = distância / 12.
         */

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("--------- GASTOS DE LITRO -----------");
        System.out.print("Digite o tempo gasto na viagem (horas): ");
        double tempo = input.nextDouble();
        System.out.print("Digite a velocidade média da viagem: ");
        double velocidade = input.nextDouble();
        double distancia = tempo * velocidade;
        double litros = distancia / 12;

        System.out.println("\nA distancia percorrida foi: " + distancia + " km");
        System.out.println("Os litros gastos foram: " + df.format(litros) + " L");

        input.close();
    }
}
