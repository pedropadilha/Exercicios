package aula07;

import java.util.Scanner;

public class Exercicio8_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = s.nextLine();
        System.out.println("Bom dia " + nome + "!");
        System.out.print("Qual é a sua idade? ");
        int idadeAtual = s.nextInt();
        System.out.print("Com quantos anos você gostaria de morrer? ");
        int idadeParaMorrer = s.nextInt();
        int tempoDeVidaAnos = idadeParaMorrer - idadeAtual;
        int tempoDeVidaMeses = tempoDeVidaAnos * 12;
        int tempoDeVidaDias = tempoDeVidaMeses * 30;
        int tempoDeVidaHoras = tempoDeVidaDias * 24;
        System.out.println("Você vai viver mais " + tempoDeVidaAnos + " anos ou " + tempoDeVidaMeses + " meses ou "
                + tempoDeVidaDias + " dias ou " + tempoDeVidaHoras + " horas.");
    }

}
