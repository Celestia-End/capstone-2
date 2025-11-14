package com.pluralsight.model;

public class Drink {
    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public double getPrice() {
        double price = 0;
        switch (size.toLowerCase()) {
            case "small" -> price = 2.00;
            case "medium" -> price = 2.50;
            case "large" -> price = 3.00;
        }
        return price;
    }

    public String getSize() {
        return this.size;
    }
}
