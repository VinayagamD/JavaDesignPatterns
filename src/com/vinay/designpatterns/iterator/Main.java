package com.vinay.designpatterns.iterator;

import com.vinay.designpatterns.iterator.models.Seller;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DevStoreCatalog devStoreCatalog = new DevStoreCatalog();
//        Product[] devCatalog = devStoreCatalog.getCatalog();

        GeekyStoreCatalog geekyStoreCatalog = new GeekyStoreCatalog();
        ArrayList<Product> geekyCatalog = geekyStoreCatalog.getCatalog();

        // loop through dev catalog array
       /* for (Product product : devCatalog) {
            System.out.print(product.getName() + " ");
            System.out.print(product.getDescription() + " ");
            System.out.println(product.getPrice());
        }

        System.out.println("------------------------------------");

        //loop through geeky catalog- ArrayList
        for (Product product: geekyCatalog) {
            System.out.print(product.getName() + " ");
            System.out.print(product.getDescription() + " ");
            System.out.println(product.getPrice());
        }*/

        Seller seller = new Seller(geekyStoreCatalog, devStoreCatalog);
        seller.printCatalog();

    }
}
