package com.rolex.desingpatterndemo.factory;

import org.springframework.stereotype.Service;

@Service
public class NotificationFactory {

    public Notification getConnection(NotificationType channel)
    {

        switch (channel) {
            case SMS:
                return new SMSNotification();
            case EMAIL:
                return new EmailNotification();
            case WHATSPP:
                return new WhatAppsNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }



}
