package exercicioslogica.ex10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 10
         * Faça um algoritmo que leia quatro notas obtidas por um aluno,
         * calcule a média das nota obtidas, imprima na tela o nome do aluno e
         * se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado
         * sua média final deve ser maior ou igual a 7.
         */

        Scanner input = new Scanner(System.in);

        double soma = 0;
        double media;
        boolean aprovado;
        String nome = input.nextLine();
        double[] notas = {input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble()};

        for(double i:notas) {
            soma += i;
        }

        media = soma/ notas.length;
        aprovado = media >= 7;

        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        if(aprovado) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

        input.close();
    }
}
