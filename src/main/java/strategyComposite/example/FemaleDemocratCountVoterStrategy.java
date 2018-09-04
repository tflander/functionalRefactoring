package strategyComposite.example;

import java.util.ArrayList;
import java.util.List;

public class FemaleDemocratCountVoterStrategy extends CountVoterCompositeStrategy {

    private static List<CountVoterStrategy> composites = new ArrayList<>();

    static {
        composites.add(new FemaleCountVoterStrategy());
        composites.add(new DemocratCountVoterStrategy());
    }

    public FemaleDemocratCountVoterStrategy() {
        super(composites);
    }
}
