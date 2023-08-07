package com.rolex.desingpatterndemo.singleton;

import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class ServiceTwo {

    public SingletonClass getSingletonClass(){
        return SingletonClass.getInstance();
    }

}
