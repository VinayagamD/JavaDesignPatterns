package com.vinay.designpatterns.template;

public class FootballGame extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initializing...");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Starting...");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Ending...");
    }

    @Override
    protected void addNewCharacterToTheGame() {
        System.out.println("Adding new Character");
    }
}
