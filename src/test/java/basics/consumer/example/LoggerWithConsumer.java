package basics.consumer.example;

import org.junit.Test;

import java.util.function.Consumer;

import static org.assertj.core.api.Assertions.assertThat;
import static you.Todo.showToDo;

public class LoggerWithConsumer {

    private String lastLoggedMessage;

    @SuppressWarnings("unused") // Hint: Maybe we should use this?
    private void messageLogger(String message) {
        lastLoggedMessage = message;
    }

    private final Logger logger = new Logger(
            message -> System.out.println("TODO: replace this lambda with the messageLogger method for this class instance")
    );

    @Test
    public void logMessage() {
        showToDo("Have the test class construct a logger that will capture the last logged message");
        logger.info("log message");
        assertThat(lastLoggedMessage).isEqualTo("log message");
    }
}

class Logger {

    private final Consumer<String> messageLogger;

    public Logger(Consumer<String> messageLogger) {
        this.messageLogger = messageLogger;
    }

    public void info(String logMessage) {
        messageLogger.accept(logMessage);
    }
}
