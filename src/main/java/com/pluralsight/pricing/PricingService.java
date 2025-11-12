package com.pluralsight.pricing;

import com.pluralsight.model.Chips;
import com.pluralsight.model.Drink;
import com.pluralsight.model.Sandwich;

public interface PricingService {
    double priceOfSize (Sandwich sandwich);
    double priceOfDrink(Drink drink);
    double priceOfSnack (Chips chips);
}
