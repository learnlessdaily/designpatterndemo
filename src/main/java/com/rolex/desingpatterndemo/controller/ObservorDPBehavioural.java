package com.rolex.desingpatterndemo.controller;

import com.rolex.desingpatterndemo.factory.Notification;
import com.rolex.desingpatterndemo.factory.NotificationFactory;
import com.rolex.desingpatterndemo.factory.NotificationType;
import com.rolex.desingpatterndemo.observable.observor.BBCChannel;
import com.rolex.desingpatterndemo.observable.observor.NDTVChannel;
import com.rolex.desingpatterndemo.observable.observor.TimesNowChannel;
import com.rolex.desingpatterndemo.observable.subject.NewAgencySubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("dp/behavioural/observer")
public class ObservorDPBehavioural {



   @GetMapping(value = "/{news}", produces = "application/json")
    public @ResponseBody Object get(@PathVariable String news){
       NewAgencySubject observable = new NewAgencySubject();
       BBCChannel observer1 = new BBCChannel();
       NDTVChannel observer2 = new NDTVChannel();
       TimesNowChannel observer3 = new TimesNowChannel();

       observable.addObserver(observer1);
       observable.addObserver(observer2);
       observable.addObserver(observer3);

       observable.setNews("News 1 published");
       observable.setNews("News 2 published");

       System.out.println(observer1.getNews());
       System.out.println(observer2.getNews());
       System.out.println(observer3.getNews());

       observable.removeObserver(observer3);

       observable.setNews("News 3 published");
       observable.setNews("News 4 published");

       System.out.println("Observer 1 is removed from news");
       System.out.println(observer1.getNews());
       System.out.println(observer2.getNews());
       System.out.println(observer3.getNews());


       return observer3.getNews();
   };

}
