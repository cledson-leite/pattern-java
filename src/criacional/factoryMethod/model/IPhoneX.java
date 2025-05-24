package criacional.factoryMethod.model;

public class IPhoneX extends IPhone {
  @Override
  public void getHardware() {
    System.out.println("Getting hardware for IPhone X");
  }
}
