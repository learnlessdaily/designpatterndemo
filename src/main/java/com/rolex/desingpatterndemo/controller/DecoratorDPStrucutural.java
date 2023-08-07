package com.rolex.desingpatterndemo.controller;

import com.rolex.desingpatterndemo.decorator.DecoratorService;
import com.rolex.desingpatterndemo.singleton.ServiceOne;
import com.rolex.desingpatterndemo.singleton.ServiceThree;
import com.rolex.desingpatterndemo.singleton.ServiceTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("dp/structural/decorator")
public class DecoratorDPStrucutural {


   @Autowired
    DecoratorService decoratorService;


   @GetMapping(value = "/{fileName}", produces = "application/json")
    public @ResponseBody Object get(@PathVariable String fileName){
      return decoratorService.getData(fileName);
   };

    @GetMapping(value = "/decode/{fileName}", produces = "application/json")
    public @ResponseBody Object getDecodedData(@PathVariable String fileName){
        return decoratorService.decodeDate(fileName);
    };

}
