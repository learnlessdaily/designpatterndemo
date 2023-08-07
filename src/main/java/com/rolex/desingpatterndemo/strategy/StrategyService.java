package com.rolex.desingpatterndemo.strategy;

import com.rolex.desingpatterndemo.strategy.context.Context;
import com.rolex.desingpatterndemo.strategy.strategy.*;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class StrategyService {


    public int get(int num1, int num2){
        int choice = new Random().nextInt(3);
        int output = 0;
        switch (choice){
            case 1:
                output =  (new Context(new OperationAdd()).executeStrategy(num1,num2));
                break;
            case 2:
                output =  (new Context(new OperationMul()).executeStrategy(num1,num2));
                break;
            case 3:
                output =   (new Context(new OperationDiv()).executeStrategy(num1,num2));
                break;
            case 4:
                output =   (new Context(new OperationSub()).executeStrategy(num1,num2));
                break;

        }
        return output;
    }
}
