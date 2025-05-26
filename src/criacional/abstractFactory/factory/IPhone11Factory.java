package criacional.abstractFactory.factory;

import criacional.abstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;
import criacional.abstractFactory.model.iphone.IPhone;
import criacional.abstractFactory.model.iphone.IPhone11;
import criacional.abstractFactory.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory{
  public IPhone11Factory(CountryRulesAbstractFactory rules) {
    super(rules);
  }
  @Override
  public IPhone createIphone(String level) {
    if("pro".equals(level)) {
      return new IPhone11Pro(rules);
    } else {
      return new IPhone11(rules);
    }
  }

}
