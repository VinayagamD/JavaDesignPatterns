package com.vinay.designpatterns.factory.model;

import com.vinay.designpatterns.factory.interfaces.HamburgerStore;

public class MozHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        if(type.equals("cheese"))
            return  new MozambinanCheeseBurger();
        else if(type.equals("veggie"))
            return new MozambinanVeggieBurger();
        else
            return null;
    }
}
