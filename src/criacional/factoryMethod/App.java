package criacional.factoryMethod;
import criacional.factoryMethod.model.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n### Ordering IPhone X ###");
        IPhone iPhoneX = IPhoneSimpleFactory.orderIPhone("X", "normal");
        System.out.println(iPhoneX);
        System.out.println("\n\n### Ordering IPhone Xs Max ###");
        IPhone iPhoneXsMax = IPhoneSimpleFactory.orderIPhone("Xs", "max");
        System.out.println(iPhoneXsMax);
    }
}
