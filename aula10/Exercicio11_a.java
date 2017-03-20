package aula10;
import javax.swing.JOptionPane;
public class Exercicio11_a {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, Double.valueOf(JOptionPane.showInputDialog("Digite a sua altura"))<1.95 ? "Você não pode jogar basquete" : "Você pode jogar basquete");
    }
}