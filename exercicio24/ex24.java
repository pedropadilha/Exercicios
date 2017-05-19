package exercicio24;

import java.util.Scanner;

public class ex24 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = s.nextLine();
        System.out.print(nome + ", digite a sua idade: ");
        int idade = s.nextInt();
        s.nextLine();
        System.out.print(nome + ", digite a sua massa: ");
        double massa = s.nextDouble();
        s.nextLine();
        System.out.print(nome + ", digite a quantidade de meses desde a sua última doação (0 se nunca doou): ");
        int mesesDesdeUltimaDoacao = s.nextInt();
        s.nextLine();
        if (validarDoador(idade, massa, mesesDesdeUltimaDoacao)) {
            System.out.println("Parabéns " + nome + ", você pode doar sangue!");
        } else {
            System.out.println(nome + ", infelizmente você não pode doar sangue...");
        }
    }

    public static boolean validarDoador(int idade, double massa, int mesesDesdeUltimaDoacao) {
        boolean idadeValida = (idade >= 16 && idade <= 69);
        boolean massaValida = (massa > 50);
        boolean podeDoar = (mesesDesdeUltimaDoacao >= 6 || mesesDesdeUltimaDoacao == 0);
        return idadeValida && massaValida && podeDoar;
    }
}