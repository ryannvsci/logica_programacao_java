package exercicioslogica.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 2:
         * Faça um algoritmo para receber um número qualquer e imprimir
         * na tela se o número é par ou ímpar, positivo ou negativo.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        if (numero%2 == 0) {
           System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }

        System.out.println(numero >= 0 ? numero + " é positivo" : numero + " é negativo");

        input.close();
    }
}