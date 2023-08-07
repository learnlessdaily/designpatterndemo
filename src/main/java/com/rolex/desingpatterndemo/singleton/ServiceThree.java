package com.rolex.desingpatterndemo.singleton;

import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class ServiceThree {

    public SingletonClass getSingletonClass(){
        return SingletonClass.getInstance();
    }

}
