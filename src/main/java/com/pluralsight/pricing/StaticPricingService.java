package com.pluralsight.pricing;

import com.pluralsight.model.Chips;
import com.pluralsight.model.Drink;
import com.pluralsight.model.Sandwich;

public class StaticPricingService implements PricingService {

    // We will Be using the size since the size doesn't interchange - and using Switch Cases to apply all the functions //


    @Override
    public double priceOfSize(Sandwich sandwich) {
        double price = 0.0;
        switch (sandwich.getSize()) {
            case 4 -> price = 5.50;
            case 8 -> price = 7.00;
            case 12 -> price = 8.50;
            default -> System.out.println("Invalid Sandwich Size Choice!");

        }switch (sandwich.getSize()){
            case 4 -> price += 1.00;
            case 8 -> price += 2.00;
            case 12 -> price += 3.00;

        }switch (sandwich.getSize()){
            case 4 ->{
                price += (sandwich.getExtraMeat() > 0 ? 0.50 : 0);
                price += (sandwich.getExtraCheese() > 0 ? 0.30 : 0 );
            }case 8 ->{
                price += (sandwich.getExtraMeat() > 0 ? 1.00 : 0);
                price += (sandwich.getExtraCheese() > 0 ? 0.60 : 0);
            }case 12 ->{
                price += (sandwich.getExtraMeat() > 0 ? 1.50 : 0);
                price += (sandwich.getExtraCheese() > 0 ? 0.90 : 0);
            }
        }
        return price;
    }
    @Override
    public double priceOfDrink(Drink drink){
      double price = 0.0;

      String drinkSize = drink.getSize().toLowerCase();
      switch (drinkSize){
          case "small" -> price = 2.00;
          case "medium" -> price = 2.50;
          case "large" -> price = 3.00;
          default -> System.out.println("Invalid Choice Please Select From Our Options!!");
      }
      return price;
    }

    @Override
    public double priceOfSnack(Chips chips){
        double price = 0.0;

        String snackSize = chips.getSnacks().toLowerCase();
        switch (snackSize){
            case "chips","bbq","original","sour cream","cheddar" -> price = 1.50;
            default -> System.out.println("Wrong Choice Please select the right Option ");
        }
        return price;
    }





}


