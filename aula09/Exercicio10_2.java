package aula09;

import java.util.Scanner;

public class Exercicio10_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int percentual = 0;
        System.out.print("Digite o seu salário bruto: ");
        double salario = s.nextDouble();
        if (salario > 0 && salario < 1659.38) {
            percentual = 8;
        }
        if (salario >= 1659.38 && salario < 2765.66) {
            percentual = 9;
        }
        if (salario >= 2765.66 && salario < 5531.31) {
            percentual = 11;
        }
        double inss = salario * percentual / 100;
        double ftgs = salario * 0.08;
        
        System.out.println("FGTS: " + ftgs);
        System.out.println("INSS: " + inss);
        
        
    }
}
