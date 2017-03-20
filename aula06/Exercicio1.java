package aula06;
import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite seu primeiro nome: ");
        String nome = s.nextLine();
        System.out.print("Digite seu último nome: ");
        String sobrenome = s.nextLine();
        System.out.print("Insira o seu ano de nascimento: ");
        int ano = s.nextInt();
        int idade = 2017 - ano;
        System.out.println("Meu nome é " + nome + " " + sobrenome + " e eu tenho aproximadamente " + idade + "anos");
    }

}