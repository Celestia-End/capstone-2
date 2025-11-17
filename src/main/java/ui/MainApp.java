package ui;

import model.Order;
import model.Drink;
import model.GarlicKnots;
import model.Pizza;

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
            System.out.println("Would you like to order a pizza today? (yes/no)");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("What size would you like?");
                System.out.println("1) Small");
                System.out.println("2) Medium");
                System.out.println("3) Large");
                String pizzaSize = input.nextLine();

                System.out.println("What crust would you like?");
                System.out.println("1) Thin");
                System.out.println("2) Hand-Tossed");
                System.out.println("3) Deep Dish");
                String crustType = input.nextLine();

                System.out.println("Would you like stuffed crust?");
                boolean stuffedCrust = Boolean.parseBoolean(input.nextLine());

                Pizza pizza = new Pizza(pizzaSize, crustType, stuffedCrust);

                boolean addingCheese = true;

                while (addingCheese) {
                    System.out.println("What kind of cheese would you like?");
                    System.out.println("1) Mozzarella");
                    System.out.println("2) Parmesan");
                    System.out.println("3) Ricotta");
                    System.out.println("4) Goat Cheese");
                    String cheeseType = input.nextLine();

                    pizza.addCheese(cheeseType);
                }

                order.addPizza(pizza);
            }

            System.out.println("Want a drink? (yes/no)");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Enter drink flavor (Coke, Coke Zero, Sprite, Fanta): ");
                String flavor = input.nextLine();

                System.out.println("Enter drink size(Small, Medium, Large): ");
                String drinkSize = input.nextLine();

               Drink drink = new Drink(drinkSize, flavor);
               order.addDrink(drink);
            }

            System.out.println("Would you like an order of Garlic Knots? (yes/no)");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                GarlicKnots garlicKnots = new GarlicKnots();
                order.addGarlicKnots(garlicKnots);
                System.out.println("Garlic Knots have been added to your order!");
            }
        }
    }

}
