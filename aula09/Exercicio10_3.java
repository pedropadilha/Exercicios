package aula09;
import java.util.Scanner;
public class Exercicio10_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o seu salário bruto: ");
        double salarioBruto = s.nextDouble();
        System.out.print("Digite a mensalidade do seu contador: ");
        double mensalidadeContador = s.nextDouble();
        System.out.print("Digite o seu TFE anual: ");
        double TFEMensal = s.nextDouble() / 12;
        double imposto = salarioBruto * 0.06;
        double salarioLiquido = salarioBruto - mensalidadeContador - TFEMensal - imposto;
    }
}
