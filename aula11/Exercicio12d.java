package aula11;

import java.util.Scanner;

public class Exercicio12d {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double porcentagem;
        System.out.print("Digite a sua idade: ");
        int idade = s.nextInt();
        if (idade > 17 || idade < 51) {
            System.out.print("Digite o seu sexo: ");
            String sexo = s.next();
            if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
                System.out.print("Digite quantos filhos você tem: ");
                int quantidadeDeFilhos = s.nextInt();
                if (quantidadeDeFilhos > 0) {
                    System.out.print("Digite o valor do seu seguro: ");
                    double valorSeguro = s.nextDouble();
                    if (valorSeguro >= 10000) {
                        if (idade < 26) {
                            porcentagem = (sexo.equalsIgnoreCase("M") ? 28 : 25);
                        } else {
                            if (idade < 36) {
                                porcentagem = (sexo.equalsIgnoreCase("M") ? 40 : 35);
                            } else {
                                porcentagem = (sexo.equalsIgnoreCase("M") ? 45 : 40);
                            }
                        }
                        if (quantidadeDeFilhos < 3) {
                            porcentagem -= 2;
                        } else {
                            if (quantidadeDeFilhos < 5) {
                                porcentagem -= 3;
                            } else {
                                porcentagem -= 5;
                            }
                        }
                        double valor = valorSeguro * porcentagem / 100;
                        System.out.println("Por um seguro de R$" + valorSeguro + " voce precisa pagar R$" + valor);
                    }
                }
            }
        }
    }
}
