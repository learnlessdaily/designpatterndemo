package com.rolex.desingpatterndemo.factory;

public enum NotificationType {
    SMS("SMS"),
    EMAIL("EMAIL"),
    WHATSPP("WHATSPP");

    private final String displayValue;
    private NotificationType(String value) {
        displayValue = value;
    }
     public String getDisplayValue() {
        return displayValue;
    }
}
