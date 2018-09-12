package refactoring.strategyComposite.example;

public class MaleCountVoterStrategy implements CountVoterStrategy
{
    @Override
    public boolean shouldCount(Voter voter) {
        return voter.sex == Voter.Sex.MALE;
    }
}
