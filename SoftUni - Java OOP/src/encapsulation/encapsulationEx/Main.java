package encapsulation.encapsulationEx;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] pizzaData = sc.nextLine().split(" ");
        String name = pizzaData[1];
        int numberOfToppings = Integer.parseInt(pizzaData[2]);
        boolean error = false;
        Pizza pizza = null;
        try {
            pizza = new Pizza(name, numberOfToppings);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            error = true;
        }
        String[] doughData = sc.nextLine().split(" ");
        try {
            Dough dough = new Dough(doughData[1], doughData[2], Double.parseDouble(doughData[3]));
            if (pizza != null) {
                pizza.setDough(dough);
            }
        } catch (IllegalArgumentException e) {
            if (!error) {
                System.out.println(e.getMessage());
            }
            error = true;
        }

        String input = sc.nextLine();
        while (!input.equals("END")) {
            String[] toppingData = input.split(" ");
            String toppingType = toppingData[1];
            double toppingWeight = Double.parseDouble(toppingData[2]);
            try {
                Topping topping = new Topping(toppingType, toppingWeight);
                if (pizza != null) {
                    pizza.addTopping(topping);
                }
            } catch (IllegalArgumentException e) {
                if (!error) {
                    System.out.println(e.getMessage());
                }
                error = true;
            }
            input = sc.nextLine();
        }
        if (!error) {
            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
        }
    }
}
