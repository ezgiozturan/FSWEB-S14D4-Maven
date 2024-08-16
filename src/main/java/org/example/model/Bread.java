package org.example.model;

public class Bread extends ProductForSale {
    public boolean wholemeal;

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.wholemeal = true;
    }

    public boolean isWholemeal() {
        return wholemeal;
    }

    @Override
    public void showDetails () {
        System.out.println("Type: " +getType() + " ,Price: " + getPrice() + " ,Description: " + getDescription() + " ,Wholemeal" + isWholemeal());
    }
}
