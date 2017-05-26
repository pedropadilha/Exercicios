package com.pedropadilha.qualidadescolegas;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;
public class EscreverQualidades {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite quantos colegas você quer homenagear: ");
        int colegas = s.nextInt();
        s.nextLine();
        for (int colega = 1; colega <= colegas; colega++) {
            System.out.print("Digite o nome do colega " + colega + ": ");
            String nome = s.nextLine();
            System.out.print("Digite a principal qualidade do(a) colega " + nome + ": ");
            String qualidade = s.nextLine();
            File file = new File(nome + ".txt");
            FileUtils.writeStringToFile(file, qualidade);
        }
    }
}