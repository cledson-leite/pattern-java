package criacional.abstractFactory;

import criacional.abstractFactory.factory.IPhone11Factory;
import criacional.abstractFactory.factory.IPhoneFactory;
import criacional.abstractFactory.factory.IPhoneXFactory;
import criacional.abstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;
import criacional.abstractFactory.factory.abstractFactory.USARulesAbstaractFactory;
import criacional.abstractFactory.model.iphone.IPhone;

public class App {
  public static void main(String[] args) {
    CountryRulesAbstractFactory rules = new USARulesAbstaractFactory();
    IPhoneFactory iphoneXFactory = new IPhoneXFactory(rules);
    IPhoneFactory iphone11Factory = new IPhone11Factory(rules);

    System.out.println("### Ordering IPhone X ###");
    IPhone iPhoneX = iphoneXFactory.orderIPhone("higthEnd");
    System.out.println(iPhoneX);
    System.out.println("\n\n### Ordering IPhone 11 ###");
    IPhone iPhone11 = iphone11Factory.orderIPhone("normal");
    System.out.println(iPhone11);
  }
}
