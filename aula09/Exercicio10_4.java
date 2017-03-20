package aula09;
import java.util.Scanner;
public class Exercicio10_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o nome da disciplina: ");
        String disciplina = s.nextLine();
        if (disciplina.equals("")) {
            System.exit(0);
        }
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = s.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = s.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = s.nextDouble();
        
        double media1 = ((nota1 + nota2 + nota3) / 3 ) * 0.04;
        
        if (media1 < 2) {
            System.out.println("Deu muito ruim. Encerrando programa.");
            System.exit(0);
        }
        System.out.print("Digite a quarta nota: ");
        double nota4 = s.nextDouble();
        System.out.print("Digite a quinta nota: ");
        double nota5 = s.nextDouble();
        
        double media2 = ((nota4 + nota5) / 2) * 0.06;
        
        if (media2 < 3) {
            System.out.println("Deu ruim. Encerrando programa.");
            System.exit(0);
        }
        
        double media = media1 + media2;
        
        System.out.println("Na disciplina " + disciplina + " sua nota final foi " + media + ".");
        
        if (media < 5) {
            System.out.println("Reprovou!");
        } else {
            if (media < 7) {
                System.out.println("Na média!");
            } else {
                if (media < 9) {
                    System.out.println("Acima da média!");
                } else {
                    System.out.println("Excelente média!");
                }
            }
        }
        
    }
}