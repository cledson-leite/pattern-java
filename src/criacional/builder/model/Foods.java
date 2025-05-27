package criacional.builder.model;

import criacional.builder.Builder;

public class Foods {
  private String drink;
  private String main;
  private String side;
  private String dessert;
  private String gift;

  private Foods(String drink, String main, String side, String dessert, String gift) {
    this.drink = drink;
    this.main = main;
    this.side = side;
    this.dessert = dessert;
    this.gift = gift;
  }
  public String getDrink() {
    return drink;
  }
  public String getMain() {
    return main;
  }
  public String getSide() {
    return side;
  }
  public String getDessert() {
    return dessert;
  }
  public String getGift() {
    return gift;
  }
  public static Builder builder() {
    return new Builder();
  }

  public static Foods creator(Builder builder) {
    return new Foods(builder.drink, builder.main, builder.side, builder.dessert, builder.gift);
  }
}
