package criacional.builder;

import criacional.builder.model.Foods;

public class Builder {
  public String drink;
  public String main;
  public String side;
  public String dessert;
  public String gift;

  public Builder setDrink(String drink) {
    this.drink = drink;
    return this;
  }

  public Builder setMain(String main) {
    this.main = main;
    return this;
  }

  public Builder setSide(String side) {
    this.side = side;
    return this;
  }

  public Builder setDessert(String dessert) {
    this.dessert = dessert;
    return this;
  }

  public Builder setGift(String gift) {
    this.gift = gift;
    return this;
  }

  public Foods build() {
    return Foods.creator(this);
  }
}
