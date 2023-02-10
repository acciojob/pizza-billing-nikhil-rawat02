package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean cheeseAlreadyAdded;
    boolean takeAwayAdded;
    boolean toppingAlreadyAdded;
    boolean billCreated;

    public Pizza(Boolean isVeg){

        this.isVeg = isVeg;
        this.cheeseAlreadyAdded = false;
        this.takeAwayAdded = false;
        this.toppingAlreadyAdded = false;
        this.billCreated =false;

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
        this.cheeseAlreadyAdded = true;
    }

    public void addExtraToppings(){
        // your code goes here
            this.toppingAlreadyAdded = true;
    }

    public void addTakeaway(){
        // your code goes here
            this.takeAwayAdded = true;
    }

    public String getBill(){
        // your code goes here
        if(!billCreated){
        this.bill = "";
        if(this.isVeg){
            this.bill += "Base Price Of The Pizza: 300 \n";
        }else
            this.bill += "Base Price Of The Pizza: 400 \n";

        if(cheeseAlreadyAdded){
            this.price += 80;
            this.bill += "Extra Cheese Added: 80 \n";
        }

        if(toppingAlreadyAdded){
            if(isVeg){
                this.price += 70;
                this.bill += "Extra Toppings Added: 70 \n";
            }else{
                this.price += 120;
                this.bill += "Extra Toppings Added: 120 \n";
            }
        }

        if(takeAwayAdded){
            this.price += 20;
            this.bill += "Paperbag Added: 20 \n";
        }

        this.billCreated =true;
            this.bill += "Total Price: " + getPrice() + "\n" ;
        return this.bill;
        }
        return "";
    }
}
