package aula11;
import java.util.Scanner;
public class Exercicio12c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o valor atual da passagem: ");
        double valor = s.nextDouble();
        if (valor < 1) {
            System.exit(0);
        }
        System.out.println("Quantas viagens você faz por dia?");
        int viagens = s.nextInt();
        if (viagens < 3) {
            System.exit(0);
        }
        System.out.println("Quantos dias por mês você usa o metrô?");
        int dias = s.nextInt();
        if (dias < 1) {
            System.exit(0);
        }
        double valorTotalSemDescontoPorMes = valor * viagens * dias;
        double valorTotalComDescontoPorMes = valorTotalSemDescontoPorMes * 0.945;
        double valorEconomizadoPorMes = valorTotalSemDescontoPorMes - valorTotalComDescontoPorMes;
        double valorEconomizadoPorAno = valorEconomizadoPorMes * 12;
        System.out.println("Usando o fidelidade, você economiza R$" + valorEconomizadoPorMes + " por mês e R$" + valorEconomizadoPorAno
        + " por ano!");
    }
}