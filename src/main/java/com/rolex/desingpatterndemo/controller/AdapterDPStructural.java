package com.rolex.desingpatterndemo.controller;

import com.rolex.desingpatterndemo.adapater.SwiggyService;
import com.rolex.desingpatterndemo.singleton.ServiceOne;
import com.rolex.desingpatterndemo.singleton.ServiceThree;
import com.rolex.desingpatterndemo.singleton.ServiceTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("dp/structural/adapter")
public class AdapterDPStructural {

    @Autowired
    SwiggyService swiggyService;

   @GetMapping(value = "/{type}", produces = "application/json")
    public @ResponseBody Object get(@PathVariable String type){

       return  swiggyService.getService();
   };

}
