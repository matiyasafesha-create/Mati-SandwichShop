## Steps Needed to be Implemented For Mati's Sandwich Shop App. 

# Step 1 Figuring Out What the requirement is.
* A Figuring Out the packages How the Folders are structured for our classes and Folders for other supporting Instructions.
* Making sure having a hierarchy on my folder structure. 
* Understanding the methods that need to be written and the Override methods as well.

## Step 2 Classes, Interfaces, Abstract Classes List.
* Parent Class (ABSTRACT CLASS ) Holds The Price That Need to Be calculate and the Override. Which be inherited to the rest of the classes.
* Sandwich Class will declare and have all the Variables.
* Drink Class Will have Size
* Chips will have String Snacks.
* We will be Extending those two classes with the parent and Overriding the calculatePrice and toString.
* Using Constructing and Getters to Check and Get the values.


## Step 3 Overriding Values and creating folders for Pricing Interface StaticPricingService.
* Here StatingPricingService Class will handle all the pricing structure and logic this will be implemented by Pricing ServiceInterface.
* Pricing Service is saying Hey Go Implement Whatever it's going on in the StaticPricingService.
* We will be using getSize to Manage our sandwich prices and also for all the toppings.
* Doing Switch for my Drink Small , Medium , Large adjusting the price accordingly.
* Chips won't have pricing logic like drink all the Snacks will have One Pricing 1.50$.

## Step 4 Handling The data we will be Storing and our Order Class Will be Handling That.
* think of it like data storage where user adds order and this order class simply stores those selections.
* Here We will be holding what the user will be selecting calculating the total and passing over to the arraylist to hold.
* We will have setValues for our drink sandwiches and chips to getValues.

## Step 5 Our Io ReceiptWriter Class What It will consist and DO?
* This is the place where we store the data we stored in the arrays to an actual txt FIle.
* using the date and time LOCALTime.NOW() we structure the receipts names to store it according to the instruction.
* Also creating a folder Directory named receipts will handle and store all those. 
* Using For LOOP We will  be looping though the data stored and Buffered writer will write the data Structured and print us a receipt. 
* (https://github.com/matiyasafesha-create/Mati-SandwichShop/blob/main/Docs/Package-WorkFlow.jpg)