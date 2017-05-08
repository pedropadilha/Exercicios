package exercicio19;
import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double lugares[][] = new double[7][2];
        System.out.println("Digite o preço de cada poltrona");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Fileira " + (i + 1) + " - poltrona " + (j + 1) + ": ");
                double preco = s.nextDouble();
                s.nextLine();
                lugares[i][j] = preco;
            }
        }
        double precoTotal = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                precoTotal += lugares[i][j];
            }
        }
        System.out.println("Se o avião estiver cheio, a companhia terá arrecadado um total de R$" + precoTotal);
    }
}
