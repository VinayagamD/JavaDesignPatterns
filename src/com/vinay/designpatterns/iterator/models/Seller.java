package com.vinay.designpatterns.iterator.models;

import com.vinay.designpatterns.iterator.DevStoreCatalog;
import com.vinay.designpatterns.iterator.GeekyStoreCatalog;
import com.vinay.designpatterns.iterator.Product;

public class Seller {

    GeekyStoreCatalog geekyStoreCatalog;
    DevStoreCatalog devStoreCatalog;

    public Seller(GeekyStoreCatalog geekyStoreCatalog, DevStoreCatalog devStoreCatalog) {
        this.geekyStoreCatalog = geekyStoreCatalog;
        this.devStoreCatalog = devStoreCatalog;
    }

    public void printCatalog(){
        GeekyStoreIterator geekyStoreIterator = geekyStoreCatalog.createIterator();
        System.out.println("Printing Geeky Catalog: ");
        printCatalog(geekyStoreIterator);

        System.out.println("Printing Dev Catalog: ");
        DevStoreIterator devStoreIterator = devStoreCatalog.createIterator();
        printCatalog(devStoreIterator);
    }

    private void printCatalog(Iterator iterator){
        while (iterator.hasNext()){
            Product product = (Product) iterator.next();
            System.out.print(product.getName() + ", ");
            System.out.print(product.getDescription() + " -- ");
            System.out.println(product.getPrice());
        }
    }


}
