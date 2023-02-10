package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    static boolean cheeseAlreadyAdded;
    boolean takeAwayAdded;
    static boolean toppingAlreadyAdded;

    public Pizza(Boolean isVeg){

        this.isVeg = isVeg;
        cheeseAlreadyAdded = false;
        this.takeAwayAdded = false;
        toppingAlreadyAdded = false;

        if (isVeg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAlreadyAdded){

            cheeseAlreadyAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingAlreadyAdded){
            toppingAlreadyAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAwayAdded){
            takeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        bill = "";
        if(this.isVeg){
            bill += "Base Price Of The Pizza: 300 \n";
        }else
            bill += "Base Price Of The Pizza: 400 \n";
        if(cheeseAlreadyAdded){
            this.price += 80;
            bill += "Extra Cheese Added: 80 \n";
        }
        if(toppingAlreadyAdded){
            if(isVeg){
                this.price += 70;
                bill += "Extra Toppings For Veg Pizza = 70 \n";
            }else{
                this.price += 120;
                bill += "Extra Toppings For Non-veg Pizza = 120 \n";
            }
        }
        if(takeAwayAdded){
            this.price += 20;
            bill += "Paperbag Added: 20 \n";
        }
        bill += "Total Price: " + getPrice();
        return this.bill;
    }
}
