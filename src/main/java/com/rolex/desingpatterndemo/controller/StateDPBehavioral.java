package com.rolex.desingpatterndemo.controller;

import com.rolex.desingpatterndemo.state.StateService;
import com.rolex.desingpatterndemo.template.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dp/behavioral/state")
public class StateDPBehavioral {
   @Autowired
   public StateService stateService;

   @GetMapping(produces = "application/json")
    public @ResponseBody Object get(){
      return stateService.get();
   };

}
