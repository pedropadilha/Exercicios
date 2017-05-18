package exercicio22;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean[][] campo = gerarCampo();
        int vidas = 2;
        init();
        for (int linha = 0; linha < 5; linha++) {
            System.out.print("Linha " + (linha + 1) + " - Digite o quadrado: ");
            int quadrado = s.nextInt() - 1;
            s.nextLine();
            while(quadrado < 0 || quadrado > 4) {
                System.out.print("Quadrado não existe! Digite o quadrado: ");
                quadrado = s.nextInt() - 1;
                s.nextLine();
            }
            
            boolean bomba = campo[linha][quadrado];
            if (bomba) {
                System.out.println("BOOOOOOOM!!!");
                vidas--;
                System.out.println("Vidas: " + vidas);
                if (vidas == 0) {
                    System.out.println("Fim do jogo!");
                    System.exit(0);
                }
            } else {
                System.out.println("Quadrado livre!\n");
            }
        }
        System.out.println("Missão cumprida!");
    }
    public static boolean[][] gerarCampo() {
        boolean[][] campo = new boolean[5][5];
        for (int i = 0; i < 5; i++) {
            int bomba = new Random().nextInt(5);
            for (int j = 0; j < 5; j++) {
                campo[i][j] = (bomba == j);
            }
        }
        return campo;
    }
    public static void init() {
        System.out.println("Campo Minado\n");
        System.out.println("Regras:");
        System.out.println("    Existem 5 linhas, cada uma com 5 quadrados");
        System.out.println("    Em cada linha há uma bomba escondida em um dos quadrados");
        System.out.println("    Quando pedido, indique apenas o número do quadrado em que deseja pisar");
        System.out.println("    Você tem duas vidas, ou seja, pode pisar em uma bomba e ainda terminar o jogo vivo!");
        System.out.println("    Boa sorte!\n");
    }
}