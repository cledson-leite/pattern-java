package criacional.abstractFactory.model.iphone;

import criacional.abstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;

public abstract class IPhone {
  CountryRulesAbstractFactory rules;

  public IPhone(CountryRulesAbstractFactory rules) {
    this.rules = rules;
  }
  public abstract void getHardware();

  public void assemble() {
    System.out.println("Assembling IPhone");
  }

  public void certificates() {
    System.out.println("Testing All Certificates");
    System.out.println(rules.getCertificates().applyCertificate());
  }

  public void pack() {
    System.out.println("Packing the device");
    System.out.println(rules.getPacking().pack());
  }
}
