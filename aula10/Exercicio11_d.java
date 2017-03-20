package aula10;
import javax.swing.JOptionPane;
public class Exercicio11_d {
    public static void main(String[] args) {
         int filhos = Integer.valueOf(JOptionPane.showInputDialog("Quantos filhos você tem?"));
         String mensagem = "Você tem ";
         JOptionPane.showMessageDialog(null, "Você tem " + (filhos == 0 ? "internet, TV paga e video game" : filhos == 1 ? "internet e TV paga" : 
                 filhos == 2 ? "internet" : "nada"));
    }
}