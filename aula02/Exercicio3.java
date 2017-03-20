package aula02;
import java.util.Scanner;
public class Exercicio3 {

    public enum TIPO {
        PESO_MEDIO, PESO_PENA
    };
    static Scanner teclado = new Scanner(System.in);
    static int x = 1;

    public static void main(String[] args) {
        TIPO lutador1 = pedeLutador();
        TIPO lutador2;
        do {
            lutador2 = pedeLutador();
        } while (lutador1 != lutador2);
        
        
        System.out.println("IIIIIIT'S TIIIIME!!! FIIIIIGHT!!!");
        
    }

    public static TIPO testaLutador(float massa) {
        TIPO lutador = null;
        if (massa < 50) {
            System.out.println("Não tem condições de lutar!");
            System.exit(0);
        }

        if (massa > 50 && massa < 70) {
            lutador = TIPO.PESO_PENA;
            System.out.println("Lutador 1 -> Peso pena");
        }
        if (massa >= 70 && massa < 80) {
            lutador = TIPO.PESO_MEDIO;
            System.out.println("Lutador 1 -> Peso médio");
        }
        return lutador;

    }

    public static TIPO pedeLutador() {
        TIPO tipoLutador;
        float massa = -1;
        do {
            System.out.print("Digite a massa do lutador" + x + ": ");
            massa = teclado.nextFloat();
        } while (massa < 0);
        tipoLutador = testaLutador(massa);
        if (x < 2) {
            x++;
        }
        return tipoLutador;
    }

}