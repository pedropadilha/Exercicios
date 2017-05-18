package exercicio20;
import java.util.Scanner;
public class Basquete {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o seu gênero (M ou F): ");
        String genero = s.nextLine();
        System.out.print("Digite a sua altura: ");
        double altura = s.nextDouble();
        s.nextLine();
        boolean alto = (altura >= 1.9);
        boolean masculino = genero.equalsIgnoreCase("M");
        boolean feminino = genero.equalsIgnoreCase("F");
        if (!alto) {
            if (masculino) {
                System.out.println("Você é um cara que não pode jogar basquete");
            } else {
                if (feminino) {
                    System.out.println("Você é uma menina que não pode jogar basquete");
                } else {
                    System.out.println("Você é uma pessoa que não pode jogar basquete");
                }
            }
        } else {
            System.out.println("Parabéns, você pode joagr basquete!");
        }
    }
}