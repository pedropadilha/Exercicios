package aula14;

import java.util.Scanner;

public class Exercicio15b {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double valorTotal = 0;
        int numeroDeProdutos = 0;
        int produtos = 0;
        while (produtos < 1 || produtos > 10) {
            System.out.print("Digite quantos produtos você comprou: ");
            produtos = s.nextInt();
        }
        int i = 1;
        while (i <= produtos) {
            double valor = 0;
            while (valor < 1) {
                System.out.print("Digite o valor do produto " + i + ": ");
                valor = s.nextDouble();
            }
            int unidades = 0;
            while (unidades < 1) {
                System.out.print("Digite quantas unidades você comprou: ");
                unidades = s.nextInt();
            }
            numeroDeProdutos += unidades;
            valorTotal += (unidades * valor);
            i++;
        }
        System.out.println("Você comprou " + numeroDeProdutos + " produtos e "
                + "sua compra deu R$" + valorTotal);
    }
}
