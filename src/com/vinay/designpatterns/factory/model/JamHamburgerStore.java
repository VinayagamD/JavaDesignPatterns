package com.vinay.designpatterns.factory.model;

import com.vinay.designpatterns.factory.interfaces.HamburgerStore;

public class JamHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(String type) {
        if(type.equals("cheese"))
            return  new JamaicanCheeseBurger();
        else if(type.equals("veggie"))
            return new JamaicanVeggieBurger();
        else
            return null;
    }
}
