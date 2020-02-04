package InterfaceSegregation.Good;

/**
 * @author Rik Meijer ha.meijer@avans.nl
 */
public class Engineer {

    public void refuelCar(RefuelableCar car) {
        car.refuel();
    }

}
