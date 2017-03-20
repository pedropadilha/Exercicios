package aula10;

import javax.swing.JOptionPane;

public class Janelas {

    public static void main(String[] args) {
        /*
                JOptionPane.showMessageDialog(null, "OI");
        int i = Integer.valueOf(JOptionPane.showInputDialog("int"));
        double d = Double.valueOf(JOptionPane.showInputDialog("double"));
        String s = JOptionPane.showInputDialog("String");
        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
         */
        String s = JOptionPane.showInputDialog("Digite a sua cidade");
        JOptionPane.showMessageDialog(null, "Você é de " + s + "!");
        int dentes = Integer.valueOf(JOptionPane.showInputDialog(null, "Quantos dentes você tem?"));
        double peso = Double.valueOf(JOptionPane.showInputDialog(null, "Qual é o seu peso?"));
    }
}