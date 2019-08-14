package com.vinay.designpatterns.decorator;

import com.vinay.designpatterns.decorator.interfaces.IceCream;
import com.vinay.designpatterns.decorator.model.BasicIceCream;
import com.vinay.designpatterns.decorator.model.MintIceCream;
import com.vinay.designpatterns.decorator.model.VanillaIceCream;

public class Main {

    public static void main(String[] args) {
        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-Cream cost $"+basicIceCream.cost());

        // Add Vanilla to the order
        IceCream vanilla = new VanillaIceCream(basicIceCream);
        System.out.println("Adding Vanilla "+ vanilla.cost());

        // Add Mint to the order
        IceCream mint = new MintIceCream(vanilla);
        System.out.println("Add Mint - cost is $"+mint.cost());
    }
}
