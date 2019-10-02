package com.vinay.designpatterns.template;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //Template Method
    public  final void play(){
        initialize();
        startPlay();
        if(addNewGameCharacter()){
            addNewCharacterToTheGame();
        }
        endPlay();
    }

    // Hooked on Template method
    protected abstract void addNewCharacterToTheGame();

    void loadAssets(){
        System.out.println("Loading Game Assets");
    }

    boolean addNewGameCharacter(){
        return true;
    }
}
