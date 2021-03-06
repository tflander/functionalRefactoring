package refactoring.strategyComposite.example;

public class RepublicanCountVoterStrategy implements CountVoterStrategy {

    @Override
    public boolean shouldCount(Voter voter) {
        return voter.party == Voter.Party.REPUBLICAN;
    }
}
