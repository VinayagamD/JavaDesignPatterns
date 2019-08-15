package com.vinay.designpatterns.commandpatterns.models;

import com.vinay.designpatterns.commandpatterns.interfaces.Command;

public class KirbyLeftCommand implements Command {

    private KirbyCharacterReceiver kirbyCHaracter;

    public KirbyLeftCommand(KirbyCharacterReceiver kirbyCHaracter) {
        this.kirbyCHaracter = kirbyCHaracter;
    }

    @Override
    public void execute() {
        kirbyCHaracter.moveLeft();
    }
}
