package basics.function.example;

import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DataTransformerTest {

    private final DataFromDatabase dataFromDatabase = new DataFromDatabase(123L, "AcctNo", "Bob");
    private final DataDomainObject expectedDataDomainObject = new DataDomainObject(123L, "AcctNo", "Bob");

    @Test
    @Ignore
    public void verifyTransformFunction() {
//        assertThat(dataFromDatabaseToDomainObject.apply(dataFromDatabase)).isEqualToComparingFieldByField(expectedDataDomainObject);
    }
}
