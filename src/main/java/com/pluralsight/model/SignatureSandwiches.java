package com.pluralsight.model;

public class SignatureSandwiches extends Sandwich{
    private String blt ;
    private String phillyCheeseSteak;

    public SignatureSandwiches(String bread, int size, String meat, String cheese, String regularToppings,
                               String sauces, String side,
                               boolean toasted, double extraMeat,
                               double extraCheese, String blt, String phillyCheeseSteak) {
        super(bread, size, meat, cheese, regularToppings, sauces, side, toasted, extraMeat, extraCheese);
        this.blt = blt;
        this.phillyCheeseSteak = phillyCheeseSteak;

    }

    public String getBlt() {
        return blt;
    }

    public void setBlt(String blt) {
        this.blt = blt;
    }

    public String getPhillyCheeseSteak() {
        return phillyCheeseSteak;
    }

    public void setPhillyCheeseSteak(String phillyCheeseSteak) {
        this.phillyCheeseSteak = phillyCheeseSteak;
    }



}
