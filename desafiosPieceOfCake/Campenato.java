package desafiosPieceOfCake;

import java.util.Scanner;

public class Campenato {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totalDeGols = 0;
        int timeAtual = 1;
        System.out.print("Digite o total de times do campeonato: ");
        int times = s.nextInt();
        s.nextLine();
        if (times % 2 != 0) {
            System.out.println("O número total de times deve ser par!");
            System.exit(0);
        }

        System.out.println("");

        for (int x = 1; x <= times; x += 2) {
            System.out.println("Jogo entre os times " + x + " e " + (x + 1));
            int gols1 = -1;
            while (gols1 < 0 || gols1 > 15) {
                System.out.print("      Digite o número de gols do time " + x + ": ");
                gols1 = s.nextInt();
                s.nextLine();
            }

            totalDeGols += gols1;

            int gols2 = -1;
            while (gols2 < 0 || gols2 > 15) {
                System.out.print("      Digite o número de gols do time " + (x + 1) + ": ");
                gols2 = s.nextInt();
                s.nextLine();
            }

            totalDeGols += gols2;

            if (gols1 > gols2) {
                System.out.println("      Vitória do time " + x + "!");
            } else {
                if (gols2 > gols1) {
                    System.out.println("      Vitória do time " + (x + 1) + "!");
                } else {
                    System.out.println("      Houve empate!");
                }
            }
            
            System.out.println("\n---------------------------------------------\n");


        }
            System.out.println("O campeonato teve um total de " + totalDeGols + " gols, com uma média de "
                + (totalDeGols / (times / 2)) + " gols por jogo!");

    }
}