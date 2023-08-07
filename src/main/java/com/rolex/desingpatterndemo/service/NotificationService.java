package com.rolex.desingpatterndemo.service;

import com.rolex.desingpatterndemo.factory.NotificationFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private NotificationFactory notificationFactory;


}
