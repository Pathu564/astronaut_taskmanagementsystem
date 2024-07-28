import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Custom logger for logging application events and errors.
 */
public class CustomLogger {
    private static final Logger LOGGER = Logger.getLogger(Logger.class.getName());

    /**
     * Logs a message at the specified level.
     *
     * @param level   The logging level.
     * @param message The message to log.
     */
    public static void log(Level level, String message) {
        LOGGER.log(level, message);
    }
}
