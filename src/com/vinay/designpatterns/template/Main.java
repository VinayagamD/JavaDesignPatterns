package com.vinay.designpatterns.template;

public class Main {

    public static void main(String[] args) {
        Game game = new FootballGame();
        game.play();

        System.out.println("=================");

        game = new EndlessRunnerGame();
        game.play();
    }
}
