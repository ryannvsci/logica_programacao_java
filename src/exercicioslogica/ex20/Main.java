package exercicioslogica.ex20;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 20:
         * Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
         */

        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(101);
        System.out.println("número aleatório de 0 a 100: " + numero);
    }
}
