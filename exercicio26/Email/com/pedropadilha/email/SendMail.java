package com.pedropadilha.email;

import java.util.Scanner;
import org.apache.commons.mail.*;

public class SendMail {

    public static void main(String[] args) throws EmailException {

        Scanner s = new Scanner(System.in);
        System.out.print("Digite o destinatário do email: ");
        String sendTo = s.nextLine();
        System.out.print("Digite o assunto do email: ");
        String assunto = s.nextLine();
        System.out.print("Digite o conteúdo do email: ");
        String texto = s.nextLine();

        System.out.print("Email: ");
        String sendFrom = s.nextLine();
        System.out.print("Digite a senha para " + sendFrom + ": ");
        String password = s.nextLine();

        Email email = new SimpleEmail();
        email.setHostName("HOST AQUI");
        email.setSSL(true);
        email.setSslSmtpPort("PORTA SMTP");
        email.setAuthenticator(new DefaultAuthenticator(sendFrom, password));
        //email.setDebug(true);
        email.setFrom(sendFrom);
        email.setSubject(assunto);
        email.setMsg(texto);
        email.addTo(sendTo);
        email.setTLS(true);
        email.send();
    }
}