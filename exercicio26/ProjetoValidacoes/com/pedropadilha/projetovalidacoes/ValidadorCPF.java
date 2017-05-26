package com.pedropadilha.projetovalidacoes;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import java.util.Scanner;
public class ValidadorCPF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o CPF: ");
        String cpf = s.nextLine();
        CPFValidator validator = new CPFValidator();
        if (validator.invalidMessagesFor(cpf).isEmpty()) {
            System.out.println("CPF " + cpf + " é válido!");
        } else {
            System.out.println("CPF " + cpf + " é inválido!");
        }
        
        try {
            validator.assertValid(cpf);
            System.out.println("CPF " + cpf + " é válido!");
        } catch (InvalidStateException invalidStateException) {
            System.out.println("CPF " + cpf + " é inválido!");
        }
    }
}