package org.example.messagepreparation;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import java.util.List;

public interface MessagePreparation {
    Message prepareMessage(Session session, List<String> result) throws MessagingException;
}
