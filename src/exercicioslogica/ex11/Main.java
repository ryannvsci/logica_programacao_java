package exercicioslogica.ex11;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 11:
         * Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
         * pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
         * Tabela de Código de Condições de Pagamento
         *
         *  1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
         *  2 - À Vista no cartão de crédito, recebe 10% de desconto
         *  3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
         *  4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
         */

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double valorCorrigido = 0;
        int parcelas = 0;

        System.out.print("Digite o nome do produto: ");
        String produto = input.nextLine();
        System.out.println();
        System.out.print("Digite o valor do produto: ");
        double valor = input.nextDouble();
        System.out.println();

        System.out.println("1 - Compra a vista Pix (15% off) \n" +
                "2 - Compra a vista Crédito (10% off)\n" +
                "3 - Compra parcelada até 2x (sem juros) \n" +
                "4 - Compra parcelada em até 12x (com juros) \n" +
                "DIGITE: ");

        FormaPagamento formaPagamento = FormaPagamento.tipoPagamentoPorNumero(input.nextInt());



        switch (formaPagamento != null ? formaPagamento.getNumero() : 0) {
            case 1:
                valorCorrigido = valor - (15.0 / 100.0 * valor);
                break;
            case 2:
                valorCorrigido = valor - (10.0 / 100.0 * valor);
                break;
            case 3:
                valorCorrigido = valor;
                break;
            case 4:
                valorCorrigido = valor + (10.0 / 100.0 * valor);
                break;
            default:
                System.out.println("Por favor, selecionar opção válida.");
        }

        if (formaPagamento == null) {
            System.out.println("Forma de pagamento inválida. Encerrando programa.");
            input.close();
            return;
        }

        if (formaPagamento.getNumero() == 3 || formaPagamento.getNumero() == 4) {
            switch (formaPagamento.getNumero()){
                case 3:
                    while (true){
                        System.out.println("Digite a quantidade de parcelas:");
                        parcelas = input.nextInt();
                        if (parcelas > 2) {
                            System.out.println("Favor digitar valor valido.");
                        } else {
                            break;
                        }
                    }
                break;
                case 4:
                    while(true) {
                        System.out.println("Digite a quantidade de parcelas:");
                        parcelas = input.nextInt();
                        if (parcelas <= 2 || parcelas > 12) {
                            System.out.println("Favor digitar valor valido.");
                        } else {
                            break;
                        }
                    }
                break;
            }
        }

        System.out.println("------------ RESUMO DA COMPRA -----------");
        System.out.println("Produto............: " + produto);
        System.out.println("Valor final............: R$ " + df.format(valorCorrigido));
        if (parcelas != 0) {
            System.out.println("Parcelas............: " + parcelas +"x de R$ " + df.format(valorCorrigido / parcelas));
        }
        System.out.println("-----------------------------------------");

        input.close();
    }
}
