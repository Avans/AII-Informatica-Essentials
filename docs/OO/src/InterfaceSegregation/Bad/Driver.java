package InterfaceSegregation.Bad;

/**
 * @author Rik Meijer ha.meijer@avans.nl
 */
public class Driver {

    public void drivePetrolCar(PetrolCar car) {
        car.accelerate();
    }
    public void driveSolarCar(SolarCar car) {
        car.accelerate();
    }

}
