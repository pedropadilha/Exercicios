package com.pedropadilha.qualidadescolegas;
import java.io.File;
import org.apache.commons.io.FileUtils;
import java.util.Scanner;
import java.io.IOException;
public class LerQualidades {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o nome do colega: ");
        String colega = s.nextLine();
        File file = new File(colega + ".txt");
        if (file.isFile()) {
            String fileString = FileUtils.readFileToString(file);
            System.out.println(fileString);
        } else {
            System.out.println("Colega não cadastrado!");
        }
    }
}