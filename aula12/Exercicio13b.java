package aula12;

import java.util.Scanner;

public class Exercicio13b {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1 - DragonBall Z\n"
                + "\n"
                + "2 - Fly\n"
                + "\n"
                + "3 - Pokemon\n"
                + "\n"
                + "3 - Ursinhos carinhosos");
        System.out.print("Digite o seu anime preferido: ");
        String anime = s.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = s.nextInt();
        if (idade < 3) {
            System.out.println("Idade inválida!");
            System.exit(0);
        }
        if (idade > 16) {
            System.out.println("Que não seja criança nas responsabilidades, apenas no coração");
        }
        int valorDragonBallZ = 35;
        int valorFly = 30;
        int valorPokemon = 25;
        int valorUrsinhosCarinhosos = 3;
        
        double valor = 0;
        switch (anime) {
            case "1":
                valor = valorDragonBallZ;
                break;
            case "2": 
                valor = valorFly;
                break;
            case "3":
                valor = valorPokemon;
                break;
            case "4":
                valor = valorUrsinhosCarinhosos;
                break;
        }
        
        if (idade < 6) {
            valor = valor * 0.9;
        }
        
        System.out.println("O valor do anime é de R$" + valor + "0");
        
    }

}
