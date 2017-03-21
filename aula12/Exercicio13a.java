package aula12;

import java.util.Scanner;

public class Exercicio13a {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("1) Inteira");
        System.out.println("2) Meia");
        System.out.println("3) Cortesia");
        System.out.print("Digite o tipo do seu ingresso: ");
        String tipoIngresso = s.nextLine();
        System.out.print("Qual é o valor do ingresso? ");
        double valor = s.nextDouble();

        switch (tipoIngresso) {
            case "1":
                valor *= 1.05;
                break;
            case "2":
                valor *= 0.55;
                break;
            case "3":
                valor = 0;
                break;
            default:
                System.out.println("Qual parte de 1 a 3 você não entendeu?");
                System.exit(0);
        }
        
        String st = String.format("", valor);
        
        System.out.println("Valor do ingresso: R$" + valor + "0");

    }
}
