package aula04;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio5_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String operacao;
        boolean b;
        
        do {
            do {
                operacao = JOptionPane.showInputDialog(("Informar a operação (+ - * /)"));
            } while (!testaOperacao(operacao));
            float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número:")); 
            float numero2 = 0;
            if (operacao.equals("/")) {
                while (numero2 == 0) {
                    numero2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número:"));
                }
            } else {
                numero2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número:"));
            }

            float resultado = 0;
            switch (operacao) {
                case "+": {
                    resultado = numero1 + numero2;
                    break;
                }
                case "-": {
                    resultado = numero1 - numero2;
                    break;
                }
                case "*": {
                    resultado = numero1 * numero2;
                    break;
                }
                case "/": {
                    resultado = numero1 / numero2;
                    break;
                }
            }

            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            String resposta = JOptionPane.showInputDialog("Você gostaria de fazer mais alguma operação?");
            b = resposta.split("")[0].toUpperCase().equals("S");
        } while(b);
    }

    public static boolean testaOperacao(String operacao) {
        if (operacao.equals("+")) {
            return true;
        }
        if (operacao.equals("-")) {
            return true;
        }
        if (operacao.equals("*")) {
            return true;
        }
        if (operacao.equals("/")) {
            return true;
        }
        return false;
    }

}
