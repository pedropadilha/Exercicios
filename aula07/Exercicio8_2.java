package aula07;

import java.util.Scanner;

public class Exercicio8_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a porcentagem de comissão para carros novos: ");
        double novos = s.nextDouble();
        System.out.print("Digite a porcentagem de comissão para carros usados: ");
        double usados = s.nextDouble();
        System.out.print("Digite o salário do funcionário: ");
        double salario = s.nextDouble();
        System.out.print("Digite quantos carros novos foram vendidos: ");
        int carrosNovos = s.nextInt();
        System.out.print("Digite o preço dos carros novos: ");
        double precoNovos = s.nextDouble();
        System.out.print("Digite quantos carros usados foram vendidos: ");
        int carrosUsados = s.nextInt();
        System.out.print("Digite o preço dos carros usados: ");
        double precoUsados = s.nextDouble();

        salario = salario + ((carrosNovos * precoNovos) * (novos / 100)) + ((carrosUsados * precoUsados) * (usados / 100));
        System.out.println("Salário final: " + salario);

    }

}
