package refactoring.strategyComposite.example;

import java.util.List;

public class CountVoterCompositeStrategy implements CountVoterStrategy{

    private final List<CountVoterStrategy> composites;

    public CountVoterCompositeStrategy(List<CountVoterStrategy> composites) {

        this.composites = composites;
    }

    @Override
    public boolean shouldCount(Voter voter) {
        for(CountVoterStrategy strategy : composites) {
            if(!strategy.shouldCount(voter)) {
                return false;
            }
        }
        return true;
    }
}
