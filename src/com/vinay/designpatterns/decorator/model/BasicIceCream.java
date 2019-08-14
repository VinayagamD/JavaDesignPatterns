package com.vinay.designpatterns.decorator.model;

import com.vinay.designpatterns.decorator.interfaces.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.println("Creating a base Ice-Cream");
    }

    @Override
    public double cost() {
        return 0.50;
    }
}
