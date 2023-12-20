package org.example;

import org.example.email.EmailConfiguration;
import org.example.email.EmailPreparation;
import org.example.logmanipulator.Log1;
import org.example.logmanipulator.Log2;
import org.example.logmanipulator.LogManipulator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws IOException, MessagingException {
        SpringApplication.run(Application.class, args);
    }
}
