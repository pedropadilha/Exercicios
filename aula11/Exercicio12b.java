package aula11;
import java.util.Scanner;
public class Exercicio12b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String senha = "";
        System.out.print("Digite o primeiro número da senha: ");
        senha += s.nextLine();
        System.out.print("Digite a primeira letra da senha: ");
        senha += s.nextLine();
        System.out.print("Digite o segundo número da senha: ");
        senha += s.nextLine();
        System.out.print("Digite a segunda letra da senha: ");
        senha += s.nextLine();
        System.out.println("Quanto dinheiro você vai guardar no cofre?");
        int dinheiroTotal = s.nextInt();
        if (dinheiroTotal < 1000) {
            System.out.println("Pra que cofre pra isso, mano?");
        }
        System.out.print("Digite a combinação do cofre: ");
        String combinacao = s.next();
        if (combinacao.equals(senha)) {
            System.out.println("Cofre aberto!");
            System.out.println("#partiuOstentação!");
        } else {
            System.out.println("Primeira tentativa falhou! Você tem mais uma.");
            System.out.print("Digite a combinação novamente: ");
            combinacao = s.next();
            if (combinacao.equals(senha)) {
                System.out.println("Cofre aberto na segunda tentativa!");
            } else {
                System.out.println("Cofre vai explodir!");
            }
        }
    }
}