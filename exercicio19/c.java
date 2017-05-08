package exercicio19;

import java.util.Scanner;

public class c {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[][] produtos = new String[3][3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            String nome = s.nextLine();
            System.out.print("Digite o preço de cada " + nome + ": ");
            double preco = s.nextDouble();
            s.nextLine();
            System.out.print("Digite quantas unidades de " + nome + " há no estoque: ");
            int unidades = s.nextInt();
            s.nextLine();
            produtos[i][0] = nome;
            produtos[i][1] = String.valueOf(preco);
            produtos[i][2] = String.valueOf(unidades);
        }
        double valorEstoque = 0;
        for (int i = 0; i < 3; i++) {
            valorEstoque += Double.valueOf(produtos[i][1]) * Double.valueOf(produtos[i][2]);
        }
        System.out.println("Valor total do estoque: " + valorEstoque);
        System.out.print("Digite o produto a ser checado: ");
        int checar = s.nextInt() - 1;
        System.out.println("O produto é " + produtos[checar][0] + ", seu valor unitário é de R$"
                + produtos[checar][1] + " e há " + produtos[checar][2] + " unidades em estoque");
    }
}
