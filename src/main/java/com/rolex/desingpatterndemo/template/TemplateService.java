package com.rolex.desingpatterndemo.template;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class TemplateService {

    public String get(){
        Random ran = new Random();
        int choice = ran.nextInt(2);
        String output = "NOHTING EXECUTED";
        switch (choice){
            case 0:
                new Football().play();
                output = "Football game intialize \nFootball game started \nFootball game ended \nThanks for watching !";
                break;
            case 1:
                new Cricket().play();
                output = "Cricket game intialize \nCricket game started \nCricket game ended \nThanks for watching !";
                break;
        }

        return output;
    }
}
