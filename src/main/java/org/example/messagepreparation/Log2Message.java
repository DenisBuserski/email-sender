package org.example.messagepreparation;

import org.example.email.EmailConfiguration;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.List;

public class Log2Message implements MessagePreparation {
    @Override
    public Message prepareMessage(Session session, List<String> result) throws MessagingException {
        Message message = new MimeMessage(session);
        InternetAddress internetAddressSender = new InternetAddress(EmailConfiguration.getSender());
        message.setFrom(internetAddressSender);
        InternetAddress internetAddressReceiver = new InternetAddress(EmailConfiguration.getRecipient());
        message.setRecipient(Message.RecipientType.TO, internetAddressReceiver);
        message.setSubject("Service monitor-da did not start");

        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append("Service monitor-da did not start at: ").append("\n");
        for (String s : result) {
            messageBuilder.append(s).append("\n");
        }
        message.setText(messageBuilder.toString());
        return message;
    }
}
