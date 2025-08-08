package exercicioslogica.ex14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercicio 14
         * Faça um algoritmo que leia o ano em que uma pessoa nasceu,
         * imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
         * consideração o ano com 365 dias e o mês com 30 dias.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o dia de nascimento: ");
        int diaNasc = input.nextInt();
        System.out.print("Digite o mês de nascimento: ");
        int mesNasc = input.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int anoNasc = input.nextInt();

        System.out.print("Digite o dia atual: ");
        int diaAtual = input.nextInt();
        System.out.print("Digite o mês atual: ");
        int mesAtual = input.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = input.nextInt();

        int totalDiasNasc = anoNasc * 365 + mesNasc * 30 + diaNasc;
        int totalDiasAtual = anoAtual * 365 + mesAtual * 30 + diaAtual;

        int totalDiasVividos = totalDiasAtual - totalDiasNasc;

        int anos = totalDiasVividos / 365;
        int meses = (totalDiasVividos % 365) / 30;
        int dias = (totalDiasVividos % 365) % 30;

        System.out.println("Você viveu: " + anos + " anos, " + meses + " meses e " + dias + " dias.");

        input.close();
    }
}
