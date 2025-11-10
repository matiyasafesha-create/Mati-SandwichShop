package com.pluralsight.model;

import com.pluralsight.pricing.PricingService;

public class Drink extends  Parent{
    private String size;

    public Drink(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }



    @Override
    public double calculatePrice(PricingService pricingService) {
        return pricingService.priceOfDrink(this);
    }

    @Override
    public String toString() {
        return "Drink Option " + size;
    }
}
