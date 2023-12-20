package org.example;

import org.example.dbcheck.Event;
import org.example.dbcheck.EventService;
import org.example.email.EmailConfiguration;
import org.example.email.EmailPreparation;
import org.example.logmanipulator.Log1;
import org.example.logmanipulator.Log2;
import org.example.logmanipulator.LogManipulator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.mail.Message;
import javax.mail.Session;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

@Component
public class ApplicationRunner implements CommandLineRunner {
    private final EventService eventService;

    @Autowired
    public ApplicationRunner(EventService eventService) {
        this.eventService = eventService;
    }


    @Override
    public void run(String... args) throws Exception {
//        // Outlook email configuration
//        String smtpHost = "outlook.office365.com";
//        String sender = "test@outlook.com";
//        String password = "";
//
//        // Recipient's email address
//        String recipient = "denis.buserski@gmail.com";

        Properties properties = new Properties();
        properties.put("mail.store.protocol", "imaps");
        properties.put("mail.imaps.host", EmailConfiguration.getSmtpHost());
        properties.put("mail.imaps.port", EmailConfiguration.getPort());
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.starttls.required", "true");

        // Create a mail session
        Session session = Session.getDefaultInstance(properties, null);

        List<String> result;
        List<String> file;
        Message message;
        LogManipulator logManipulator;

        Scanner scanner = new Scanner(System.in);
        String task = scanner.nextLine();
        switch (task) {
            case "1":
                file = FileReader.readFile("src/main/resources/logs-1.txt");
                logManipulator = new Log1();
                result = logManipulator.manipulate(file);
                message = EmailPreparation.prepareMessage(session, result, "1");
                EmailPreparation.sendMessage(session, message);
                break;
            case "2":
                file = FileReader.readFile("src/main/resources/logs-2.txt");
                logManipulator= new Log2();
                result = logManipulator.manipulate(file);
                message = EmailPreparation.prepareMessage(session, result, "2");
                EmailPreparation.sendMessage(session, message);
                break;
            case "3":
                List<String> events = this.eventService.checkEvents();
                message = EmailPreparation.prepareMessage(session, events, "3");
                EmailPreparation.sendMessage(session, message);
                break;
            default:
                throw new FileNotFoundException("No files found!");
        }

    }
}
