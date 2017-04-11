package aula18;

import java.util.Scanner;

public class Exercicio17b {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Quantidade de produto comprados: ");
        int produtos = s.nextInt();
        s.nextLine();
        double[] precos = new double[produtos];
        for (int i = 0; i < produtos; i++) {
            int produtoAtual = i + 1;
            System.out.print("Digite o valor do produto " + produtoAtual + ": ");
            double preco = s.nextDouble();
            s.nextLine();
            System.out.print("Digite a quantidade de produtos comprados: ");
            int quantidade = s.nextInt();
            s.nextLine();
            precos[i] = preco * quantidade;
        }
        
        for (int i = 0; i < produtos; i++) {
            System.out.println("Valor total da compra do produto " + (i + 1) + ": " + precos[i]);
        }
    }
}
