package intermediate.currying.example;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class BeforeConstructorConstructionParameter {

    Map<String, String> preferences;

    BiFunction<Map<String, String>, String, String> uncurriedFunction = (preferences, param) ->
            param + "=" + preferences.getOrDefault(param, "");

    Function<String, String> constructCurriedFunction(Map<String, String> preferences) {
        return param -> param + "=" + preferences.getOrDefault(param, "");
    }

    @Before
    public void setUp() throws Exception {
        preferences = new HashMap<>();
        preferences.put("foo", "bar");
    }

    @Test
    public void classBeforeConstructorParameter() {
        BeforeConstructor classUnderTest = new BeforeConstructor();
        assertThat(classUnderTest.doThing(preferences, "foo")).isEqualTo("foo=bar");
    }

    @Test
    public void classAfterConstructorParameter() {
        AfterConstructor classUnderTest = new AfterConstructor(preferences);
        assertThat(classUnderTest.doThing("foo")).isEqualTo("foo=bar");
    }

    @Test
    public void functionBeforeConstructorParameter() {
        assertThat(uncurriedFunction.apply(preferences, "foo")).isEqualTo("foo=bar");
    }

    @Test
    public void functionAfterConstructorParameter() {
        Function<String, String> curriedFunction = constructCurriedFunction(preferences);
        assertThat(curriedFunction.apply("foo")).isEqualTo("foo=bar");
    }

}

class BeforeConstructor {

    public String doThing(Map<String, String> preferences, String param) {
        return param + "=" + preferences.getOrDefault(param, "");
    }
}

class AfterConstructor {

    private final Map<String, String> preferences;

    public AfterConstructor(Map<String, String> preferences) {
        this.preferences = preferences;
    }

    public String doThing(String param) {
        return param + "=" + preferences.getOrDefault(param, "");
    }
}
