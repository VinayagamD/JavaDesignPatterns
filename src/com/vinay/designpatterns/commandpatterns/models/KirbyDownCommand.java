package com.vinay.designpatterns.commandpatterns.models;

import com.vinay.designpatterns.commandpatterns.interfaces.Command;

public class KirbyDownCommand implements Command {

    private KirbyCharacterReceiver kirbyCHaracter;

    public KirbyDownCommand(KirbyCharacterReceiver kirbyCHaracter) {
        this.kirbyCHaracter = kirbyCHaracter;
    }

    @Override
    public void execute() {
        kirbyCHaracter.moveDown();
    }
}
