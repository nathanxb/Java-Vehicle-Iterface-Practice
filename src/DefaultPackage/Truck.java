package DefaultPackage;

public class Truck implements GasVehicle{
    @Override
    public void fillsTank() {
        System.out.println("The truck is filling up its tank with gas");
    }
}
