package exercicioslogica.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 3:
         * Faça um algoritmo que leia dois valores inteiros A e B,
         * se os valores de A e B forem iguais, deverá somar os dois valores,
         *
         * caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos
         * deve-se atribuir o resultado a uma variável C e
         * imprimir seu valor na tela.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();
        int c;

        if (a == b) {
            c = a + b;
            System.out.println("A e B são iguais Soma........: " + c);
        } else {
            c = a * b;
            System.out.println("A e B são diferentes Multiplicação.....: " + c);
        }

        input.close();
    }
}