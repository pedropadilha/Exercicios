package com.pedropadilha.projetoarquivotexto;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class EscritorArquivos {
    public static void main(String[] args) throws IOException {
        String s = "Fui me confessar ao mar\nO que ele disse? 'Nada'";
        File arquivo = new File("H:/poema.txt");
        FileUtils.writeStringToFile(arquivo, s);
    }
}