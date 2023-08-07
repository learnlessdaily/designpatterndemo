package com.rolex.desingpatterndemo.template;

public class Cricket extends GameBuilder {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started");

    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Ended, Thanks for watching");
    }
}
