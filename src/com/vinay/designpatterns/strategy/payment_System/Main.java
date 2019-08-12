package com.vinay.designpatterns.strategy.payment_System;

import com.vinay.designpatterns.strategy.payment_System.controller.CreditCardAlgorithm;
import com.vinay.designpatterns.strategy.payment_System.controller.PayPalAlgorithm;
import com.vinay.designpatterns.strategy.payment_System.controller.ShoppingCart;
import com.vinay.designpatterns.strategy.payment_System.model.Product;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234", 25);
        Product shirt = new Product("987", 15);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        //Payment Decision
        cart.pay(new PayPalAlgorithm("vinay@gmail.com", "mypassword"));
        cart.pay(new CreditCardAlgorithm("Vinayagam", "1234567890"));


    }
}
