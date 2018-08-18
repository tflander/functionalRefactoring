package strategyComposite;

import java.util.ArrayList;
import java.util.List;

public class MaleDemocratCountVoterStrategy extends CountVoterCompositeStrategy {

    private static List<CountVoterStrategy> composites = new ArrayList<>();

    static {
        composites.add(new MaleCountVoterStrategy());
        composites.add(new DemocratCountVoterStrategy());
    }

    public MaleDemocratCountVoterStrategy() {
        super(composites);
    }
}
