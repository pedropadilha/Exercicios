package aula15;
import java.util.Scanner;
public class Exercicio16a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite quantas vezes você quer ver o seu nome: ");
        int vezes = s.nextInt();
        s.nextLine();
        System.out.print("Digite o seu nome: ");
        String nome = s.nextLine();
        int i = 1;
        while (i <= vezes) {
            System.out.println(nome);
            i++;
        }
    }
}