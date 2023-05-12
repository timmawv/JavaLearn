package avlyakulov.timur.epam.chapter_14.example.email;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailSender {
    //класс формирования и отправки почтового сообщения
    private MimeMessage message;
    private String sendToMail;
    private String mailTitle;
    private String messageText;
    private Properties properties;

    public MailSender(String sendToMail, String mailTitle, String messageText, Properties properties) {
        this.sendToMail = sendToMail;
        this.mailTitle = mailTitle;
        this.messageText = messageText;
        this.properties = properties;

    }

    public void send() {
        try {
            initMessage();
            Transport.send(message); //sending message
        } catch (AddressException e) {
            System.err.println("Invalid address: " + sendToMail + " " + e); // in log
        } catch (MessagingException e) {
            System.err.println("Error generating or sending message: " + e); // in log
        }
    }

    public void initMessage() throws MessagingException {
        //mail session object
        Session mailSession = SessionFactory.createSession(properties);
        mailSession.setDebug(true);
        message = new MimeMessage(mailSession); //create a mailing object
        //loading parameters into the mail object
        message.setContent(messageText, "text/html");
        message.setSubject(mailTitle);
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(sendToMail));
    }
}
