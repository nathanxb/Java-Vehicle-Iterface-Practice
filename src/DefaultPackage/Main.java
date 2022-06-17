package DefaultPackage;

public class Main {

    public static void main(String[] args) {
        Jet F_15 = new Jet();
        F_15.fillsTank();
        F_15.liftoff();
        F_15.turbulence();

        System.out.println("Max gallons per vehicle : " + GasVehicle.MAX_GALLONS);
    }
}
