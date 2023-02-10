package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        this.cheeseAlreadyAdded = true;
        this.toppingAlreadyAdded = true;

    }
}
