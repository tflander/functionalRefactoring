package refactoring.strategyComposite.example;

import java.util.List;

public interface VoterCounter {

    static int count(List<Voter> voters) {
        return voters.size();
    }

    static int countMales(List<Voter> voters) {
        return countUsingStrategy(voters, new MaleCountVoterStrategy());
    }

    static int countFemales(List<Voter> voters) {
        return countUsingStrategy(voters, new FemaleCountVoterStrategy());
    }

    static int countDemocrats(List<Voter> voters) {
        return countUsingStrategy(voters, new DemocratCountVoterStrategy());
    }

    static int countRepublicans(List<Voter> voters) {
        return countUsingStrategy(voters, new RepublicanCountVoterStrategy());
    }

    static int countFemaleDemocrats(List<Voter> voters) {
        return countUsingStrategy(voters, new FemaleDemocratCountVoterStrategy());
    }

    static int countMaleDemocrats(List<Voter> voters) {
        return countUsingStrategy(voters, new MaleDemocratCountVoterStrategy());
    }

    static int countFemaleRepublicans(List<Voter> voters) {
        return countUsingStrategy(voters, new FemaleRepublicanCountVoterStrategy());
    }

    static int countMaleRepublicans(List<Voter> voters) {
        return countUsingStrategy(voters, new MaleRepublicanCountVoterStrategy());
    }

    static int countUsingStrategy(List<Voter> voters, CountVoterStrategy countVoterStrategy) {
        return (int)voters.stream()
                .filter(countVoterStrategy::shouldCount)
                .count();
    }

}
