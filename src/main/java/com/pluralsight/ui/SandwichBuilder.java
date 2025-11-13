package com.pluralsight.ui;

import com.pluralsight.App;
import com.pluralsight.io.ReceiptWriter;
import com.pluralsight.model.Chips;
import com.pluralsight.model.Drink;
import com.pluralsight.model.Order;
import com.pluralsight.model.Sandwich;
import com.pluralsight.pricing.PricingService;

import java.util.Scanner;

public class SandwichBuilder {
    public static final Scanner scanner = new Scanner(System.in);




    public static void orderScreen(Order order){

        System.out.println( " ======== Order Here ========= ");
                System.out.println("1 - Add Sandwich\n" +
                           "2 - Add Drinks\n" +
                           "3 - Add Chips\n" +
                           "4 - CheckOut\n" +
                           "0 - Cancel Order\n");
        System.out.print("Enter Your Option Here: ");
        int userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                addSandwichScreen(order);
                break;
            case 2:
                addDrinkScreen(order);
                break;
            case 3:
                addChipsScreen(order);
                break;
            case 4:
                checkOut(order);
                break;
            case 0:
              App.homeScreen();
                break;
        }
    }

    public static void addSandwichScreen(Order order){
        scanner.nextLine();
        System.out.println("========================== WHAT ARE YOU IN THE MOOD FOR ? ==============================");

        System.out.println("Select Your Bread Type\n" +
                "<1-> white\n" +
                "<2-> wheat\n" +
                "<3-> rye\n" +
                "<4-> wrap\n");


        System.out.print("Enter Your Option Here:");
        int userBreadType = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Select Sandwich Size (4),(8),(12):");
        int userSizeType = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" ================================= Select Toppings ======================================= ");
        System.out.print("Select Your Meat Option:\n " +
                "<1-> Steak\n" +
                "<2-> Ham\n" +
                "<3-> Salami\n" +
                "<4-> Roast beef\n" +
                "<5-> Chicken\n" +
                "<6-> Bacon\n");
        System.out.print("Enter Your Option Here:");
        int userMeatType = scanner.nextInt();

        System.out.println("=================================== Cheese Option ==========================================");
        System.out.println("Select Cheese Type\n" +
                "<1-> american\n" +
                "<2-> provolone\n" +
                "<3-> cheddar\n" +
                "<4-> swiss\n");
        System.out.print("Enter Your Option Here:");
        int userCheeseType = scanner.nextInt();


        System.out.println("=================================== Toppings Options =========================================");
        System.out.print("Select Regular Toppings\n" +
                "<1-> lettuce\n" +
                "<2-> peppers\n" +
                "<3-> onions\n" +
                "<4-> tomatoes\n" +
                "<5-> cucumbers\n" +
                "<6-> pickles\n" +
                "<7-> guacamole\n" +
                "<8-> mushrooms\n");
        System.out.print("Enter Your Option Here: ");
       int userRegularToppings = scanner.nextInt();

        System.out.println("Select Sauces:\n" +
                "<1-> Mayo\n" +
                "<2-> Mustard\n" +
                "<3-> Ketchup\n" +
                "<4-> Ranch\n" +
                "<5-> Thousand islands\n" +
                "<6-> Vinaigrette\n");
        System.out.print("Enter Your Option Here: ");
        int userSaucesType = scanner.nextInt();

        System.out.println("Select Sides:\n" +
                "<1-> Au jus\n" +
                "<2-> Sauce\n");
        System.out.print("Enter Your Option Here: ");
        int userSideType = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Would you Like The Sandwich toasted? ");
        System.out.print("Enter Your Option Here Y/N: ");
        boolean userToast = scanner.nextLine().equalsIgnoreCase("Y");

        System.out.println("Would you like extra meat?");
        System.out.print("Enter Your Option Here Y/N: ");
        boolean userExtraMeat = scanner.nextLine().equalsIgnoreCase("Y");

        System.out.println("Would you like extra cheese?");
        System.out.print("Enter Your Option Here Y/N: ");
        boolean userExtraCheese = scanner.nextLine().equalsIgnoreCase("Y");


        String userBread = switch (userBreadType){
            case 1 -> "White";
            case 2 -> "Wheat";
            case 3 -> "Rye";
            case 4 -> "Wrap";
            default -> {
                System.out.println("Invalid Option Please Try Again !");
                yield "white";
            }
        };
        String userMeat = switch (userMeatType){
            case 1 -> "Steak";
            case 2 -> "Ham";
            case 3 -> "Salami";
            case 4 -> "Roast Beef";
            case 5 -> "Chicken";
            case 6 -> "Bacon";
            default ->{
                System.out.println("Invalid Meat Option Try Again !");
                yield "Steak";
            }
        };
        String userCheese = switch (userCheeseType){
            case 1 -> "American";
            case 2 -> "Provolone";
            case 3 -> "Cheddar";
            case 4 -> "Swiss";
            default -> {
                System.out.println("Invalid Cheese Option ");
                yield "American";
            }
        };
        String userToppings = switch (userRegularToppings){
            case 1 -> "Lettuce";
            case 2 -> "Peppers";
            case 3 -> "Onions";
            case 4 -> "Tomatoes";
            case 5 -> "Cucumbers";
            case 6 -> "Pickles";
            case 7 -> "Guacamole";
            case 8 -> "Mushrooms";
            default -> {
                System.out.println("Invalid Choice Please try again");
                yield "Lettuce";
            }
        };

        String userSauce = switch (userSaucesType){
            case 1 -> "Mayo";
            case 2 -> "Mustard";
            case 3 -> "Ketchup";
            case 4 -> "Ranch";
            case 5 -> "Thousand islands";
            case 6 -> "Vinaigrette";
            default -> {
                System.out.println("Invalid Option Please try Again !");
                yield "Mayo";
            }
        };

        String userSides = switch (userSideType){
            case 1 -> "Au jus";
            case 2 -> "Sauce";
            default -> {
                System.out.println("Invalid Option !");
                yield "Au jus";
            }
        };
        double extraMeat = userExtraMeat ? 1.50 : 0.0;
        double extraCheese = userExtraCheese ? 0.75 : 0.0;


        Sandwich sandwich = new Sandwich(
                userBread,
                userSizeType,
                userMeat,
                userCheese,
                userToppings,
                userSauce,
                userSides,
                userToast,
                extraMeat,
                extraCheese
                );
        order.addSandwich(sandwich);
        System.out.println(" Order Added Please Proceed to Check out to view !! ");
        orderScreen(order);
    }

    public static void addDrinkScreen (Order order){
        System.out.println(" ================== Drink Option ================ ");
        System.out.println(
                "<1-> Small\n" +
                "<2-> Medium\n" + "<3> Large\n");


        System.out.print("Enter Your Option:");
        int userDrinkOptions = scanner.nextInt();
        scanner.nextLine();

        String userDrink = switch (userDrinkOptions){
            case 1 -> "Small";
            case 2 -> "Medium";
            case 3 -> "Large";
            default -> {
                System.out.println("Invalid Option Please try Again!");
                yield "Small";
            }
        };

        Drink drink = new Drink(userDrink);
        order.addDrink(drink);
        System.out.println("Drink Successfully Added !");
        orderScreen(order);

    }

    public static void addChipsScreen (Order order){
        System.out.println(" ================== Add Chips Section ================ ");
        System.out.println("Snack Options:\n" +
                "<1-> Classic\n" +
                "<2-> BBQ\n" +
                "<3-> Sour Cream & Onion\n" +
                "<4-> Cheddar Cheese\n" +
                "<5-> Backed Cheese\n");
        System.out.print("Enter Your Option Here: ");
        int userChipsType = scanner.nextInt();
        scanner.nextLine();


        String userChips = switch (userChipsType){
            case 1 -> "chips";
            case 2 -> "bbQ";
            case 3 -> "original";
            case 4 -> "sour cream";
            case 5 -> "lays";
            default -> {
                System.out.println("Invalid Option Try again");
                yield "classic";
            }
        };

        Chips chips = new Chips(userChips);
        order.addChips(chips);
        System.out.println("Order Added Please Go the the Check Out Menu ! ");
        orderScreen(order);

    }

    public static void checkOut(Order order){
        com.pluralsight.pricing.PricingService pricingService = new com.pluralsight.pricing.StaticPricingService();
        System.out.println(" ===================== Check Out ===============================");
        for(Sandwich s : order.getSandwiches()) System.out.println(s);
        for (Drink d : order.getDrinkList()) System.out.println(d);
        for(Chips c : order.getChipsList()) System.out.println(c);

        double total = order.calculateTotal(pricingService);
        System.out.println("Total $:" + total);

        System.out.println("Would You Like to Confirm This Order?");
        System.out.println("1 - Proceed With the Check Out and Save the Receipt\n" +
                "2 - Cancel The Order And Return to the Main Menu ");

        System.out.print("Enter Your Option Here:");
        int userCheckOut = scanner.nextInt();
        scanner.nextLine();

        switch (userCheckOut){
            case 1:
                com.pluralsight.io.ReceiptWriter writer = new com.pluralsight.io.ReceiptWriter();
                writer.saveReceipt(order,pricingService);
                System.out.println("Order Placed Receipt Saved Thank you For Your Order ");
                com.pluralsight.App.homeScreen();
                break;

            case 2:
                System.out.println("Order Canceled Returning To Home Screen");
                App.homeScreen();

            default:{
                System.out.println("Invalid Option Please try again ");
                orderScreen(order);
            }
        }
    }

}
