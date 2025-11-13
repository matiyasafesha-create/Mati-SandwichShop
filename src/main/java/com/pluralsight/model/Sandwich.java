package com.pluralsight.model;

import com.pluralsight.pricing.PricingService;

public class Sandwich extends Parent {
    private String bread;
    private int size;
    private String meat;
    private String cheese;
    private String regularToppings;
    private String sauces;
    private String side;
    private boolean toasted;
    private double extraMeat;
    private double extraCheese;

//    public static final String [] BreadOptions = {"White , Wheat , Rye , Wrap"};
//    public static final int [] SizeOptions = { 4 , 6 , 12};
//    public static final String [] MeatOptions = {"Steak , Ham , Salami , Roast Beef , Chicken , Bacon"};
//    public static final String [] ToppingsOptions = {"Lettuce , Peppers , Onions , Tomatoes , Jalapenos , Cucumbers , Pickles , Guacamole , Mushrooms" };
//    public static final String [] SaucesOptions = {"Mayo , Mustard , Ketchup , Ranch , ThousandIslands , Vinaigrette "};
//    public static final String [] sideOptions ={"au jus , sauce"};


    public Sandwich(String bread, int size, String meat, String cheese, String regularToppings, String sauces, String side,
                    boolean toasted, double extraMeat, double extraCheese) {
        this.bread = bread;
        this.size = size;
        this.meat = meat;
        this.cheese = cheese;
        this.regularToppings = regularToppings;
        this.sauces = sauces;
        this.side =side;
        this.toasted = toasted;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
    }

    // Java Setters don't Validate = They Simply Store


    public int getSize() {return size;}
    public void setSize (int size) {this.size = size;}


    public double getExtraMeat() {return extraMeat;}
    public void setExtraMeat (double extraMeat) {this.extraMeat = extraMeat;}

    public double getExtraCheese() {return extraCheese;}
    public void setExtraCheese (double extraCheese) {this.extraCheese = extraCheese;}

///  It states class needs to implement its own logic to handle pricing


    @Override
    public double calculatePrice(PricingService pricingService) {
    return pricingService.priceOfSize(this);

    }

    @Override
    public String toString() {
        return "Sandwich"  +
                "\nBread Type: " + bread + "Size " + (toasted ? "Toasted:" : "" ) +
                "\nMeat Option: " + meat + " " +(extraMeat > 0 ? "Extra Meat:" : " " ) +
                "\nCheese Option:" + cheese + " " +(extraCheese > 0 ? "Extra Cheese: " : "") +
                "\nTopping Option:" + " " +regularToppings +
                "\nSauces:" + sauces;
    }
}
