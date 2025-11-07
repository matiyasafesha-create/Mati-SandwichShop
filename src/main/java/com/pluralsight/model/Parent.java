package com.pluralsight.model;

import com.pluralsight.pricing.PricingService;

public abstract class Parent {

    public abstract double calculatePrice(PricingService pricingService);


    @Override
    public abstract String toString();

}
