package com.pluralsight.model;

import com.pluralsight.pricing.PricingService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    // WE WIll NEED TO Have A CONSTRUCTOR//

    private ArrayList<Sandwich> sandwiches;
    private ArrayList<Drink> drinkList;
    private ArrayList<Chips> chipsList;


    public Order() {
        sandwiches = new ArrayList<>();
        drinkList = new ArrayList<>();
        chipsList = new ArrayList<>();

    }

    public ArrayList<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(ArrayList<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public ArrayList<Drink> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(ArrayList<Drink> drinkList) {
        this.drinkList = drinkList;
    }

    public ArrayList<Chips> getChipsList() {
        return chipsList;
    }

    public void setChipsList(ArrayList<Chips> chipsList) {
        this.chipsList = chipsList;
    }


    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinkList.add(drink);
    }

    public void addChips(Chips chips) {
        chipsList.add(chips);
    }

    public double calculateTotal(PricingService pricingService) {
        double total = 0.0;

        for (Sandwich sandwich : sandwiches) total += sandwich.calculatePrice(pricingService);
        for (Drink drink : drinkList) total += drink.calculatePrice(pricingService);
        for (Chips chips : chipsList) total += chips.calculatePrice(pricingService);

        return total;
    }

}
