package prova;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("1) Área de um quadrado");
        System.out.println("2) Área de uma circunferência");
        System.out.println("3) Área de um trapézio");
        System.out.print("Digite a operação desejada: ");
        String operacao = scanner.nextLine();
        
        double area = 0;
        String figura = null;
        switch (operacao) {
            case "1":
                figura = "o quadrado";
                System.out.print("Digite o comprimento do lado do quadrado: ");
                double lado = scanner.nextDouble();
                if (lado == 0) System.exit(0);
                area = lado * lado;
                break;
            case "2" :
                figura = "a circunferência";
                System.out.print("Digite o raio da circunferência: ");
                double raio = scanner.nextDouble();
                if (raio == 0) System.exit(0);
                area = raio * raio * 3.14;
                break;
            case "3":
                figura = "o trapézio";
                System.out.print("Digite o tamanho da base maior: ");
                double B = scanner.nextDouble();
                scanner.nextLine();
                if (B == 0) System.exit(0);
                System.out.print("Digite o tamanho da base menor: ");
                double b = scanner.nextDouble();
                if (b == 0) System.exit(0);
                scanner.nextLine();
                System.out.print("Digite a altura: ");
                double altura = scanner.nextDouble();
                if (altura == 0) System.exit(0);
                scanner.nextLine();
                area = (B + b) * altura / 2;
        }
        if (figura != null) {
            System.out.println("A área d" + figura + " é de " + area);
        }
                
    }
}