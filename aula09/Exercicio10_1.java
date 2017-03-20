package aula09;
import java.util.Scanner;
public class Exercicio10_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a sua massa em kg: ");
        double massa = s.nextDouble();
        System.out.print("Digite a sua altura em m: ");
        double altura = s.nextDouble();
        System.out.print("Digite o seu sexo: ");
        String sexo = s.next();
        double imc = massa / (altura * altura);
        String imcText = "";
        if ("masculino".equals(sexo)) {
            if (imc <= 20.7) {
                imcText = " abaixo do peso!";
            }
            if (imc > 20.7 && imc <= 26.4) {
                imcText = " no peso normal!";
            }
            if (imc > 26.4 && imc <= 27.8) {
                imcText = " marginalmente acima do peso!";
            }
            if (imc > 27.8 && imc <= 31.1) {
                imcText = " acima do peso ideal!";
            }
            if (imc > 31.1) {
                imcText = " obeso!";
            }
        }
        if ("feminino".equals(sexo)) {
            if (imc <= 19.1) {
                imcText = " abaixo do peso!";
            }
            if (imc > 19.1 && imc <= 25.8) {
                imcText = " no peso normal!";
            }
            if (imc > 25.8 && imc <= 27.3) {
                imcText = " marginalmente acima do peso!";
            }
            if (imc > 27.3 && imc <= 32.3) {
                imcText = " acima do peso ideal!";
            }
            if (imc > 32.3) {
                imcText = " obeso!";
            }
        }
        System.out.println("Seu IMC é " + imc + " e você está " + imcText);
    }
}