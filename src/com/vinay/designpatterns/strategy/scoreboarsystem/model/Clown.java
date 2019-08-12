package com.vinay.designpatterns.strategy.scoreboarsystem.model;

import com.vinay.designpatterns.strategy.scoreboarsystem.controller.ScoreAlgorithmBase;

public class Clown implements ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 10;
    }
}
