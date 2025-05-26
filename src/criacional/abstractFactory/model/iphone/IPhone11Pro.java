package criacional.abstractFactory.model.iphone;

import criacional.abstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;

public class IPhone11Pro extends IPhone {
  public IPhone11Pro(CountryRulesAbstractFactory rules) {
    super(rules);
  }
  public void getHardware() {
    System.out.println("Getting hardware for IPhone 11 Pro");
  }

}
