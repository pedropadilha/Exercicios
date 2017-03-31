package aula15;
import java.util.Scanner;
public class Exercicio16e {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite quantos investimentos você quer fazer: ");
        int investimentos = s.nextInt();
        s.nextLine();
        int i = 1;
        while(i <= investimentos) {
            System.out.println("1) Renda fixa");
            System.out.println("2) Tesouro");
            System.out.println("3) Ações");
            System.out.print("Digite o investimento desejado: ");
            int escolha = s.nextInt();
            s.nextLine();
            System.out.print("Ganho médio mensal: ");
            switch(escolha) {
                case 1:
                    System.out.println("1%");
                    break;
                case 2:
                    System.out.println("1,5%");
                    break;
                case 3:
                    System.out.println("3%");
                    break;
                default:
                    System.out.println("0%");
            }
            i++;
        }
    }
}