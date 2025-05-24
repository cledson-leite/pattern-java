package criacional.factoryMethod.model;

public abstract class IPhone {
  public abstract void getHardware();

  public void assemble() {
    System.out.println("Assembling IPhone");
  }

  public void certificates() {
    System.out.println("Getting certificates");
  }

  public void pack() {
    System.out.println("Packing IPhone");
  }
}
