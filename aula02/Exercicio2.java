package aula02;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        float massa = -1;
        float altura = -1;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite a sua massa em kg: ");
            massa = teclado.nextFloat();
        } while(massa < 0);
        
        do {
            System.out.print("Digite a sua altura em cm: ");
            altura = teclado.nextFloat() / 100;
        } while(altura < 0);
        
        if (massa < 40) {
            System.out.println("Sua massa é muito pequena, vamos comer um pouco mais!");
            System.exit(0);
        }
        
        if (massa > 120) {
            System.out.println("Sua massa está muito grande, vamos comer um pouco menos!");
            System.exit(0);
        }
        
        float IMC = massa / (altura * altura);
        
        testaIMC(IMC);
        
    }
    
    private static void testaIMC(float IMC) {
        String classificacao = null;
        String classificacoes[] = {"Magreza grave", "Magreza moderada", "Magreza leve", "Saudável",
            "Soberpeso", "Obesidade grau I", "Obesidade grau II (Severa)", "Obesidade grau III (Mórbida)"};
        if (IMC < 16) {
            classificacao = classificacoes[0];
        }
        if (IMC >= 16 && IMC < 17) {
            classificacao = classificacoes[1];
        }
        if (IMC >= 17 && IMC < 18.5) {
            classificacao = classificacoes[2];
        }
        if (IMC >= 18.5 && IMC < 25) {
            classificacao = classificacoes[3];
        }
        if (IMC >= 25 && IMC < 30) {
            classificacao = classificacoes[4];
        }
        if (IMC >= 30 && IMC < 35) {
            classificacao = classificacoes[5];
        }
        if (IMC >= 35 && IMC < 40) {
            classificacao = classificacoes[6];
        }
        if (IMC >= 40) {
            classificacao = classificacoes[7];
        }
        System.out.println("IMC = " + IMC + " - " + classificacao);
    }
    
}