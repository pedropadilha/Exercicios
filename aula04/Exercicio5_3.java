package aula04;
import javax.swing.JOptionPane;
public class Exercicio5_3 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
        if (idade < 18) {
            JOptionPane.showMessageDialog(null, "CLIENTE NÃO TEM IDADE PARA COMPRAR REMÉDIO");
            Exercicio5_3.main(args);
        } else {
            String receita = JOptionPane.showInputDialog("Você possui receita médica?");
            if (!receita.split("")[0].toUpperCase().equals("S")) {
                JOptionPane.showMessageDialog(null, "CLIENTE NÃO PODE COMPRAR O REMÉDIO SEM O RECEITUÁRIO");
                Exercicio5_3.main(args);
            } else {
                JOptionPane.showMessageDialog(null, "Verificando estoque......");
                int x = (int) (Math.random() * 10);
                if (x > 5) {
                    JOptionPane.showMessageDialog(null, "REMÉDIO EM FALTA, COMPRA NÃO PODE SER CONCLUÍDA!");
                    Exercicio5_3.main(args);
                } else {
                    String dinheiro = JOptionPane.showInputDialog("Você tem dinheiro?");
                    if (!dinheiro.split("")[0].toUpperCase().equals("S")) {
                        JOptionPane.showMessageDialog(null, "CLIENTE SEM DINHEIRO, COMPRA NÃO PODE SER CONCLUÍDA");
                        Exercicio5_3.main(args);
                    } else {
                        String deNovo = JOptionPane.showInputDialog(null, "Remédio entregue. Deseja fazer outra compra?");
                        if (deNovo.split("")[0].toUpperCase().equals("S")) {
                            Exercicio5_3.main(args);
                        } else {
                            JOptionPane.showMessageDialog(null, "Obrigado pela presença e desculpe pelo transtorno. Isso é tudo culpa do Hugo Zelador");
                        }
                    }
                }
            }
        }
    }
}