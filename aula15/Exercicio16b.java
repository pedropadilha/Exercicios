package aula15;
import java.util.Scanner;
public class Exercicio16b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite de qual número quer começar: ");
        int comecar = s.nextInt();
        s.nextLine();
        System.out.print("Digite de qual número quer terminar: ");
        int terminar = s.nextInt();
        if (terminar <= comecar) {
            System.err.println("Não pode terminar antes de começar!");
            System.exit(0);
        }
        while(comecar <= terminar) {
            System.out.println(comecar);
            comecar += 2;
        }
    }
}