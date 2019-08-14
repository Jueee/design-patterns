package com.jueee.example01;

import java.util.Vector;

public class IDCardFactory extends Factory {
    
    private Vector<String> owners = new Vector<String>();

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        owners.add(card.getOwner());
    }

    public Vector<String> getOwners() {
        return owners;
    }
}
