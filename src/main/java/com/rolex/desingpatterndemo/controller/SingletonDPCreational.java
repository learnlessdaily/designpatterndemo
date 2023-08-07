package com.rolex.desingpatterndemo.controller;

import com.rolex.desingpatterndemo.observable.observor.BBCChannel;
import com.rolex.desingpatterndemo.observable.observor.NDTVChannel;
import com.rolex.desingpatterndemo.observable.observor.TimesNowChannel;
import com.rolex.desingpatterndemo.observable.subject.NewAgencySubject;
import com.rolex.desingpatterndemo.singleton.ServiceOne;
import com.rolex.desingpatterndemo.singleton.ServiceThree;
import com.rolex.desingpatterndemo.singleton.ServiceTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("dp/creational/singleton")
public class SingletonDPCreational {


   @Autowired
   public ServiceOne one;

   @Autowired
   public ServiceTwo two;

   @Autowired
   public ServiceThree three;


   @GetMapping(value = "/{type}", produces = "application/json")
    public @ResponseBody Object get(@PathVariable String type){
      System.out.println(one.getSingletonClass());
      System.out.println(two.getSingletonClass());
      System.out.println(three.getSingletonClass());

      if(one.getSingletonClass() == two.getSingletonClass()
              && two.getSingletonClass() == three.getSingletonClass()
              && three.getSingletonClass() == one.getSingletonClass()){
         return "SINGLETON OBJECT:"+three.getSingletonClass();
      }else{
         return "NOT A SINGLETON OBEJCT";
      }
   };

}
