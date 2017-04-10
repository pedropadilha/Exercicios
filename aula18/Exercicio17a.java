package aula18;

import java.util.Scanner;

public class Exercicio17a {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Total de alunos: ");
        int alunos = s.nextInt();
        double[] notas = new double[alunos];
        
        for(int i = 0; i < alunos; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = s.nextDouble();
        }
        
        for (int i = 0; i < alunos; i++) {
            System.out.println("Nota do aluno " + (i + 1) + ": " + notas[i]);
        }
    }
}