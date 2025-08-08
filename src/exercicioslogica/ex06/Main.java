package exercicioslogica.ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 5:
         * Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = input.nextDouble();
        double reajuste = 5.0 / 100.0 * valor;
        System.out.println("Valor sobre o reajuste de 5%: " + (valor + reajuste));

        input.close();
    }
}