# Currying

Currying seems scary until you get used to it.  It's named after Haskell Curry, so right off the bat
it sounds abstract and mysterious.

I like to think of currying as a function constructor.  Just like we can write code to construct objects,
we can write code to construct functions.

Just like an object can vary behavior based on construction parameters, a function can do the same.

When you store an attribute from a constructor argument, you bury that attribute in the object, so you
don't have to pass it to the methods.

Here, we have to pass preferences every time we call doThing(...):

```
class BeforeConstructor {

    public static void main(String[] args) {
        BeforeConstructor classUnderTest = new BeforeConstructor();
        assertThat(classUnderTest.doThing(preferences, "foo")).isEqualTo("foo=bar");
    }

    public String doThing(Map<String, String> preferences, String param) {
        return param + "=" + preferences.getOrDefault(param, "");
    }
}

```

Now, we use a constructor to bury the preferences from the consumer who calls doThing(...)

```
class AfterConstructor {

    private final Map<String, String> preferences;

    public static void main(String[] args) {
        AfterConstructor classUnderTest = new AfterConstructor(preferences);
        assertThat(classUnderTest.doThing("foo")).isEqualTo("foo=bar");
    }

    public AfterConstructor(Map<String, String> preferences) {
        this.preferences = preferences;
    }

    public String doThing(String param) {
        return param + "=" + preferences.getOrDefault(param, "");
    }
}

```

Here is the same thing with a function.  We start with a BiFunction that takes preferences and a parameter:

```
    BiFunction<Map<String, String>, String, String> uncurriedFunction = (preferences, param) ->
            param + "=" + preferences.getOrDefault(param, "");

    assertThat(uncurriedFunction.apply(preferences, "foo")).isEqualTo("foo=bar");

```

We don't want to keep passing preferences around, so we use currying to create a function that buries our
preferences, the same way we did with the object example:

```
    Function<String, String> constructCurriedFunction(Map<String, String> preferences) {
        return param -> param + "=" + preferences.getOrDefault(param, "");
    }

    Function<String, String> curriedFunction = constructCurriedFunction(preferences);
    assertThat(curriedFunction.apply("foo")).isEqualTo("foo=bar");

```

TODO: example here

