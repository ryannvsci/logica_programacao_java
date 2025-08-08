package exercicioslogica.ex01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 1:
         * Faça um algoritmo que leia os valores de A, B, C e em seguida
         * imprima na tela a soma entre A e B é mostre se a soma é menor que C.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = input.nextInt();
        int soma = a + b;

        System.out.println("SOMA A + B.........: " + soma);
        if (soma < c) {
            System.out.println("SOMA MENOR QUE.....: " + c);
        }

        input.close();
    }
}