package criacional.abstractFactory.factory;

import criacional.abstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;
import criacional.abstractFactory.model.iphone.IPhone;

public abstract class IPhoneFactory {
  CountryRulesAbstractFactory rules;
  public IPhoneFactory(CountryRulesAbstractFactory rules) {
    this.rules = rules;
  }

  public abstract IPhone createIphone(String level);
  public IPhone orderIPhone(String level) {
    IPhone device = null;
    device = this.createIphone(level);
    device.getHardware();
    device.assemble();
    device.certificates();
    device.pack();
    return device;    
  }
}
