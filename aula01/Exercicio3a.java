package aula01;
import javax.swing.JOptionPane;
public class Exercicio3a {
    public static void main(String[] args) {
        float massa = 0;
        do {
            massa = Float.parseFloat(JOptionPane.showInputDialog("Digite sua porcentagem de massa muscular:"));
        } while (massa < 40);
        if (massa <= 45) {
            JOptionPane.showMessageDialog(null, "Muito boa forma!");
        } else {
            if (massa < 50) {
                JOptionPane.showMessageDialog(null, "Cuidado com as bombas, mano!");
            } else {
                JOptionPane.showMessageDialog(null, "Hulk esmaga!!!");
            }
        }
    }
}