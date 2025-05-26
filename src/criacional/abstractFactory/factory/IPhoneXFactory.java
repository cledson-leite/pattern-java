package criacional.abstractFactory.factory;

import criacional.abstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;
import criacional.abstractFactory.model.iphone.IPhone;
import criacional.abstractFactory.model.iphone.IPhoneX;
import criacional.abstractFactory.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

  public IPhoneXFactory(CountryRulesAbstractFactory rules) {
    super(rules);
  }

  @Override
  public IPhone createIphone(String level) {
    if ("higthEnd".equals(level)) {
      return new IPhoneXSMax(rules);
    } else {
      return new IPhoneX(rules);
    }
  }

}
