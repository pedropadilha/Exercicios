package aula01;
import javax.swing.JOptionPane;
public class Exercicio3b {
    public static void main(String[] args) {
        float massa = 0;
        do {
            massa = Float.parseFloat(JOptionPane.showInputDialog("Digite sua porcentagem de massa muscular:"));
        } while (massa < 40 || massa > 100);
        if (massa > 40 && massa <= 45) {
            JOptionPane.showMessageDialog(null, "Muito boa forma!");
        }
        if (massa > 45 && massa < 50) {
            JOptionPane.showMessageDialog(null, "Cuidado com as bombas, mano!");
        }
        if (massa > 50) {
            JOptionPane.showMessageDialog(null, "Hulk esmaga!!!");
        }
    }
}