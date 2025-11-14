package com.pluralsight.model;

import java.util.ArrayList;

public class Order {
    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private ArrayList<Drink> drinks = new ArrayList<>();
    private ArrayList<GarlicKnots> garlicKnots = new ArrayList<>();

    public void addPizza(Pizza entree) {
        pizzas.add(entree);
    }

    public void addDrink(Drink item) {
        drinks.add(item);
    }

    public void addGarlicKnots(GarlicKnots knots) {
        garlicKnots.add(knots);
    }

    public double calculateTotal() {
        double total = 0;
        for ( Drink d : drinks) {
            total = total + d.getPrice();
        }

        for (GarlicKnots g : garlicKnots) {
            total = total + g.getPrice();
        }

        for (Pizza p : pizzas) {
            total = total + p.getPrice();
        }

        return total;
    }

}
