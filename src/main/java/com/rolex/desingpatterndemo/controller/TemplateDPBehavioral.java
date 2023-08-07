package com.rolex.desingpatterndemo.controller;

import com.rolex.desingpatterndemo.strategy.StrategyService;
import com.rolex.desingpatterndemo.template.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("dp/behavioral/template")
public class TemplateDPBehavioral {
   @Autowired
   public TemplateService templateService;

   @GetMapping(produces = "application/json")
    public @ResponseBody Object get(){
      return templateService.get();
   };

}
