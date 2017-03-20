package aula05;

import java.util.Scanner;

public class Exercicio5_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.err.println("Atenção: todas as unidades devem estar no padrão do SI (Sistema Internacional)");
        System.out.print("Digite o seu nome: ");
        String nome = s.nextLine();
        System.out.print("Digite a sua massa: ");
        double massa = s.nextDouble();
        System.out.print("Digite a sua altura: ");
        double altura = s.nextDouble();
        double IMC = massa / (altura * altura);

        testaIMC(IMC);

    }

    private static void testaIMC(double IMC) {
        String classificacao = null;
        String classificacoes[] = {"Magreza grave", "Magreza moderada", "Magreza leve", "Saudável",
            "Soberpeso", "Obesidade grau I", "Obesidade grau II (Severa)", "Obesidade grau III (Mórbida)"};
        if (IMC < 16) {
            classificacao = classificacoes[0];
        }
        if (IMC >= 16 && IMC < 17) {
            classificacao = classificacoes[1];
        }
        if (IMC >= 17 && IMC < 18.5) {
            classificacao = classificacoes[2];
        }
        if (IMC >= 18.5 && IMC < 25) {
            classificacao = classificacoes[3];
        }
        if (IMC >= 25 && IMC < 30) {
            classificacao = classificacoes[4];
        }
        if (IMC >= 30 && IMC < 35) {
            classificacao = classificacoes[5];
        }
        if (IMC >= 35 && IMC < 40) {
            classificacao = classificacoes[6];
        }
        if (IMC >= 40) {
            classificacao = classificacoes[7];
        }
        System.out.println("IMC = " + IMC + " - " + classificacao);
    }

}
