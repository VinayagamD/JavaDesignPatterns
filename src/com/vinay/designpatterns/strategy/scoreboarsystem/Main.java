package com.vinay.designpatterns.strategy.scoreboarsystem;

import com.vinay.designpatterns.strategy.scoreboarsystem.controller.ScoreBoard;
import com.vinay.designpatterns.strategy.scoreboarsystem.model.Ballon;
import com.vinay.designpatterns.strategy.scoreboarsystem.model.Clown;
import com.vinay.designpatterns.strategy.scoreboarsystem.model.SquareBalloon;

public class Main {

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();
        System.out.println("Balloon Tap Score:");
        scoreBoard.algorithmBase = new Ballon();
        scoreBoard.showScore(10,5);

        System.out.println("Clown Tap Score");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10,5);

        System.out.println("Square Balloon tap score");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(10,5);
    }
}
