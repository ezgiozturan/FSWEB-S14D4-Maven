package org.example.model;

public class Chocolate extends ProductForSale {
    public double cocoaRatio;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.cocoaRatio = cocoaRatio;
    }

    public double getCocoaRatio() {
        return cocoaRatio;
    }

    @Override
    public void showDetails () {
        System.out.println("Type: " +getType() + " ,Price: " + getPrice() + " ,Description: " + getDescription() + " ,Cocoa Ratio: " + getCocoaRatio() );
    }
}
