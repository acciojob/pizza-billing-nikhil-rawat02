package com.driver;

public class Main {
  public static void main(String[] args) {
    Pizza dp1 = new Pizza(false);
    dp1.addExtraToppings();
    dp1.addExtraCheese();
    dp1.addExtraCheese();

    System.out.println(dp1.getBill());
    Pizza dp2 = new Pizza(true);
    dp2.addExtraToppings();
    dp2.addExtraCheese();
    System.out.println(dp2.getBill());
    DeluxePizza dp3 = new DeluxePizza(false);
    dp3.addTakeaway();
    System.out.println(dp3.getBill());
    DeluxePizza dp4 = new DeluxePizza(false);
    System.out.println(dp4.getBill());
    DeluxePizza dp5 = new DeluxePizza(true);
    System.out.println(dp5.getBill());

    Pizza p = new Pizza(false);
    p.addExtraCheese();
    p.addExtraToppings();
    System.out.println(p.getBill());
  }
}