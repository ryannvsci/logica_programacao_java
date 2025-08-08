package exercicioslogica.ex08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 8:
         * Faça um algoritmo que leia três valores inteiros diferentes e
         * imprima na tela os valores em ordem decrescente.
         */

        Scanner input = new Scanner(System.in);

        int[] valores = new int[3];
        int valorUm = input.nextInt();
        int valorDois = input.nextInt();
        int valorTres = input.nextInt();

        if (valorUm > valorDois && valorUm > valorTres ) {
            valores[0] = valorUm;
            if (valorDois > valorTres) {
                valores[1] = valorDois;
                valores[2] = valorTres;
            } else {
                valores[1] = valorTres;
                valores[2] = valorDois;
            }
        } else if (valorDois > valorUm && valorDois > valorTres) {
            valores[0] = valorDois;
            if (valorUm > valorTres) {
                valores[1] = valorUm;
                valores[2] = valorTres;
            } else {
                valores[1] = valorTres;
                valores[2] = valorUm;
            }
        } else {
                valores[0] = valorTres;
                if (valorDois > valorUm) {
                    valores[1] = valorDois;
                    valores[2] = valorUm;
                } else {
                    valores[1] = valorUm;
                    valores[2] = valorDois;
                }
        }

        System.out.println("ORDEM DECRESCENTE");
        for(int valor:valores) {
            System.out.println(valor);
        }

        input.close();
    }
}