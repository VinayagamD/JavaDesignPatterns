package com.vinay.designpatterns.commandpatterns.models;

import com.vinay.designpatterns.commandpatterns.interfaces.Command;

public class KirbyRightCommand implements Command {

    private KirbyCharacterReceiver kirbyCHaracter;

    public KirbyRightCommand(KirbyCharacterReceiver kirbyCHaracter) {
        this.kirbyCHaracter = kirbyCHaracter;
    }

    @Override
    public void execute() {
        kirbyCHaracter.moveRight();
    }
}
