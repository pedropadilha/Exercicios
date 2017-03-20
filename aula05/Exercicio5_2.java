package aula05;
import java.util.Scanner;
public class Exercicio5_2 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = s.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = s.nextInt();
        System.out.println("Você se chama " + nome + " e tem " + idade + " anos!");
    }    
}