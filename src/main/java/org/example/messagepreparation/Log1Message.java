package org.example.messagepreparation;

import org.example.email.EmailConfiguration;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.List;

public class Log1Message implements MessagePreparation {
    @Override
    public Message prepareMessage(Session session, List<String> result) throws MessagingException {
        Message message = new MimeMessage(session);
        InternetAddress internetAddressSender = new InternetAddress(EmailConfiguration.getSender());
        message.setFrom(internetAddressSender);
        InternetAddress internetAddressReceiver = new InternetAddress(EmailConfiguration.getRecipient());
        message.setRecipient(Message.RecipientType.TO, internetAddressReceiver);
        message.setSubject("Invalid logins");

        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append("We have found ").append(result.size()).append(" logins. Please find below the usernames that were not able to login:").append("\n");
        for (String s : result) {
            messageBuilder.append(s).append("\n");
        }
        message.setText(messageBuilder.toString());
        return message;
    }
}
