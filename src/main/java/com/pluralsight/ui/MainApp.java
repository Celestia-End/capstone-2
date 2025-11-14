package com.pluralsight.ui;

import com.pluralsight.model.*;
import java.util.Scanner;

public class MainApp {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        Order order = new Order();

        while (running) {
            System.out.println();
            System.out.println("Welcome to PIZZA-Licious!");
            System.out.println();
            System.out.println("Would you like to order a pizza today?");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("What size would you like? (Small/Medium/Large)");
                String size = input.nextLine();

                System.out.println("What crust would you like? (Thin/Hand-Tossed/Deep Dish)");
                String crust = input.nextLine();

                System.out.println("Would you like stuffed crust?");

                System.out.println("");

                System.out.println("");

                Pizza pizza = new Pizza(size, crust, stu);
                order.addPizza(pizza);
            }

            System.out.println("Want a drink? (yes/no)");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Enter drink flavor (Coke, Coke Zero, Sprite, Fanta): ");
                String flavor = input.nextLine();

                System.out.println("Enter drink size(Small, Medium, Large): ");
                String size = input.nextLine();

               Drink drink = new Drink(size, flavor);
               order.addDrink(drink);
            }

            System.out.println("Would you like an order of Garlic Knots? (yes/no)");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                GarlicKnots garlicKnots = new GarlicKnots();
                order.addGarlicKnots(garlicKnots);
                System.out.println("Garlic Knots have been added to your order!");
            }


            //Pizza
            //if yes, ask for size, crust type, if they want stuffed crust (if yes add stuffed crust to order), meats, cheeses, toppings, sauces
            //if no. I need it to go to drinks

            //Garlic Knots
            //if yes, add to order
            //if no, go to checkout
        }
    }

}
