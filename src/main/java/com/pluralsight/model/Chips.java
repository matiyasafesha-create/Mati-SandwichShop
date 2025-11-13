package com.pluralsight.model;

import com.pluralsight.pricing.PricingService;

public class Chips extends  Parent{
    private String snacks;

    public Chips(String snacks) {
       this.snacks =snacks;
    }

    public String getSnacks() {
        return snacks;
    }

    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }


    @Override
    public double calculatePrice(PricingService pricingService) {
        return pricingService.priceOfSnack(this);
    }

    @Override
    public String toString() {
        return "Chips Type: " + snacks;
    }
}
