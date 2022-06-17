package DefaultPackage;

public class Tesla implements ElectricVehicle{


    @Override
    public void charges() {
        System.out.println("The Tesla is charging its batteries");
    }
}
