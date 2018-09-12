package refactoring.strategyComposite.example;

import java.util.ArrayList;
import java.util.List;

public class FemaleRepublicanCountVoterStrategy extends CountVoterCompositeStrategy {

    private static List<CountVoterStrategy> composites = new ArrayList<>();

    static {
        composites.add(new FemaleCountVoterStrategy());
        composites.add(new RepublicanCountVoterStrategy());
    }

    public FemaleRepublicanCountVoterStrategy() {
        super(composites);
    }
}
