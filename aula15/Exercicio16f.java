package aula15;
import java.util.Scanner;
public class Exercicio16f {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double precoMaior = 0;
        double precoMenor = 0;
        double totalDaCompra = 0;
        System.out.print("Digite quantos produtos você comprou: ");
        int produtos = s.nextInt();
        s.nextLine();
        int i = 1;
        while (i <= produtos) {
            System.out.print("Digite o preço do produto " + i + ": ");
            double preco = s.nextDouble();
            s.nextLine();
            if (i == 1) {
                precoMenor = preco;
            }
            while (preco <= 0) {
                System.out.print("Digite o preço do produto " + i + ": ");
                preco = s.nextDouble();
                s.nextLine();
            }
            precoMaior = (preco > precoMaior) ? preco : precoMaior;
            precoMenor = (preco < precoMenor) ? preco : precoMenor;
            totalDaCompra += preco;
            i++;
        }
        System.out.println("Total da compra: R$" + totalDaCompra);
        System.out.println("Preço do produto mais barato: R$" + precoMenor);
        System.out.println("Preço do produto mais caro: R$" + precoMaior);
    }
}