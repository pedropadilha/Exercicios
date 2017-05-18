package exercicio21;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o número de fileiras na sala de cinema: ");
        int totalFileiras = s.nextInt();
        s.nextLine();
        System.out.print("Digite o número de poltronas em cada fileira: ");
        int totalPoltronas = s.nextInt();
        s.nextLine();
        double[][] poltronas = new double[totalFileiras][totalPoltronas];
        System.out.print("Digite o valor do ingresso: ");
        double ingresso = s.nextDouble();
        s.nextLine();
        System.out.println("Tipos de ingresso:");
        System.out.println("    1) Inteira");
        System.out.println("    2) Meia");
        System.out.println("    3) Convite\n");
        int i = 0;
        while (i < totalFileiras * totalPoltronas) {
            System.out.print("Digite a fileira: ");
            int fileira = s.nextInt();
            s.nextLine();
            if (fileira > 0 && fileira < (totalFileiras + 1)) {
                System.out.print("Digite a poltrona: ");
                int poltrona = s.nextInt();
                s.nextLine();
                if (poltrona > 0 && poltrona < (totalPoltronas + 1)) {
                    System.out.println("Selecionados: Fileira " + fileira + " e poltrona " + poltrona);
                    fileira -= 1;
                    poltrona -= 1;
                    if (poltronas[fileira][poltrona] > 0) {
                        System.out.println("Poltrona já foi vendida. Digite uma poltrona válida!\n");
                    } else {
                        System.out.println("Poltrona livre!");
                        System.out.print("Digite o tipo do ingresso: ");
                        int tipoIngresso = s.nextInt();
                        s.nextLine();
                        if (tipoIngresso > 0 && tipoIngresso < 4) {
                            double preco = 0;
                            switch (tipoIngresso) {
                                case 1:
                                    preco = ingresso;
                                    break;
                                case 2:
                                    preco = ingresso / 2;
                                    break;
                            }
                            poltronas[fileira][poltrona] = preco;
                            System.out.println("Poltrona vendida!\n");
                            i++;
                        } else {
                            System.out.println("Tipo inválido!\n");
                        }
                    }
                } else {
                    System.out.println("Poltrona inválida!\n");
                }
            } else {
                System.out.println("Fileira inválida!\n");
            }
        }
        double totalArrecadado = 0;
        System.out.println("Venda finalizada, sala cheia!\n");
        for (int fileira = 0; fileira < totalFileiras; fileira++) {
            for (int poltrona = 0; poltrona < totalPoltronas; poltrona++) {
                totalArrecadado += poltronas[fileira][poltrona];
            }
        }
        System.out.println("Total arrecadado: R$" + totalArrecadado);
    }
}