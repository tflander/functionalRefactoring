package basics.consumer.exercise;

import org.junit.Test;

import java.util.function.Consumer;

import static org.assertj.core.api.Assertions.assertThat;
import static you.Todo.showToDo;

public class MessageDispatcherConsumer {

    String lastEmailMessage;
    String lastTextMessage;
    String lastTweet;

    @Test
    public void dispatchesMessages() {
        showToDo("Create consumers for each of the three delivery methods (email, text, and tweet)");
        Consumer<String>[] foo = new Consumer[]{
                // TODO: create three consumers for email, text, and tweet
        };
        MessageDispatcher messageDispatcher = new MessageDispatcher(foo);
        messageDispatcher.dispatch("outgoing message");

        assertThat(lastEmailMessage).isEqualTo("Email: outgoing message");
        assertThat(lastTextMessage).isEqualTo("Text: outgoing message");
        assertThat(lastTweet).isEqualTo("Tweet: outgoing message");
    }
}

class MessageDispatcher {

    private final Consumer<String>[] dispatchers;

    public MessageDispatcher(Consumer<String>... dispatchers) {
        this.dispatchers = dispatchers;
    }

    public void dispatch(String outgoingMessage) {
        for (Consumer<String> dispatcher : dispatchers) {
            dispatcher.accept(outgoingMessage);
        }
    }
}
