package aula06;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = s.nextInt();
        idade = idade * 365 * 24 * 60 * 60;
        System.out.println("Você tem mais de " + idade + " segundos!");
        
    }
}