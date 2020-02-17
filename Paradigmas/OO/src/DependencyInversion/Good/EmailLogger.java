package DependencyInversion.Good;

/**
 * @author Rik Meijer ha.meijer@avans.nl
 */
public class EmailLogger implements Logger {

    public void setRecipient(String s) {
    }

    public void sendMessage(String the_system_has_performed_action) {
    }

    @Override
    public void logMessage(String message) {
        this.setRecipient("ha.meijer@avans.nl");
        this.sendMessage(message);
    }
}
