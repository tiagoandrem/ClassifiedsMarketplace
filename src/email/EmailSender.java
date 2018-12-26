package email;

import core.Utilizador;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*; 


/**
 *
 * @author Tiago
 */
public class EmailSender {
    

   private final ArrayList<Utilizador> utilizadores;
   

    private String USER_NAME = "unnewok";  // GMail user name (just the part before "@gmail.com")
    private String PASSWORD = "piporras1"; // GMail password
   // private String RECIPIENT = utilizadores.getEmail();
   
    private String from;
    private String[] to;
    String subject = "testeeeee";
    String body = "Welcome to JavaMail!";  
   
   
   public EmailSender(ArrayList<Utilizador> utilizadores){
       this.utilizadores = utilizadores;
       from = "unnewok";
       to = new String[utilizadores.size()];
       
       for (int i = 0; i < utilizadores.size(); i++) {
           to[i] = utilizadores.get(i).getEmail();
       }
       
       
       
//       to = (String[])(emails.toArray()); // list of recipient email addresses
       
   }

    public void sendFromGMail() {
        
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", PASSWORD);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];
           
            

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, PASSWORD);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
    }
}