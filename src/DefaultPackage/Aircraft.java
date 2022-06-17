package DefaultPackage;

public interface Aircraft extends GasVehicle {

    void liftoff();

    default void turbulence() {
        System.out.println("It's a little bumpy");
        stillTurbulent();
    }

    private void stillTurbulent() {
        System.out.println("still bumpy...");
    }
}
