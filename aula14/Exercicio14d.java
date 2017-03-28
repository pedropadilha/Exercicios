package aula14;

public class Exercicio14d {

    public static void main(String[] args) {
        int x = 1;
        while (x <= 11) {
            if (x <= 5) {
                System.out.println("Somos os primeiros");
            } else {
                if (x <= 10) {
                    System.out.println("Somos os últimos");
                } else {
                    System.out.println("Sou o último");
                }
            }
            x++;
        }
    }
}
