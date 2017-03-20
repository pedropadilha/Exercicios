package aula05;

import java.util.Scanner;

public class Projeto2 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite alguma coisa:");
        String texto1 = s.nextLine();
        System.out.println("Você digitou: " + texto1);
        System.out.println("Quantos filhos você tem?");
        int filhos = s.nextInt();
        System.out.println("Você informou ter " + filhos + " filhos");
        System.out.println("Digite a sua altura?");
        double altura = s.nextDouble();
        System.out.println("Sua altura é " + altura);
    }    
}