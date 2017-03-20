package aula07;
import java.util.Scanner;
public class Rawann {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("Qual seu nome ?");
        String nome = a.nextLine();

        System.out.println("Quantas horas seu carro ficou no estaciona ?");
        int hr = a.nextInt();

        System.out.println("Quantos minutos seu carro ficou no estaciona ?");
        int min = a.nextInt();

        System.out.println("Quantos segundos seu carro ficou no estaciona ?");
        int s = a.nextInt();

        System.out.println("Qual o valor da hora do estaciona ?");
        double valor = a.nextDouble();

        double soma = hr * valor;
        double soma1 = (valor / 60) * min;
        double soma2 = (valor / 3600) * s;
        double somao = soma + soma1 + soma2;

        System.out.println("Sr(a)" + nome + " Sua conta ficou " + somao);
    }

}
