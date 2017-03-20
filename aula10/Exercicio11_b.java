package aula10;
import javax.swing.JOptionPane;
public class Exercicio11_b {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, JOptionPane.showInputDialog("Digite a senha").equals("123") ? "Senha válida!" : "Senah Inválida!");
    }
}