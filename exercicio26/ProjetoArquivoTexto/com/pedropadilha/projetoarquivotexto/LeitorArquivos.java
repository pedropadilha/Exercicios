package com.pedropadilha.projetoarquivotexto;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class LeitorArquivos {
    public static void main(String[] args) throws IOException {
        File arquivo = new File("H:/poema.txt");
        for (String linha : FileUtils.readLines(arquivo)) {
            System.out.println(linha);
        }
    }
}