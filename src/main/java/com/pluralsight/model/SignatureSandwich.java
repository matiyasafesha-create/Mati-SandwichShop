package com.pluralsight.model;

public class SignatureSandwich extends Sandwich{

    private String name;

    public SignatureSandwich(String bread, int size, String meat, String cheese, String regularToppings,
                             String sauces, String side, boolean toasted, double extraMeat, double extraCheese, String name) {
        super(bread, size, meat, cheese, regularToppings, sauces, side, toasted, extraMeat, extraCheese);
        this.name = name;
        setSize(size);

    }

    public String getName() {
        return name;
    }


    @Override
    public String toString(){
        return "Signature Sandwich Type: " + name;
    }

}
