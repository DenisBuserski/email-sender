package org.example.exceptions;

public class MessageNotFoundException extends RuntimeException {
    public MessageNotFoundException(String reason) {
        super(reason);
    }
}
