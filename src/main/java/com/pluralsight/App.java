package com.pluralsight;

import com.pluralsight.model.Drink;
import com.pluralsight.model.Sandwich;
import com.pluralsight.pricing.PricingService;
import com.pluralsight.pricing.StaticPricingService;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        PricingService ps = new StaticPricingService();

        Sandwich sizeTest1 = new Sandwich("Wheat" , 8,"chicken","Swiss"
                ,"Lettuce","Mayo",true,0.0,0);

        Drink drink = new Drink("small");

        double price = sizeTest1.calculatePrice(ps);
        double priceOfDrink = drink.calculatePrice(ps);

        System.out.println("Sandwich Price $" + "" + price);
        System.out.println("Drink Size:$" + priceOfDrink);







    }
}
