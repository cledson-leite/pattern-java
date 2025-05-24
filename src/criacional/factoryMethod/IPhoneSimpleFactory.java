package criacional.factoryMethod;
import criacional.factoryMethod.model.IPhone;
import criacional.factoryMethod.model.IPhone11;
import criacional.factoryMethod.model.IPhone11Pro;
import criacional.factoryMethod.model.IPhoneX;
import criacional.factoryMethod.model.IPhoneXSMax;

public class IPhoneSimpleFactory {
  public static IPhone orderIPhone(String generation, String level) {
    IPhone iPhone = null;
    if ("X".equals(generation)) {
      if ("pro".equals(level)) {
        iPhone = new IPhone11Pro();
      } else {
        iPhone = new IPhone11();
      }
    } else if ("Xs".equals(generation)) {
      if ("max".equals(level)) {
        iPhone = new IPhoneXSMax();
      } else {
        iPhone = new IPhoneX();
      }
    }
    if (iPhone != null) {
      iPhone.getHardware();
      iPhone.assemble();
      iPhone.certificates();
      iPhone.pack();
    }
    return iPhone;    
  }
}
