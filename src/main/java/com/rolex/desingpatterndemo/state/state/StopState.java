package com.rolex.desingpatterndemo.state.state;

import com.rolex.desingpatterndemo.state.context.Context;

public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
