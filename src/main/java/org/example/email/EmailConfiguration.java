package org.example.email;

public class EmailConfiguration {
    private static final String smtpHost = "outlook.office365.com";
    private static final String sender = "java_test_d@outlook.com";
    private static final String password = "123456789Test";
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
