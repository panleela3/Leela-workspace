package com.java.lambda;

public class ValueNotFound  extends RuntimeException {
    String errorMessage;
    public ValueNotFound(String message, String errorMessage) {
        super(message);
        this.errorMessage = errorMessage;
    }
}
