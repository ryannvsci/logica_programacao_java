package exercicioslogica.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 4:
         * Faça um algoritmo que receba um número inteiro e imprima
         * na tela o seu antecessor e o seu sucessor.
         *
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        System.out.println("Sucessor........: " + (numero + 1));
        System.out.println("Antecessor......: " + (numero - 1));

        input.close();
    }
}