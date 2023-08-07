package com.rolex.desingpatterndemo.template;

public abstract class GameBuilder {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
