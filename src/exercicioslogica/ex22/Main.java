package exercicioslogica.ex22;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 22
         * Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
         * As informações fornecidas serão: valor da hora aula,
         * número de aulas lecionadas no mês e percentual de desconto do INSS.
         * Imprima na tela o salário líquido final.
         */

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("--------- CALCULAR SALÁRIO LÍQUIDO ---------");
        System.out.print("Digite o valor da aula: ");
        double valorHora = input.nextDouble();
        System.out.print("Digite quantas aulas lecionadas no mês: ");
        double aulas = input.nextDouble();
        double salario = valorHora * aulas;
        double salarioLiquido = 0;
        if (salario <= 1518.00) {
            salarioLiquido = salario - (salario * 0.075);
        } else if (salario <= 2793.88) {
            salarioLiquido = salario - (salario * 0.09);
        } else {
            salarioLiquido = salario - (salario * 0.12);
        }

        System.out.println("Valor liquido do salario: R$" + df.format(salarioLiquido));

        input.close();
    }
}
