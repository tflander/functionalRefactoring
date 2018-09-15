package basics.function.example;

import org.junit.Test;

import java.util.function.Function;

import static you.Todo.showToDo;
import static org.assertj.core.api.Assertions.assertThat;

public class DataTransformerTest {

    private final DataFromDatabase dataFromDatabase = new DataFromDatabase(123L, "AcctNo", "Bob");
    private final DataDomainObject expectedDataDomainObject = new DataDomainObject(123L, "AcctNo", "Bob");

    @Test
    public void dataFromDatabaseToDomainObject_transformsDatabaseObjectToDomainObject() {

        showToDo("TODO: implement dataFromDatabaseToDomainObject to transform the dataFromDatabase object into a new domain object that matches expectedDataDomainObject");
        Function<DataFromDatabase, DataDomainObject> dataFromDatabaseToDomainObject = dataFromDatabase -> {
            throw new IllegalStateException("Write the transform to take the dataFromDatabase input and return a new DataDomainObject");
        };

        assertThat(
                dataFromDatabaseToDomainObject.apply(dataFromDatabase))
                .isEqualToComparingFieldByField(expectedDataDomainObject);
    }
}
