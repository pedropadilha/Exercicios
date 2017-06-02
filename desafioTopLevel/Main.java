package desafioTopLevel;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean novamente = true;
        while (novamente) {
            Scanner s = new Scanner(System.in);
            boolean[][] campo = gerarCampo();
            boolean vivo = true;
            init();
            for (int linha = 0; linha < 5; linha++) {
                mostrarCampo(campo, vivo, -1);
                System.out.print("Linha " + (linha + 1) + " - Digite o quadrado: ");
                int quadrado = s.nextInt() - 1;
                s.nextLine();
                while (quadrado < 0 || quadrado > 3) {
                    System.out.print("Quadrado não existe! Digite o quadrado: ");
                    quadrado = s.nextInt() - 1;
                    s.nextLine();
                }

                boolean bomba = campo[linha][quadrado];

                if (bomba) {
                    vivo = false;
                    mostrarCampo(campo, vivo, linha);
                    System.out.println("BOOOOOOOM!!!");
                    System.out.println("Fim do jogo!");
                    break;
                } else {
                    System.out.println("Quadrado livre!\n");
                }
            }
            if (vivo) {
                System.out.println("Você venceu!");
            }
            System.out.println("");
            System.out.print("Deseja jogar novamente? (S ou N)");
            novamente = s.nextLine().equalsIgnoreCase("S");
        }
    }

    public static boolean[][] gerarCampo() {
        boolean[][] campo = new boolean[5][4];
        for (int i = 0; i < 5; i++) {
            int bomba = new Random().nextInt(4);
            for (int j = 0; j < 4; j++) {
                campo[i][j] = (bomba == j);
            }
        }
        return campo;
    }

    public static void init() {
        System.out.println("Campo Minado\n");
        System.out.println("Regras:");
        System.out.println("    Existem 5 linhas, cada uma com 4 quadrados");
        System.out.println("    Em cada linha há uma bomba escondida em um dos quadrados");
        System.out.println("    Quando pedido, indique apenas o número do quadrado em que deseja pisar");
        System.out.println("    Boa sorte!\n");
    }

    public static void mostrarCampo(boolean[][] campo, boolean vivo, int ondeMorreu) {
        for (int i = 4; i >= 0; i--) {
            System.out.print((i + 1) + " - ");
            for (int j = 0; j < 4; j++) {
                System.out.print(campo[i][j] && !vivo ? (ondeMorreu == i ? "#    " : "0    ") : "0    ");
                if (j == 3) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}