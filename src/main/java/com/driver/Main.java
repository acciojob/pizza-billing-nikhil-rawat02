package com.driver;

public class Main {
  public static void main(String[] args) {

    Pizza p = new Pizza(true);



    System.out.println(p.getBill());
    p.addTakeaway();
    p.addExtraToppings();
  }
}