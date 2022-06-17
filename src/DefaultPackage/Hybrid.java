package DefaultPackage;

public class Hybrid implements ElectricVehicle,GasVehicle{
    @Override
    public void charges() {
        System.out.println("The hybrid is charging it's batteries");
    }

    @Override
    public void fillsTank() {
        System.out.println("The hybrid is filling up its gas tank");
    }

    public void replenishResources() {
        fillsTank();
        charges();
        System.out.println("Hybrid now has full battery and a full tank");
    }
}
