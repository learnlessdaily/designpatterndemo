package com.rolex.desingpatterndemo.singleton;

import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class ServiceOne {

    public SingletonClass getSingletonClass(){
        return SingletonClass.getInstance();
    }

}
