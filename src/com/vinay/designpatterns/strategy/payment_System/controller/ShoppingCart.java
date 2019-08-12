package com.vinay.designpatterns.strategy.payment_System.controller;

import com.vinay.designpatterns.strategy.payment_System.controller.Payment;
import com.vinay.designpatterns.strategy.payment_System.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product> productList;

    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(Product product){
        productList.remove(product);
    }

    public int calculateTotal(){
        return productList.stream().mapToInt(Product::getPrice).sum();
    }

    public void pay(Payment paymentStrategy){
        int amount = calculateTotal();
        paymentStrategy.pay(amount);

    }
}
