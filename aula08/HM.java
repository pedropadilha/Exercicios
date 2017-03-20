package aula08;

import java.util.Scanner;

public class HM {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = s.nextInt();
        System.out.print("Digite o seu sexo: ");
        String sexo = s.next();
        String texto = "Você é um";
        if (sexo.equals("masculino")) {
            texto += " homem ";
        }
        if (sexo.equals("feminino")) {
            texto += "a mulher ";
        }
        if (idade >= 18) {
            texto += "maior de idade!";
        } else {
            texto += "menor de idade!";
        }
        System.out.println(texto);
    }
}
