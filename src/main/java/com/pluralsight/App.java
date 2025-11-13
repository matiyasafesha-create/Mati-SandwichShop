package com.pluralsight;

import com.pluralsight.model.Drink;
import com.pluralsight.model.Order;
import com.pluralsight.model.Sandwich;
import com.pluralsight.pricing.PricingService;
import com.pluralsight.pricing.StaticPricingService;
import com.pluralsight.ui.SandwichBuilder;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
    homeScreen();
    }

    public static void homeScreen(){
        boolean run = true;
        while(run){

            System.out.println(" ================== Mati sandwich Shop ================ ");
            System.out.println("1 - New Order \n" +
                    "0 - Exit");
            System.out.print("Enter Your Option Here: ");
            int homeScreen = scanner.nextInt();
            switch (homeScreen){
                case 1:
                    startNewOrder();
                    break;
                case 0:
                    exit();
                    break;
                default:
                    System.out.println("Invalid Choice Option Please Try Again. ");
            }
        }
    }

    private static void startNewOrder (){
        Order order = new Order();
        SandwichBuilder.orderScreen(order);
    }


    public static void exit(){
        System.exit(0);
    }


}
