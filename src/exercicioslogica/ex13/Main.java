package exercicioslogica.ex13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 13
         * Faça um algoritmo que receba um valor A e B, e
         * troque o valor de A por B e o valor de B por A e
         * imprima na tela os valores.
         */

        Scanner input = new Scanner(System.in);
        String quebra = System.lineSeparator();
        int[] valores = new int[2];
        int a;
        int b;

        System.out.print("Digite o valor de A: ");
        valores[0] = input.nextInt();
        System.out.print("Digite o valor de B: ");
        valores[1] = input.nextInt();
        System.out.println(quebra + "Trocando valores...");
        b = valores[0];
        a = valores[1];

        System.out.println(quebra + "--------- VALORES ---------");
        System.out.println("Valor de A............: " + a);
        System.out.println("Valor de B............: " + b);
        System.out.println("---------------------------");

        input.close();
    }
}
