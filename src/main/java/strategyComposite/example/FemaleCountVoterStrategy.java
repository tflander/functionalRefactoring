package strategyComposite.example;

public class FemaleCountVoterStrategy implements CountVoterStrategy
{
    @Override
    public boolean shouldCount(Voter voter) {
        return voter.sex == Voter.Sex.FEMALE;
    }
}
