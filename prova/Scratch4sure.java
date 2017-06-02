package prova;
import java.util.Scanner;
public class Scratch4sure {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Estacionamento Scratch 4 Sure!");
        System.out.println("Vagas com um X estão ocupadas\n");
        
        double estacionamento[][] = new double[2][5];
        estacionamento[0][1] = -1;
        estacionamento[0][2] = -1;
        estacionamento[1][0] = -1;
        estacionamento[1][4] = -1;

        int vagasSobrando = 6;

        while (vagasSobrando > 0) {

            int cadastrar = 0;
            while (cadastrar < 1 || cadastrar > vagasSobrando) {
                System.out.print("Vagas sobrando: " + vagasSobrando + " - digite quantos carros você vai cadastrar: ");
                cadastrar = s.nextInt();
                s.nextLine();
            }

            for (int i = 0; i < cadastrar; i++) {

                mostrarEstacionamento(estacionamento);

                int andar = 0;
                int vaga = 0;
                boolean primeiraVez = true;

                while (andar < 0 || andar > 2 || primeiraVez) {
                    System.out.print("  Digite o andar em que vai estacionar: ");
                    andar = s.nextInt();
                    s.nextLine();
                    primeiraVez = false;
                }

                primeiraVez = true;
                while (vaga < 0 || vaga > 5 || primeiraVez) {
                    System.out.print("  Digite a vaga do " + andar + "º andar em que vai estacionar: ");
                    vaga = s.nextInt();
                    s.nextLine();
                    primeiraVez = false;
                }

                if (estacionamento[andar - 1][vaga - 1] == 0) {
                    String tipo = "";
                    while (!(tipo.equalsIgnoreCase("A") || tipo.equalsIgnoreCase("M"))) {
                        System.out.print("    Digite 'M' para mensalista ou 'A' para avulso: ");
                        tipo = s.nextLine();
                    }

                    double valor;
                    if (tipo.equalsIgnoreCase("M")) {
                        System.out.println("      O cliente vai pagar R$200,00");
                        valor = 200;
                    } else {
                        System.out.print("      Digite quantas horas o cliente ficou parado no estacionamento: ");
                        double tempo = s.nextDouble();
                        s.nextLine();
                        valor = tempo * 5;
                        System.out.println("        O cliente vai pagar R$" + valor + " por " + tempo + " horas");
                    }
                    estacionamento[andar - 1][vaga - 1] = valor;
                } else {
                    System.out.println("    Vaga ocupada!");
                    System.exit(0);
                }
            }
            vagasSobrando -= cadastrar;
            System.out.println("");
        }
        
        double valorTotal = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                double valorAtual = estacionamento[i][j];
                if (valorAtual > 0) {
                    valorTotal += valorAtual;
                }
            }
        }
        
        System.out.println("\nEstacionamento lotado!");
        System.out.println("Valor total arrecadado: R$" + valorTotal);
        
    }

    public static void mostrarEstacionamento(double[][] estacionamento) {
        for (int i = 0; i < 2; i++) {
            System.out.print((i + 1) + "º) ");
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + (estacionamento[i][j] == 0 ? (j + 1) : "X") + "]");
            }
            System.out.println("");
        }
    }
}