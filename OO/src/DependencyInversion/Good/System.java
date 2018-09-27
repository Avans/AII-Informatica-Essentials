package DependencyInversion.Good;

/**
 * @author Rik Meijer ha.meijer@avans.nl
 */
public class System {

    public void action(Logger logger) {
        logger.logMessage("The system has performed action");
    }

}
