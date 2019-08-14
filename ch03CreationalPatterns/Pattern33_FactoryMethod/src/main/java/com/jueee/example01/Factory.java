package com.jueee.example01;

import java.util.Vector;

public abstract class Factory {
    
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);

    public abstract Vector<String> getOwners();
}
