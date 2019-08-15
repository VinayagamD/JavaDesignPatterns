package com.vinay.designpatterns.commandpatterns.models;

import com.vinay.designpatterns.commandpatterns.interfaces.Command;

public class KirbyUpCommand implements Command {

    private KirbyCharacterReceiver kirbyCHaracter;

    public KirbyUpCommand(KirbyCharacterReceiver kirbyCHaracter) {
        this.kirbyCHaracter = kirbyCHaracter;
    }

    @Override
    public void execute() {
        kirbyCHaracter.moveUp();
    }
}
