package avlyakulov.timur.epam.chapter_14.example.email;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MailMain {
    //отправка почтового сообщения
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/java/avlyakulov/timur/epam/chapter_14/example/email/config/mail.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(properties);
        String mailTo = "rrggo76@gmail.com";
        String title = "Java mail";
        String body = "Hello Timur don't worry it is simple java sending mail";
        MailSender sender = new MailSender(mailTo,title,body,properties);
        sender.send();
    }
}