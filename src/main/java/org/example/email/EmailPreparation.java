package org.example.email;

import org.example.exceptions.MessageNotFoundException;
import org.example.messagepreparation.DBCheckMessage;
import org.example.messagepreparation.Log1Message;
import org.example.messagepreparation.Log2Message;
import org.example.messagepreparation.MessagePreparation;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import java.util.List;

public class EmailPreparation {

    public static Message prepareMessage(Session session, List<String> result, String caseNumber) throws MessagingException {
        MessagePreparation messagePreparation;
        // Create a message
        switch (caseNumber) {
            case "1" -> {
                messagePreparation = new Log1Message();
                return messagePreparation.prepareMessage(session, result);
            }
            case "2" -> {
                messagePreparation = new Log2Message();
                return messagePreparation.prepareMessage(session, result);
            }
            case "3" -> {
                messagePreparation = new DBCheckMessage();
                return messagePreparation.prepareMessage(session, result);
            }
        }

        throw new MessageNotFoundException("No message was found!");
    }

    public static void sendMessage(Session session, Message message) throws MessagingException {
        // Connect and authenticate recipient the SMTP server
        Transport transport = session.getTransport("smtp");
        transport.connect(
                EmailConfiguration.getSmtpHost(),
                EmailConfiguration.getPort(),
                EmailConfiguration.getSender(),
                EmailConfiguration.getPassword()
        );

        // Send the email
        transport.sendMessage(message, message.getAllRecipients());

        // Close the transport
        transport.close();
        System.out.println("Email sent successfully!");
    }
}
