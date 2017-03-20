package aula02;
import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float notas [] = new float[4];
        float media = 0;
        for (int aluno = 1; aluno < 5; aluno++) {
            for (int numeroNota = 1; numeroNota < 5; numeroNota++) {
                float nota = -1;
                do {
                    System.out.print("Digite a nota #" + numeroNota + " do aluno numero " + aluno + ": ");
                    nota = s.nextFloat();
                } while (nota < 0 || nota > 10);
                notas[numeroNota - 1] = nota;
            }
            for (float x : notas) {
                media += x;
            }
            System.out.print("Aluno " + aluno + ": ");
            media /= 4;
            if (media < 5) {
                System.out.print("REPROVADO! ");
            } else {
                System.out.print("APROVADO! ");
            }
            System.out.println("Média: " + media);
        }
    }

}
