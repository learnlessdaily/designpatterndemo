package com.rolex.desingpatterndemo.controller;

import com.rolex.desingpatterndemo.factory.Notification;
import com.rolex.desingpatterndemo.factory.NotificationFactory;
import com.rolex.desingpatterndemo.factory.NotificationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("dp/creational/factory")
public class FactoryDPCreational {

    @Autowired
    NotificationFactory factory;

   @GetMapping(value = "/{type}", produces = "application/json")
    public @ResponseBody Object get(@PathVariable String type){
      Notification notify =  factory.getConnection(NotificationType.valueOf(type));
      return notify.notifyUser();
   }

}
