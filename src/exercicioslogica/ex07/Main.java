package exercicioslogica.ex07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 7:
         * Faça um algoritmo que leia dois valores booleanos (lógicos) e
         * determine se ambos são VERDADEIRO ou FALSO.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois valores [true/false]");
        boolean[] valor = new boolean[2];

        for (int i = 0; i < valor.length; i++) {
            valor[i] = input.nextBoolean();
        }

        if (valor[0] && valor[1]) {
            System.out.println("Ambos são verdadeiros");
        } else if (!valor[0] && !valor[1]) {
            System.out.println("Ambos são falsos");
        } else {
            System.out.println("Valores diferentes");
        }

        input.close();
    }
}