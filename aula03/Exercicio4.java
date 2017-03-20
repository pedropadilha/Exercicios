package aula03;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio4 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int capacidade = -1;
        int passageiros = 0;
        boolean parou = true;

        do {
            capacidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade do ônibus:"));
        } while (capacidade < 0);
        System.out.println("Capacidade do ônibus: " + capacidade);
        while (parou) {

            passageiros = fezParada(passageiros, true);

            while (passageiros > capacidade || passageiros < 0) {
                int diff = passageiros - capacidade;
                String s = "";
                if (diff > 1) {
                    s = "s";
                }
                JOptionPane.showMessageDialog(null, "LOTADO! " + diff + " passageiro" + s + " devem descer!");
                int desceram = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos passageiros desceram:"));
                passageiros = passageiros(passageiros, desceram);
            }
            parou = parou();
            //parou = true;
        }

    }

    public static int fezParada(int passageiros, boolean b) {
        int passageiros_new;
        if (b) {
            JOptionPane.showMessageDialog(null, "Ônibus fez uma parada!");
            System.out.println("Ônibus parou");
        }
        int subiram = -1;
        do {
            subiram = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de passageiros que subiram:"));
        } while (subiram < 0);
        System.out.println("Passageiros que subiram: " + subiram);
        int desceram = -1;
        do {
            desceram = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de passageiros que desceram:"));
        } while (desceram < 0);
        System.out.println("Passageiros que desceram: " + desceram);
        passageiros_new = passageiros(passageiros, subiram, desceram);
        System.out.println("Passageiros: " + passageiros);
        if (passageiros_new < 0) {
            System.err.println("NÃO PODE HAVER UM NÚMERO NEGATIVO DE PASSAAGEIROS!");
            passageiros_new = fezParada(passageiros, false);
        }
        return passageiros_new;
    }

    public static int passageiros(int passageiros, int subiram, int desceram) {
        passageiros = passageiros + subiram - desceram;

        return passageiros;
    }

    public static int passageiros(int passageiros, int desceram) {
        passageiros = passageiros - desceram;

        return passageiros;
    }
    
    public static boolean parou() {
         return JOptionPane.showInputDialog("O ônibus fez mais alguma parada?").split("")[0].toUpperCase().equals("S");
    }

}

/*


A. O usuario informa quantos passageiros o ônibus suporta. 
B. O ônibus faz uma parada. 
    B.1. O usuário informa quantos passageiros descem
    B.2. O usuário informa quantos passageiros embarcam
C. Caso o número de passageiros exceda o limite estabelecido em A, exibir a mensagem "Lotado. Alguém deve descer"
    C.1. O usuário informa quantos passageiros desceram
    C.2. Caso o limite ainda não tenha sido respeitado, voltar para o item C
    C.3. Caso o limite tenha sido respeitado, ir para o item D
D. Caso ainda não tenha chegado ao fim da linha, voltar para o item B 
E. Caso tenha chegado ao fim da linha...
    E.1. Todos desembarcam
    E.2. Perguntar ao usuário se o ônibus deve dar outra volta. Se sim, voltar para o item B. Se não, encerrar o programa

 */
