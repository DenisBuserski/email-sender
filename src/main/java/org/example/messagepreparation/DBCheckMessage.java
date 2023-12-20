package org.example.messagepreparation;

import org.example.email.EmailConfiguration;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.time.LocalDateTime;
import java.util.List;

public class DBCheckMessage implements MessagePreparation {
    @Override
    public Message prepareMessage(Session session, List<String> result) throws MessagingException {
        Message message = new MimeMessage(session);
        InternetAddress internetAddressSender = new InternetAddress(EmailConfiguration.getSender());
        message.setFrom(internetAddressSender);
        InternetAddress internetAddressReceiver = new InternetAddress(EmailConfiguration.getRecipient());
        message.setRecipient(Message.RecipientType.TO, internetAddressReceiver);

        String date = LocalDateTime.parse(result.get(0).split(" - ")[0]).toLocalDate().toString();
        message.setSubject("Events for " + date);

        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append("We are missing an event!").append("\n");
        messageBuilder.append("For date ").append(date).append(" we have the following events:").append("\n");
        for (String s : result) {
            messageBuilder.append(s).append("\n");
        }
        message.setText(messageBuilder.toString());
        return message;
    }
}
