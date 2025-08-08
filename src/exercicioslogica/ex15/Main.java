package exercicioslogica.ex15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 15
         * Faça um algoritmo que leia três valores que representam os três lados
         * de um triângulo e verifique se são válidos, determine se o triângulo é
         *
         * equilátero, isósceles ou escaleno.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("DETECTOR DE TRIÂNGULOS");
        System.out.println("\nDigite o tamanho do primeiro lado: ");
        int lado1 = input.nextInt();
        System.out.println("Digite o tamanho do segundo lado: ");
        int lado2 = input.nextInt();
        System.out.println("Digite o tamanho do terceiro lado: ");
        int lado3 = input.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Este é um triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Este é um triângulo Isósceles");
            } else {
                System.out.println("Este é um triângulo Escaleno");
            }
        } else {
            System.out.println("OS DADOS INFORMADOS NÃO FORMAM UM TRIÂNGULO VÁLIDO");
        }

        input.close();
    }
}
