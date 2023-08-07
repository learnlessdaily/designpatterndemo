package com.rolex.desingpatterndemo.state.context;

import com.rolex.desingpatterndemo.state.state.State;

public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
