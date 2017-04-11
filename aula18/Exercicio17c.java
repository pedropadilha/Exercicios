package aula18;

import java.util.Scanner;

public class Exercicio17c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Quantidade de boletins que vão ser cadastrados: ");
        int totalBoletins = s.nextInt();
        s.nextLine();
        String[] boletins = new String[totalBoletins];
        
        for(int i = 0; i < totalBoletins; i++) {
            System.out.print("Digite o nome do aluno" + (i + 1) + ": ");
            String nome = s.nextLine();
            System.out.print("Digite a nota 1 do aluno " + nome + ": ");
            double nota1 = s.nextDouble();
            s.nextLine();
            System.out.print("Digite a nota 2 do aluno " + nome + ": ");
            double nota2 = s.nextDouble();
            s.nextLine();
            double media = ((nota1 + nota2) / 2);
            boletins[i] = (i + 1) + ". " + nome + ". Média " + media + ". " + (media >= 5 ? "A" : "RE") + "PROVADO";
        }
        for (int i = 0; i < totalBoletins; i++) {
            System.out.println(boletins[i]);
        }
        
    }
}
