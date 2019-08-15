package com.vinay.designpatterns.commandpatterns.models;

import com.vinay.designpatterns.commandpatterns.interfaces.Command;

public class MarioRightCommand implements Command {

    private MarioCharacterReceiver marioCharacter;

    public MarioRightCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveRight();
    }
}
