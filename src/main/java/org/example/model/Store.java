package org.example;

import org.example.model.Bread;
import org.example.model.Chocolate;
import org.example.model.Coke;
import org.example.model.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[]{
                new Chocolate("Chocolate", 2.99, "Dark chocolate"),
                new Coke("Coke", 1.49, "Regular Coke"),
                new Bread("Bread", 0.99, "Whole wheat bread")
        };
        Store store = new Store();
        store.listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println();
        }

    }
}