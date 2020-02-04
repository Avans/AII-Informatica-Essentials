package InterfaceSegregation.Bad;

/**
 * @author Rik Meijer ha.meijer@avans.nl
 */
public class Engineer {

    public void refuelCar(PetrolCar car) {
        car.refuel();
    }

}
