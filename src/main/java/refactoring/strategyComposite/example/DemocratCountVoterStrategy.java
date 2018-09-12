package refactoring.strategyComposite.example;

public class DemocratCountVoterStrategy implements CountVoterStrategy {

    @Override
    public boolean shouldCount(Voter voter) {
        return voter.party == Voter.Party.DEMOCRAT;
    }
}
