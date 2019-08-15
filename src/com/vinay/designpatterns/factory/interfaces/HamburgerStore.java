package com.vinay.designpatterns.factory.interfaces;

import com.vinay.designpatterns.factory.model.Hamburger;

public abstract class HamburgerStore {

    public Hamburger orderHamBurger(String type){
        Hamburger burger;

        //We now use our factory nto the if statement
        burger  = createHamburger(type);

        burger.prepare();
        burger.cook();
        burger.box();
        return burger;
    }

    public abstract Hamburger createHamburger(String type);
}
