package com.driver;

public class Main {
  public static void main(String[] args) {

    Pizza p = new Pizza(false);
    p.addExtraCheese();
    p.addExtraToppings();
    System.out.println(p.getBill());

    Pizza p1 = new Pizza(true);
    p1.addTakeaway();
    p1.addExtraToppings();
    System.out.println(p1.getBill());
  }
}