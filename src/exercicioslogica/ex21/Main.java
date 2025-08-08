package exercicioslogica.ex21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 21
         * Faça um algoritmo que leia dois valores inteiros A e B,
         * imprima na tela o quociente e o resto da divisão inteira entre eles.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("-----Algoritmo de Divisão------");
        System.out.print("\nDigite o valor de A: ");
        int a = input.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();
        int resultado = a / b;
        int resto = a % b;

        System.out.println("\n------ RESULTADO -------");
        System.out.println("\n A divido por B = " + resultado);
        System.out.println(" Resto = " + resto);
        System.out.println("\n--------- FIM ----------");

    }
}
