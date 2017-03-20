package aula11;

import java.util.Scanner;
public class Exercicio12a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = s.nextInt();
        if (idade < 0 || idade >= 50) {
            System.exit(0);
        }
        System.out.print("Digite o seu sexo (M ou F): ");
        String sexo = s.next();
        if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
            System.out.print("Digite o seu salário: ");
            double salario = s.nextDouble();
            if (salario < 0) {
                System.exit(0);
            }
            int idadeAposentadoria;
            int porcentagemSalario;
            if (sexo.equalsIgnoreCase("M")) {
                if (idade <= 20) {
                    idadeAposentadoria = 65;
                    porcentagemSalario = 70;
                } else {
                    idadeAposentadoria = 60;
                    porcentagemSalario = 80;
                }
            } else {
                if (idade <= 20) {
                    idadeAposentadoria = 65;
                    porcentagemSalario = 70;
                } else {
                    idadeAposentadoria = 55;
                    porcentagemSalario = 80;
                }
            }
            double salarioFinal = salario * porcentagemSalario / 100;
            int anoAposentadoria = 2017 + (idadeAposentadoria - idade);
            System.out.println("Você vai se aposentar no ano de " + anoAposentadoria + ", recebendo o valor de R$ " + salarioFinal + ".");
        }
    }
}