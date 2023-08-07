package com.rolex.desingpatterndemo.state;

import com.rolex.desingpatterndemo.state.context.Context;
import com.rolex.desingpatterndemo.state.state.StartState;
import com.rolex.desingpatterndemo.state.state.StopState;
import org.springframework.stereotype.Service;

@Service
public class StateService {
    public String get(){
        StringBuilder sb = new StringBuilder("");
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());
        sb.append(context.getState().toString()+"\n");

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
        sb.append(context.getState().toString()+"\n");

        return sb.toString();
    }

}
