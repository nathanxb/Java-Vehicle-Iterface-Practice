package DefaultPackage;

public class Jet implements Aircraft{

    @Override
    public void fillsTank() {
        System.out.println("Jet initiates aerial refueling by connecting to tanker");
    }

    @Override
    public void liftoff() {
        System.out.println("The jet soars into the sky");
    }
}
