package com.rolex.desingpatterndemo.controller;

import com.rolex.desingpatterndemo.command.client.CommandService;
import com.rolex.desingpatterndemo.strategy.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("dp/behavioral/command")
public class CommandDPBehavioral {


   @Autowired
   public CommandService commandService;

   @GetMapping(produces = "application/json")
    public @ResponseBody Object get(){
      return "List of Command Operations Done:"+ commandService.get();
   };

}
