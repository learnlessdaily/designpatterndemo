package com.rolex.desingpatterndemo.controller;

import com.rolex.desingpatterndemo.singleton.ServiceOne;
import com.rolex.desingpatterndemo.singleton.ServiceThree;
import com.rolex.desingpatterndemo.singleton.ServiceTwo;
import com.rolex.desingpatterndemo.strategy.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("dp/structural/strategy")
public class StrategyDPBehavioural {


   @Autowired
   public StrategyService strategyService;

   @GetMapping(value = "/{num1}/{num2}", produces = "application/json")
    public @ResponseBody Object get(@PathVariable int num1,@PathVariable int num2 ){
      return strategyService.get(num1,num2);
   };

}
