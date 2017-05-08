package exercicio19;
import java.util.Scanner;
public class d {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o número total de depósitos: ");
        int totalDepositos = s.nextInt();
        s.nextLine();
        double investimento[][] = new double[totalDepositos][2];
        for (int i = 0; i < totalDepositos; i++) {
            double deposito = -1;
            while (deposito < 0) {
                System.out.print("Digite o valor depositado: ");
                deposito = s.nextDouble();
                s.nextLine();
            }
            investimento[i][0] = deposito;
            double imposto = -1;
            while (imposto < 0 || imposto >= deposito) {
                System.out.print("Digite o valor do imposto: ");
                imposto = s.nextDouble();
                s.nextLine();
            }
            investimento[i][1] = imposto;
            System.out.println("Você depositou um total de R$" + deposito + " e pagou um total de R$" + imposto
            + ", com um lucro total de R$" + (deposito - imposto));
        }
        System.out.println("Digite o depósito para ser revisto (de 1 a " + totalDepositos + "): ");
        int checar = s.nextInt() - 1;
        s.nextLine();
        System.out.println("No depósito número " + checar + " você depositou R$"
                + investimento[checar][0] + " e pagou R$" + investimento[checar][1] + " de impostos");
    }
}