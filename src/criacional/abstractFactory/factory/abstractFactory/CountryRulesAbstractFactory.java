package criacional.abstractFactory.factory.abstractFactory;


import criacional.abstractFactory.model.certificate.Certificate;
import criacional.abstractFactory.model.packing.Packing;

public interface CountryRulesAbstractFactory {
  Certificate getCertificates();
  Packing getPacking();

}
