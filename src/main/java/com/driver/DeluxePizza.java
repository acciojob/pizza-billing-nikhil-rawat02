package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        Pizza.cheeseAlreadyAdded = true;
        Pizza.toppingAlreadyAdded = true;

    }
}
