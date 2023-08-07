package com.rolex.desingpatterndemo.controller;

import com.rolex.desingpatterndemo.proxy.ProxyService;
import com.rolex.desingpatterndemo.singleton.ServiceOne;
import com.rolex.desingpatterndemo.singleton.ServiceThree;
import com.rolex.desingpatterndemo.singleton.ServiceTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("dp/structural/proxy")
public class ProxyDPStructural {

    @Autowired
    ProxyService proxy;

    @GetMapping(value = "/{sitename}", produces = "application/json")
    public @ResponseBody Object get(@PathVariable String sitename){

        return proxy.connect(sitename);
   };

}
