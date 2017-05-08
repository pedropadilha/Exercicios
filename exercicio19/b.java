package exercicio19;

import java.util.Scanner;

public class b {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lugares[][] = new int[4][5];
        int vendidos = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("A " + (j + 1) + "ª poltrona da " + (i + 1) + "ª fileira foi vendida? ");
                String s1 = s.nextLine();
                if (s1.equalsIgnoreCase("s")) {
                    lugares[i][j] = 1;
                    vendidos++;
                }
            }
        }
        System.out.println("Foram vendidas " + vendidos + " poltronas!");
        System.out.println("Você quer saber a situação de qual fileira?");
        int fileira = s.nextInt();
        System.out.println("Você quer saber a situação de qual poltrona da fileira " + fileira + "?");
        int poltrona = s.nextInt();
        System.out.println("Poltrona " + poltrona + " da fileira " + fileira + ": "
                + (lugares[fileira - 1][poltrona - 1] == 1 ? "foi vendida" : "não foivendida"));
        
    }
}
