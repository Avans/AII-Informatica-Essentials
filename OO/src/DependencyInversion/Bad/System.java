package DependencyInversion.Bad;

/**
 * @author Rik Meijer ha.meijer@avans.nl
 */
public class System {

    public void action(EmailLogger logger) {
        logger.setRecipient("ha.meijer@avans.nl");
        logger.sendMessage("The system has performed action");
    }

}
