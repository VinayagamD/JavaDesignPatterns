package com.vinay.designpatterns.factory.model;

public class JamaicanVeggieBurger extends Hamburger {

    public JamaicanVeggieBurger() {
        name = "Jamaican Style Veggie Burger";
        sauce = "Spicy Jamaican sauce";
        buns = "Cookie dough buns!";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Jamaican style...");
    }
}
