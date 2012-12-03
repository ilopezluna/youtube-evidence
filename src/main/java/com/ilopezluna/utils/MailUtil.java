package com.ilopezluna.utils;

import com.ilopezluna.entities.Video;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailUtil {

    private static final String HOST = "smtp.gmail.com";
    private static final String FROM = "YOUR EMAIL";
    private static final String TO = FROM;
    private static final String SUBJECT = "Validate new video";
    private static final String CONTENT_TYPE = "text/html";
    private static final String PASSWORD = "YOUR PASSWORD";

    public static void sendValidationVideoMail(String body) throws MessagingException {

        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", HOST);
        props.put("mail.smtp.user", FROM);
        props.put("mail.smtp.password", PASSWORD);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        Session mailSession = Session.getDefaultInstance(props, null);
        // mailSession.setDebug(true);
        MimeMessage message = new MimeMessage(mailSession);
        message.setSubject(SUBJECT);
        message.setFrom(new InternetAddress(FROM));
        message.setContent(body, CONTENT_TYPE);
        InternetAddress toAddress = new InternetAddress(TO);
        message.addRecipient(Message.RecipientType.TO, toAddress);
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(HOST, FROM, PASSWORD);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }

}
