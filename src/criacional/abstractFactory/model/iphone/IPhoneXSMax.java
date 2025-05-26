package criacional.abstractFactory.model.iphone;

import criacional.abstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;

public class IPhoneXSMax extends IPhone {
  public IPhoneXSMax(CountryRulesAbstractFactory rules) {
    super(rules);
  }
  @Override
  public void getHardware() {
    System.out.println("Getting hardware for IPhone XS Max");
  }

}
