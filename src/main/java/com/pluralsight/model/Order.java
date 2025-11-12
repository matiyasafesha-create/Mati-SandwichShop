package com.pluralsight.model;

import com.pluralsight.pricing.PricingService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
   // WE WIll NEED TO Have A CONSTRUCTOR//

    private ArrayList<Sandwich> sandwiches;
    private  ArrayList<Drink> drinkList;
    private  ArrayList<Chips> chipsList;
    //private LocalDateTime localDateTime;


    public Order(){
        sandwiches = new ArrayList<>();
        drinkList = new ArrayList<>();
        chipsList = new ArrayList<>();
       // localDateTime = LocalDateTime.now();
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

    public void addSandwich (Sandwich sandwich) {sandwiches.add(sandwich);}
    public void addDrink(Drink drink) {drinkList.add(drink);}
    public void addChips (Chips chips) {chipsList.add(chips);}

    public double calculateTotal (PricingService pricingService){
        double total = 0.0;

        for(Sandwich sandwich : sandwiches) total += sandwich.calculatePrice(pricingService);
        for(Drink drink : drinkList) total += drink.calculatePrice(pricingService);
        for(Chips chips: chipsList) total += chips.calculatePrice(pricingService);

        return  total;
    }

//    public void displayOrder(PricingService pricingService){
//        System.out.println(" =========== Order List Summary ============== ");
//        for(Sandwich s : sandwiches){
//            System.out.println(s.toString());
//        }
//        for (Drink d : drinkList){
//            System.out.println(d.toString());
//        }
//        for (Chips c : chipsList){
//            System.out.println(c.toString());
//        }
//        System.out.println("Total $" + calculateTotal(pricingService));
//    }
}
