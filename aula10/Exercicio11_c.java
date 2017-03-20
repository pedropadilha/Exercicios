package aula10;

import javax.swing.JOptionPane;

public class Exercicio11_c {

    public static void main(String[] args) {
        double bruto = Double.valueOf(JOptionPane.showInputDialog("Digite o seu salário: "));
        double liquido = bruto < 1000 ? 0.95 * bruto : 0.8 * bruto;
        double inss = bruto < 2000 ? 0.08 * bruto : 0.1 * bruto;
        JOptionPane.showMessageDialog(null, "Seu líquido é " + liquido + " seu INSS é " + inss);
        
    }
}


/*
Solicite o salário do usuário.
Calcule seus líquido e INSS.
Cálculo do líquido:
  Se o bruto for <1000, é 95% do bruto
  Senão, é 80% do líquido
Cálculo do INSS:
  Se o bruto for <2000, é 8% do bruto
  Senão, é 10% do líquido
Ao final, exiba "Se líquido é X e seu INSS é Y".

*/
