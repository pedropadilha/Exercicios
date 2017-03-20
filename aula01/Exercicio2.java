package aula01;

import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
        System.out.println("Idade: " + idade);
        char sexo = JOptionPane.showInputDialog("Digite seu sexo: (M ou F)").charAt(0);
        String texto = "";
        if (sexo == 'M' || sexo == 'm') {
            System.out.println("Sexo: Masculino");
            texto = "Você é um homem ";
        } else {
            if (sexo == 'F' || sexo == 'f') {
                System.out.println("Sexo: Feminino");
                texto = "Você é uma mulher ";

            } else {
                JOptionPane.showMessageDialog(null, "Digite um sexo válido!");
                System.err.println("Sexo inválido!");
                System.exit(-1);
            }
        }

        if (idade >= 18) {
            texto += "maior de idade!";
        } else {
            texto += "menor de idade";
        }

        JOptionPane.showMessageDialog(null, texto);
    }
}
