package desafiosPieceOfCake;

import java.util.Scanner;

public class CadastroDeSayajins {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite quantos Sayajins serão cadastrados: ");
        int totalDeSayajins = s.nextInt();
        s.nextLine();
        System.out.print("Digite em quantas vezes o poder de luta aumenta quando vira Super Sayajin 1: ");
        double aumentaSuperSayajin1 = s.nextDouble();
        s.nextLine();
        System.out.print("Digite em quantas vezes o poder de luta aumenta quando vira Super Sayajin 2: ");
        double aumentaSuperSayajin2 = s.nextDouble();
        s.nextLine();
        System.out.print("Digite em quantas vezes o poder de luta aumenta quando vira Super Sayajin 3: ");
        double aumentaSuperSayajin3 = s.nextDouble();
        s.nextLine();
        System.out.print("Digite em quantas vezes o poder de luta aumenta quando vira Super Sayajin Blue: ");
        double aumentaSuperSayajinBlue = s.nextDouble();
        s.nextLine();
        System.out.print("Digite em quantas vezes o poder de luta aumenta quando vira Super Sayajin Deus: ");
        double aumentaSuperSayajinDeus = s.nextDouble();
        s.nextLine();
        
        String nomeMaisForte = "";
        double poderBaseMaisForte = 0;
        String nomeMaisFraco = "";
        double poderBaseMaisFraco = 0;
        

        int sayajinAtual = 1; //Essa é para o Vitor Hugo, que reclama do meu "int i = 1;"

        while (sayajinAtual <= totalDeSayajins) {
            String nome = "";
            while (nome.equals("")) {
                System.out.print("Digite o nome do Sayajin " + sayajinAtual + ": ");
                nome = s.nextLine();
            }

            double poderBase = 0;
            while (poderBase <= 0) {
                System.out.print("Digite o Poder de Luta Base do Sayajin " + sayajinAtual + ": ");
                poderBase = s.nextDouble();
                s.nextLine();
            }

            if (sayajinAtual == 1) {
                nomeMaisFraco = nome;
                poderBaseMaisFraco = poderBase;
            }

            if (poderBase < poderBaseMaisFraco) {
                poderBaseMaisFraco = poderBase;
                nomeMaisFraco = nome;
            }
            if (poderBase > poderBaseMaisForte) {
                poderBaseMaisForte = poderBase;
                nomeMaisForte = nome;
            }

            double poderAtual;
            System.out.println("A evolução do poder de Luta de " + nome + " é:");
            int i = 1; //Não aguentei...
            while (i <= 6) {
                switch (i) {
                    case 1:
                        poderAtual = poderBase;
                        System.out.println("Forma base: " + poderAtual);
                        break;
                    case 2:
                        poderAtual = poderBase * aumentaSuperSayajin1;
                        System.out.println("Super Sayajin 1: " + poderAtual);
                        break;
                    case 3:
                        poderAtual = poderBase * aumentaSuperSayajin2;
                        System.out.println("Super Sayajin 2: " + poderAtual);
                        break;
                    case 4:
                        poderAtual = poderBase * aumentaSuperSayajin3;
                        System.out.println("Super Sayajin 3: " + poderAtual);
                        break;
                    case 5:
                        poderAtual = poderBase * aumentaSuperSayajinBlue;
                        System.out.println("Super Sayajin Blue: " + poderAtual);
                        break;
                    case 6:
                        poderAtual = poderBase * aumentaSuperSayajinDeus;
                        System.out.println("Super Sayajin Deus: " + poderAtual);
                        break;
                }
                i++;
            }
            sayajinAtual++;
        }
        System.out.println("O Sayajin mas forte é o " + nomeMaisForte + ", com Poder de Luta Base " + poderBaseMaisForte);
        System.out.println("O Sayajin mas fraco é o " + nomeMaisFraco + ", com Poder de Luta Base " + poderBaseMaisFraco);
    }
}