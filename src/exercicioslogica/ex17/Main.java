package exercicioslogica.ex17;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 17
         * Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
         * Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários
         * para que Francisco seja menor que Sara.
         */

        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        int anos = 0;
        while (alturaSara < alturaFrancisco) {
            alturaSara += 0.03;
            alturaFrancisco += 0.02;
            anos++;
        }

        System.out.println("Foram " + anos + " anos para Sara ficar maior que Francisco.");
    }
}
