package com.vinay.designpatterns.iterator.models;

import com.vinay.designpatterns.iterator.Product;

import java.util.ArrayList;

public class GeekyStoreIterator implements  Iterator{

    ArrayList<Product> catalog;
    private int position = 0;

    public GeekyStoreIterator(ArrayList<Product> catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {
        return position < catalog.size() && catalog.get(position) != null;
    }

    @Override
    public Object next() {
        Product product = catalog.get(position);
        position++;
        return product;
    }
}
