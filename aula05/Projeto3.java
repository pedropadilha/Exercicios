package aula05;
import java.util.Scanner;
public class Projeto3 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = s.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = s.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double numero3 = s.nextDouble();
        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("A média é " + media);
        
        
    }    
}