package aula07;

import java.util.Scanner;

public class Exercicio8_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = s.nextLine();
        System.out.print("Digite quantas horas o carro ficou no estacionamento: ");
        int horas = s.nextInt();
        System.out.print("Digite quantos minutos o carro ficou no estacionamento: ");
        int minutos = s.nextInt();
        System.out.print("Digite quantos segundos o carro ficou no estacionamento: ");
        int segundos = s.nextInt();
        System.out.print("Digite o valor da hora no estacionameto: ");
        double valorHora = s.nextDouble();
        double valor = (double) horas * valorHora + (double) minutos * (valorHora / 60.0) + (double) segundos * ((valorHora / 60.0) / 60.0);
        System.out.println("Sr(a). " + nome + ", o total da sua conta é " + valor);

    }

}
