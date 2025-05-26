package criacional.abstractFactory.model.iphone;

import criacional.abstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;

public class IPhoneX extends IPhone {
  public IPhoneX(CountryRulesAbstractFactory rules) {
    super(rules);
  }
  @Override
  public void getHardware() {
    System.out.println("Getting hardware for IPhone X");
  }
}
