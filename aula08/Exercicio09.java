package aula08;
import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o valor da sua compra: ");
        double valor = s.nextDouble();
        System.out.print("Digite em quantas parcelas você quer pagar: ");
        int parcelas = s.nextInt();
        if (parcelas < 1) {
            System.err.println("É mesmo, engraçadinho?");
        } else {
            if (parcelas == 1) {
                System.out.println("Você vai pagar R$" + valor * 0.95 + "0.");
            } else {
                double valorParcela = valor / parcelas;
                System.out.println("Você vai pagar " + parcelas + " parcelas de R$" + valorParcela + "0.");
            }
        }
    }
}