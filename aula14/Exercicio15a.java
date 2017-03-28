package aula14;

import java.util.Scanner;

public class Exercicio15a {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome = "";
        while (nome.equals("")) {
            System.out.print("Digite o seu nome: ");
            nome = s.nextLine();
        }
        int idade = 0;
        while (idade < 16 || idade > 80) {
            System.out.print("Digite a sua idade: ");
            idade = s.nextInt();
        }
        float nota1 = -1;
        while (nota1 < 0 || nota1 > 10) {
            System.out.print("Digite a primeira nota: ");
            nota1 = s.nextInt();
        }
        float nota2 = -1;
        while (nota2 < 0 || nota2 > 10) {
            System.out.print("Digite a segunda nota: ");
            nota2 = s.nextInt();
        }
        double media = (nota1 + nota2) / 2;
        System.out.println(nome + ", você tem " + idade + " anos e sua média é " + media);
    }
}
