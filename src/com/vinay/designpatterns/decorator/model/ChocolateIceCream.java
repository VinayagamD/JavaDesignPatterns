package com.vinay.designpatterns.decorator.model;

import com.vinay.designpatterns.decorator.interfaces.IceCream;
import com.vinay.designpatterns.decorator.interfaces.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Chocolate Ice-Cream");
        return 1.0+super.cost();
    }
}
