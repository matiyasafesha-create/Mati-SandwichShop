package com.pluralsight.ui;

import com.pluralsight.App;
import com.pluralsight.model.Order;
import com.pluralsight.model.Sandwich;

import java.util.Scanner;

public class SandwichBuilder {
    public static final Scanner scanner = new Scanner(System.in);

    ///  Order Screen

    public static void orderScreen(){
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
                addSandwichScreen(new Order());
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
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
                "<4-> wrap\n:");


        System.out.print("Enter Your Option Here:");
        int userBreadType = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Select Sandwich Size (4),(8),(12):");
        int userSizeType = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" ================================= Select Toppings ======================================= ");
        System.out.print("Select Your Meat Option\n " +
                "<-> steak\n" +
                "<-> ham\n" +
                "<-> salami\n" +
                "<-> roast beef\n" +
                "<-> chicken\n" +
                "<-> bacon\n");
        System.out.print("Enter Your Option Here:");
        String userMeatType = scanner.nextLine();

        System.out.println("Select Cheese Type\n" +
                "<-> american\n" +
                "<-> provolone\n" +
                "<-> cheddar\n" +
                "<-> swiss\n");
        System.out.print("Enter Your Option Here:");
        String userCheeseType = scanner.nextLine();

        System.out.print("Select Regular Toppings\n" +
                "<-> lettuce" +
                "<-> peppers\n" +
                "<-> onions\n" +
                "<-> tomatoes\n" +
                "<-> cucumbers\n" +
                "<-> pickles\n" +
                "<-> guacamole\n" +
                "<-> mushrooms\n");
        System.out.print("Enter Your Option Here: ");
        String userRegularToppings = scanner.nextLine();

        System.out.println("Select Sauces:\n" +
                "<-> mayo\n" +
                "<-> mustard\n" +
                "<-> ketchup\n" +
                "<-> ranch\n" +
                "<-> thousand islands\n" +
                "<-> vinaigrette\n");
        System.out.print("Enter Your Option Here: ");
        String userSaucesType = scanner.nextLine();

        System.out.println("Select Sides:\n" +
                "<-> au jus\n" +
                "<-> sauce\n");
        System.out.print("Enter Your Option Here: ");
        String userSideType = scanner.nextLine();

        System.out.println("Would you Like The Sandwich toasted? ");
        System.out.println("Enter Your Option Here Y/N");
        boolean userToast = scanner.nextLine().equalsIgnoreCase("Y");

        System.out.print("Would you like extra meat? (Y/N)");
        boolean userExtraMeat = scanner.nextLine().equalsIgnoreCase("Y");

        System.out.print("Would you like extra cheese (Y/N)?");
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







        double extraMeat = userExtraMeat ? 1.50 : 0.0;
        double extraCheese = userExtraCheese ? 0.75 : 0.0;




        Sandwich sandwich = new Sandwich(
                userBread,
                userSizeType,
                userMeatType,
                userCheeseType,
                userRegularToppings,
                userSaucesType,
                userSideType,
                userToast,
                extraMeat,
                extraCheese
                );

        order.addSandwich(sandwich);
        System.out.println(" Order Added !! ");
        SandwichBuilder.orderScreen();






















    }

}
