package strategyComposite;

import java.util.ArrayList;
import java.util.List;

public class MaleRepublicanCountVoterStrategy extends CountVoterCompositeStrategy {

    private static List<CountVoterStrategy> composites = new ArrayList<>();

    static {
        composites.add(new MaleCountVoterStrategy());
        composites.add(new RepublicanCountVoterStrategy());
    }

    public MaleRepublicanCountVoterStrategy() {
        super(composites);
    }
}
