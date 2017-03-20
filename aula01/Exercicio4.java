package aula01;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota1 = -1;
        float nota2 = -1;
        float notaSub = -1;
        while (nota1 < 0) {
        System.out.print("Digite a primeira nota: ");
        nota1 = teclado.nextFloat();
        }
        System.err.println("PEGOU A PRIMEIRA NOTA");
        while (nota2 < 0) {
        System.out.print("Digite a segunda nota: ");
        nota2 = teclado.nextFloat();
        }
        System.err.println("PEGOU A SDEGUNDA NOTA");
        float media = (nota1 + nota2) / 2;
        System.err.println("FEZ A MÉDIA - DEU " + media);
        if (media >= 5) {
            System.out.println("Aprovado!");
            System.err.println("MÉDIA FOI MAIOR QUE 5");
            if (media >= 9) {
                System.out.println("Aluno exemplar!");
                System.err.println("MÉDIA FOI MAIOR QUE 9");
            }
        } else {
            System.out.println("Ficou de substitutiva...");
            System.err.println("MÉDIA FOI MENOR QUE 5");
            while (notaSub < 0) {
                System.out.print("Digite a nota da sub: ");
                notaSub = teclado.nextFloat();
            }
            System.err.println("PEGOU A NOTA DA SUB");
            if (notaSub >= 7) {
                System.out.println("Foi aprovado graças à sub!");
                System.err.println("NOTA DA SUB FOI MAIOR QUE 7");
            } else {
                System.out.println("Já era! reprovado!");
                System.err.println("NOTA DA SUB FOI MENOR QUE 7");
            }
        }
        
        
    }
}