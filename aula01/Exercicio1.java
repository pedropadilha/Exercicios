package aula01;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor 1: ");
        double valor1 = teclado.nextDouble();
        System.out.print("Digite o valor 2: ");
        double valor2 = teclado.nextDouble();
        double soma = valor1 + valor2;
        double media = soma / 2;
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
    }
}
