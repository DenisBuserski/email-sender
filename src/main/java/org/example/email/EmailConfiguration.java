package org.example.email;

public class EmailConfiguration {
    private static final String smtpHost = "outlook.office365.com";
    private static final String sender = "test@outlook.com"; // Put the sender email
    private static final String password = ""; // Put the sender password
    private static final String recipient = "denis.buserski@gmail.com";
    private static final int port = 587;


    public static String getSmtpHost() {
        return smtpHost;
    }

    public static String getSender() {
        return sender;
    }

    public static String getPassword() {
        return password;
    }

    public static String getRecipient() {
        return recipient;
    }

    public static int getPort() {
        return port;
    }

}
