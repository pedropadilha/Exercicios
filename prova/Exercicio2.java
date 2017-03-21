package prova;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1) Moto");
        System.out.println("2) Carro de passeio");
        System.out.println("3) Pickup");
        System.out.println("4) Caminhão/Ônibus");
        System.out.print("Digite o tipo de veículo: ");
        String tipo = s.nextLine();

        System.out.print("Digite o valor base do pegdágio: ");
        double valorBase = s.nextDouble();

        int passageiros;
        double valor = 0;
        switch (tipo) {
            case "1":
                valor = valorBase;
                break;
            case "2":
            case "3":
                System.out.print("Digite o número de passageiros no carro: ");
                passageiros = s.nextInt();
                s.nextLine();
                valor = 1.5 * passageiros + valorBase;
                break;
            case "4":
                valor = 4 * valorBase;
                break;
            default:
                System.out.println("OVNIs não são permitidos!");
                System.exit(0);
        }

        System.out.println("Valor a ser pago: R$" + valor + "0");
    }
}
