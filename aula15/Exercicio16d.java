package aula15;
import java.util.Scanner;
public class Exercicio16d {
    public static void main(String[] args) {
        double somaTotalDasMedias = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite quantos alunos há na sala: ");
        int alunos = s.nextInt();
        s.nextLine();
        int i = 1;
        while(i <= alunos) {
            System.out.print("Digite a nota 1 do aluno " + i + ": ");
            double nota1 = s.nextDouble();
            s.nextLine();
            System.out.print("Digite a nota 2 do aluno " + i + ": ");
            double nota2 = s.nextDouble();
            s.nextLine();
            double media = (nota1 + nota2) / 2;
            System.out.println("Média do aluno " + i + ": " + media);
            somaTotalDasMedias += media;
            i++;
        }
        double mediaDasMedias = somaTotalDasMedias / alunos;
        System.out.println("Média total da sala: " + mediaDasMedias);   
    }   
}