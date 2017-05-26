package com.pedropadilha.projetotextosmagicos;
import java.util.Scanner;
import org.apache.commons.lang.StringUtils;
public class TextosMesmoTamanho {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String leitura = s.nextLine();
        System.out.println(StringUtils.leftPad(leitura, 12, "."));
    }
}