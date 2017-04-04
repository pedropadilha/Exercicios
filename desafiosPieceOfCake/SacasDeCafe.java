package desafiosPieceOfCake;
import java.util.Scanner;
public class SacasDeCafe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o número de sacas de café que você vendeu: ");
        int totalSacas = s.nextInt();
        s.nextLine();
        System.out.print("Digite o valor da saca tipo exportação: ");
        double precoExportacao = s.nextInt();
        s.nextLine();
        System.out.print("Digite o valor da saca tipo comum: ");
        double precoComum = s.nextInt();
        s.nextLine();
        System.out.print("Digite o valor da saca tipo popular: ");
        double precoPopular = s.nextInt();
        s.nextLine();
        
        double valorBruto = 0;
        double impostoTotal = 0;
        int i = 1;
        
        while (i <= totalSacas) {
            int tipoDeCafe = 0;
            while(tipoDeCafe < 1 || tipoDeCafe > 3) {
                System.out.println("1) Exportação\n2) Comum\n3) Popular");
                System.out.print("Digite o tipo da saca " + i + ": ");
                tipoDeCafe = s.nextInt();
                s.nextLine();
            }
            double valorImposto = -1;
            while (valorImposto < 0) {
                System.out.print("Digite o valor do imposto (%) da saca " + i + ": ");
                valorImposto = s.nextDouble();
                s.nextLine();
            }
            switch(tipoDeCafe) {
                case 1:
                    valorBruto += precoExportacao;
                    impostoTotal += precoExportacao * valorImposto / 100;
                    break;
                case 2:
                    valorBruto += precoComum;
                    impostoTotal += precoComum * valorImposto / 100;
                    break;
                case 3:
                    valorBruto += precoPopular;
                    impostoTotal += precoPopular * valorImposto / 100;
                    break;
            }
            i++;
        }
        System.out.println("Você faturou um total de R$" + valorBruto);
        System.out.println("Você pagará um total de R$" + impostoTotal + " de impostos");
        System.out.println("Seu ganho líquido, fora os impostos, será de R$" + (valorBruto - impostoTotal));

    }
}