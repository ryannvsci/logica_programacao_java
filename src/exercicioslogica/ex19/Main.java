package exercicioslogica.ex19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 19
         * Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("--------- TABUADA ----------");
        System.out.print("Digite um número e descubra a tabuada dele: ");
        int numero = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println("-------- FIM DA TABUADA --------");

        input.close();
    }
}
