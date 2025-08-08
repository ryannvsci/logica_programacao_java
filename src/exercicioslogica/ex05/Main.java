package exercicioslogica.ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 5
         * Faça um algoritmo que leia o valor do salário mínimo e o valor do
         * salário de um usuário, calcule quantos salários mínimos esse
         * usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
         *
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do seu salário: ");
        double salario = input.nextDouble();
        double salarioMinimo = 1293.20;
        double salariosMinimosGanhos = (int) salario / salarioMinimo;

        if (salario > salarioMinimo) {
            System.out.println("Você ganha " + salariosMinimosGanhos + " salários mínimos");
        } else if (salario == salarioMinimo) {
            System.out.println("Você ganha um salário mínimo");
        } else System.out.println("Você ganha menos que um salário mínimo");

        input.close();
    }
}