/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.*;

/**
 *
 * @author rajesh
 */
public class Notification {
    private Session mailSession;
    private String fromEmail;
    private String subject;
    private String password;
    private String body;
    
    
    public Notification(){
        this.fromEmail="noreply.rentalrealestates@gmail.com";
        this.password="ayke gsaa ogcm llec";
    }
    
    public void sendMail(String toEmail, String subject, String emailMessage){
        System.out.println("Sending mail");
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(fromEmail, password);
            }

        });
        try{ 
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(subject);
            message.setText(emailMessage);
            Transport.send(message);
            System.out.println("email sent to : "+ toEmail);
        } catch(Exception ex){
            System.out.println(""+ex);
        }
    }
}
