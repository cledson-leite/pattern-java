package criacional.builder;

import criacional.builder.model.Foods;

public class App {
  public static void main(String[] args) {
    Foods foods = Foods.builder()
        .setDrink("Cerveja")
        .setMain("Hamburguer")
        .setSide("Fries")
        .setDessert("Ice Cream")
        .setGift("Chocolate")
        .build();

    System.out.println("Drink: " + foods.getDrink());
    System.out.println("Main: " + foods.getMain());
    System.out.println("Side: " + foods.getSide());
    System.out.println("Dessert: " + foods.getDessert());
    System.out.println("Gift: " + foods.getGift());
  }
}
