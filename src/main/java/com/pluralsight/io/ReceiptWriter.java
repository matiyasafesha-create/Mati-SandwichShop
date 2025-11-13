package com.pluralsight.io;

import com.pluralsight.model.*;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.pluralsight.model.Sandwich;
import com.pluralsight.model.Order;
import com.pluralsight.pricing.PricingService;

public class ReceiptWriter {

    public void saveReceipt(Order order , PricingService pricingService){

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        String time = LocalDateTime.now().format(dateTimeFormatter);

        File file = new File(System.getProperty("user.dir"), "receipts");

        if(! file .exists()){
            file.mkdirs();
        }

        File file1 = new File(file,time + ".txt");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1))){

            bufferedWriter.write(" ================ Order Receipt ==================\n ");
            bufferedWriter.write("Date:" + time+ "\n \n");

            System.out.println("====================================================================\n");

            for(Sandwich sandwich : order.getSandwiches()){
                bufferedWriter.write(sandwich.toString() + "\n");
            }

            for(Drink drink : order.getDrinkList()){
                bufferedWriter.write(drink.toString() + "\n");
            }

            for(Chips chips : order.getChipsList()){
                bufferedWriter.write(chips.toString() + "\n");
            }

            bufferedWriter.write("\n ========================================= \n");
            bufferedWriter.write(String.format("Total: $%.2f\n" , order.calculateTotal(pricingService)));
            bufferedWriter.write("\n +++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
            bufferedWriter.flush();


        }catch (IOException exception) {
            System.out.println("Error Writing Receipt: " + exception.getMessage());
        }

    }
}
