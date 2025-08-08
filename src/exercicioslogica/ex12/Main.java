package exercicioslogica.ex12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Exercício 12
         * Faça algoritmo que leia o nome e a idade de uma peso e
         * imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
         */

        String quebra = System.lineSeparator();
        Scanner input = new Scanner(System.in);
        System.out.print("DIGITE SEU NOME: ");
        String nome = input.nextLine();
        System.out.print("DIGITE SUA IDADE: ");
        int idade = input.nextInt();

        System.out.println(quebra + "-------- VERIFICAR MAIORIDADE -----------");
        System.out.println("Nome............: " + nome);
        System.out.println("Idade............: " + idade + " anos");
        if (idade >= 18) {
            System.out.println("Maior de idade..........: Sim");
        } else {
            System.out.println("Maior de idade..........: Não");
        }
        System.out.println("-----------------------------------------");

        input.close();
    }
}
