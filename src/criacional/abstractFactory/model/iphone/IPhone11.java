package criacional.abstractFactory.model.iphone;

import criacional.abstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;

public class IPhone11 extends IPhone {
  public IPhone11(CountryRulesAbstractFactory rules) {
    super(rules);
  }
  @Override
  public void getHardware() {
    System.out.println("Getting hardware for IPhone 11");
  }

}
