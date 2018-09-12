package basics.function.example;

import java.util.function.Function;

public interface TransformFunctions {

    Function<DataFromDatabase, DataDomainObject> dataFromDatabaseToDomainObject = dataFromDatabase -> {
        // TODO: write the transform to take the dataFromDatabase input and return a new DataDomainObject
        return null;
    };
}
