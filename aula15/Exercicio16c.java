package aula15;
import java.util.Scanner;
public class Exercicio16c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        double valorTotal = 0;
        while (i <= 5) {
            System.out.print("Digite o preço do produto " + i + ": ");
            double preco = s.nextDouble();
            if (preco <= 0) break;
            valorTotal += preco;
            i++;
        }
        System.out.println("Valor total dos produtos: R$" + valorTotal + "0.");
    }
}