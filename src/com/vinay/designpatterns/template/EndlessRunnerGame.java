package com.vinay.designpatterns.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class EndlessRunnerGame extends Game {
    @Override
    void initialize() {
        System.out.println("Endless Runner Initializing...");
    }

    @Override
    void startPlay() {
        System.out.println("Endless Runner Starting...");
        playerWantsNewCharacter();
    }

    @Override
    void endPlay() {
        System.out.println("Endless Runner Ending...");
    }

    @Override
    protected void addNewCharacterToTheGame() {
        System.out.println("Adding new character to the game");
    }

    public boolean playerWantsNewCharacter(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else {
            return false;
        }
    }


    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like to add a new character to the game ? (y/n)? ");
        try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            answer = in.readLine();
        }catch (IOException exception){
            System.out.println("IO Error");
        }

        if(answer == null){
            return "no";
        }

        return answer;
    }

//    Add more methods
}
