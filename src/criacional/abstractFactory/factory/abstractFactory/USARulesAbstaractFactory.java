package criacional.abstractFactory.factory.abstractFactory;

import criacional.abstractFactory.model.certificate.Certificate;
import criacional.abstractFactory.model.certificate.USACertificate;
import criacional.abstractFactory.model.packing.Packing;
import criacional.abstractFactory.model.packing.USAPack;

public class USARulesAbstaractFactory implements CountryRulesAbstractFactory {

  @Override
  public Certificate getCertificates() {
    return new USACertificate();
  }

  @Override
  public Packing getPacking() {
    return new USAPack();
  }

}
