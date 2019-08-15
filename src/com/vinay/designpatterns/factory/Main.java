package com.vinay.designpatterns.factory;

import com.vinay.designpatterns.factory.interfaces.HamburgerStore;
import com.vinay.designpatterns.factory.model.Hamburger;
import com.vinay.designpatterns.factory.model.JamHamburgerStore;
import com.vinay.designpatterns.factory.model.MozHamburgerStore;

public class Main {

    public static void main(String[] args) {
        HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
        HamburgerStore jamaicanBurgerStore = new JamHamburgerStore();

        Hamburger hamburger = mozambicanBurgerStore.orderHamBurger("cheese");
        System.out.println("Paulo ordered "+hamburger.getName()+"\n");

        hamburger = jamaicanBurgerStore.orderHamBurger("veggie");
        System.out.println("James Bond ordered : "+hamburger.getName()+"\n");
    }
}
