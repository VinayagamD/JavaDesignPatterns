package com.vinay.designpatterns.iterator.models;

import com.vinay.designpatterns.iterator.Product;

import java.util.ArrayList;

public class DevStoreIterator implements Iterator {

    Product[] catalog;
    private int position = 0;

    public DevStoreIterator(Product[] catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {
        return position < catalog.length && catalog[position] != null;
    }

    @Override
    public Object next() {
        Product product = catalog[position];
        position++;
        return product;
    }
}
