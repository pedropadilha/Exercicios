package aula07;

import java.util.Scanner;

public class Exercicio8_4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o seu salário bruto: ");
        double salario = s.nextDouble();
        System.out.print("Digite a porcentagem que vai para o INSS: ");
        double inss = s.nextDouble();
        System.out.print("Digite a porcentagem que vai para o FGTS: ");
        double fgts = s.nextDouble();
        System.out.print("Digite a porcentagem que vai para o IR: ");
        double ir = s.nextDouble();
        System.out.print("Digite quanto você ganha de VR: ");
        double vr = s.nextDouble();
        double inssBruto = (inss / 100) * salario;
        double fgtsBruto = (fgts / 100) * salario;
        double irBruto = (ir / 100) * salario;
        double salarioLiquido = salario - inssBruto - fgtsBruto - irBruto + vr;
        System.out.println("Seu salário líquido ordinário é R$" + salarioLiquido);
        double salarioFerias = salario * 1.3;
        double inssFeriasBruto = (inss / 100) * salarioFerias;
        double fgtsFeriasBruto = (fgts / 100) * salarioFerias;
        double irFeriasBruto = (ir / 100) * salarioFerias;
        double salarioFeriasLiquido = salarioFerias - inssFeriasBruto - fgtsFeriasBruto - irFeriasBruto + vr;
        System.out.println("No seu mês de férias seu salário líquido é R$" + salarioFeriasLiquido);
        double salarioDezembro = salario * 1.9;
        double inssDezembroBruto = (inss / 100) * salarioDezembro;
        double fgtsDezembroBruto = (fgts / 100) * salarioDezembro;
        double irDezembroBruto = (ir / 100) * salarioDezembro;
        double salarioDezembroLiquido = salarioDezembro - inssDezembroBruto - fgtsDezembroBruto
                - irDezembroBruto + vr;
        System.out.println("Em dezembro seu salário líquido é R$" + salarioDezembroLiquido);

    }

}

/*

IV. Perguntar ao usuário qual seu salário bruto. Depois perguntar quanto % vai para o INSS, depois % vai para 
o FGTS e depois quanto % vai para o IR. Perguntar ainda quanto ele ganha de VR.

Um dado: considere que no mês de férias o bruto é 30% a mais que nos demais meses e e dezembro, 90% a mais.

O salário líquido é o valor bruto menos INSS menos FGTS menos IR mais VR.

Ao final, exiba "Seu salário líquido ordinário é R$X.". Depois "No seu mês de férias, ganha líquido R$Y". 
Depois "Em dezembro seu líquido é R$Z".

*/
