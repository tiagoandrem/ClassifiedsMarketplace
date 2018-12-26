
package email;

/**
 *
 * @author Tiago
 */

    
    
import core.Login;
import core.Utilizador;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class teste {
   
    
   private Login login;
   private Utilizador utilizador;
   
    
    ArrayList<Utilizador> utilizadores = new ArrayList<Utilizador>();
    
    
  
    
    private static String USER_NAME = "unnewok";  // GMail user name (just the part before "@gmail.com")
    private static String PASSWORD = "piporras1"; // GMail password
    //private static String RECIPIENT = "gamllercontroller@gmail.com";
    
     private void EmailSender(ArrayList<Utilizador> utilizadores){
     this.utilizadores = utilizadores;
       
        String from = USER_NAME;
        String pass = PASSWORD;
        String[] to = (String[])utilizadores.toArray(); // list of recipient email addresses
        String subject = "ola";
        String body = "Welcome to JavaMail!";

        sendFromGMail(from, pass, to, subject, body);
       
       
    }
       
            
        
   
    private static void sendFromGMail(String from, String pass, String[] to, String subject, String body) {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
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
            transport.connect(host, from, pass);
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


