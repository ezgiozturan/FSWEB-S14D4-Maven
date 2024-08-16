package org.example.model;

public class Coke extends ProductForSale {
   public double asidRatio;

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.asidRatio = asidRatio;
    }

    public double getAsidRatio() {
        return asidRatio;
    }

    @Override
    public void showDetails () {
        System.out.println("Type: " +getType() + " ,Price: " + getPrice() + " ,Description: " + getDescription() + " ,Asid Ratio: " + getAsidRatio() );
    }
}
