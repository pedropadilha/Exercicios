package desafiosPieceOfCake;

import javax.swing.JOptionPane;

public class Maratona {

    public static void main(String[] args) {
        int posicao1 = -1;
        int posicao2 = -1;
        int posicao3 = -1;
        int posicao4 = -1;
        int i = 0;
        int MARATONA = 42195;

        for (int x = 1; x < 5; x++) {
            int posicaoAtual = Integer.valueOf(JOptionPane.showInputDialog("Digite a posição do posto número " + x + ":"));
            if (posicaoAtual < 0 || posicaoAtual > MARATONA) {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
                System.exit(0);
            }

            switch (x) {
                case 1:
                    posicao1 = posicaoAtual;
                    break;
                case 2:
                    posicao2 = posicaoAtual;
                    break;
                case 3:
                    posicao3 = posicaoAtual;
                    break;
                case 4:
                    posicao4 = posicaoAtual;
                    break;
            }

        }

        if (posicao1 > 10000) {
            JOptionPane.showMessageDialog(null, "Marquinhos não vai conseguir concluir a prova.");
            System.exit(0);
        }

        if (posicao2 - posicao1 > 10000) {
            JOptionPane.showMessageDialog(null, "Marquinhos não vai conseguir concluir a prova.");
            System.exit(0);
        }

        if (posicao3 - posicao2 > 10000) {
            JOptionPane.showMessageDialog(null, "Marquinhos não vai conseguir concluir a prova.");
            System.exit(0);
        }

        if (posicao4 - posicao3 > 10000) {
            JOptionPane.showMessageDialog(null, "Marquinhos não vai conseguir concluir a prova.");
            System.exit(0);
        }

        if (MARATONA - posicao4 > 10000) {
            JOptionPane.showMessageDialog(null, "Marquinhos não vai conseguir concluir a prova.");
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "Marquinhos vai conseguir terminar a prova!");

    }
}
