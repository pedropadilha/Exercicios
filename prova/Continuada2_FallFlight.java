package prova;
import java.util.Scanner;
public class Continuada2_FallFlight {
    public static void main(String[] args) {
        System.out.println("Fall Flight\n");
        Scanner s = new Scanner(System.in);
        boolean[][] poltronas = new boolean[6][2];
        System.out.print("Digite o valor de cada passagem: ");
        double precoPassagem = s.nextDouble();
        s.nextLine();
        System.out.println("");
        while (!checaPoltronas(poltronas)) {
            System.out.print("Digite a fileira: ");
            int fileira = s.nextInt();
            if (fileira > 0 && fileira < 7) {
                System.out.print("Digite a poltrona: ");
                int poltrona = s.nextInt();
                if (poltrona > 0 && poltrona < 3) {
                    System.out.println("Selecionados: Fileira " + fileira + " e poltrona " + poltrona);
                    fileira -= 1;
                    poltrona -= 1;
                    if (poltronas[fileira][poltrona]) {
                        System.out.println("Poltrona já foi vendida. Digite uma poltrona válida!");
                    } else {
                        poltronas[fileira][poltrona] = true;
                        System.out.println("Poltrona livre. Venda realizada com sucesso!");
                    }
                } else {
                    System.out.println("Poltrona inválida!");
                }
            } else {
                System.out.println("Fileira inválida!");
            }
            System.out.println("");
        }
        System.out.println("Vôo lotado! Valor total arrecadado: R$" + (precoPassagem * 12));
    }

    public static boolean checaPoltronas(boolean[][] poltronas) {
        boolean ret = true;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                    ret = ret && poltronas[i][j];
            }
        }
        return ret;
    }
}