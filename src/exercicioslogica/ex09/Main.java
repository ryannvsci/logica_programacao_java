package exercicioslogica.ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 9
         * Faça um algoritmo que leia três notas obtidas por um aluno,
         * e imprima na tela a média das notas.
         */

        Scanner input = new Scanner(System.in);

        double soma = 0;
        double[] notas = {input.nextDouble(), input.nextDouble(), input.nextDouble()};

        for(double i:notas) {
            soma += i;
        }

        System.out.println("A média das 3 notas é: " + (soma/notas.length));

        input.close();
    }
}
