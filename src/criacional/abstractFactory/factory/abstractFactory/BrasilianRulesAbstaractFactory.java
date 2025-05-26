package criacional.abstractFactory.factory.abstractFactory;


import criacional.abstractFactory.model.certificate.BrasilianCertificate;
import criacional.abstractFactory.model.certificate.Certificate;
import criacional.abstractFactory.model.packing.BrasilianPack;
import criacional.abstractFactory.model.packing.Packing;

public class BrasilianRulesAbstaractFactory implements CountryRulesAbstractFactory {

  @Override
  public Certificate getCertificates() {
    return new BrasilianCertificate();
  }

  @Override
  public Packing getPacking() {
    return new BrasilianPack();
  }

}
