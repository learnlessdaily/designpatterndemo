package com.rolex.desingpatterndemo.template;

public class Football extends GameBuilder {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started");

    }

    @Override
    void endPlay() {
        System.out.println("Football Game Ended, Thanks for watching");
    }
}
