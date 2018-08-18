package strategy;

import java.util.List;

public interface VoterCounter {

    static int count(List<Voter> voters) {
        return (int)voters.stream()
                .count();
    }

    static int countMales(List<Voter> voters) {
        return (int)voters.stream()
                .filter(voter -> voter.sex == Voter.Sex.MALE)
                .count();
    }

    static int countFemales(List<Voter> voters) {
        return (int)voters.stream()
                .filter(voter -> voter.sex == Voter.Sex.FEMALE)
                .count();
    }

    static int countDemocrats(List<Voter> voters) {
        return (int)voters.stream()
                .filter(voter -> voter.party == Voter.Party.DEMOCRAT)
                .count();
    }

    static int countRepublicans(List<Voter> voters) {
        return (int)voters.stream()
                .filter(voter -> voter.party == Voter.Party.REPUBLICAN)
                .count();
    }

    static int countFemaleDemocrats(List<Voter> voters) {
        return (int)voters.stream()
                .filter(voter -> voter.sex == Voter.Sex.FEMALE && voter.party == Voter.Party.DEMOCRAT)
                .count();
    }

    static int countMaleDemocrats(List<Voter> voters) {
        return (int)voters.stream()
                .filter(voter -> voter.sex == Voter.Sex.MALE && voter.party == Voter.Party.DEMOCRAT)
                .count();
    }

    static int countFemaleRepublicans(List<Voter> voters) {
        return (int)voters.stream()
                .filter(voter -> voter.sex == Voter.Sex.FEMALE && voter.party == Voter.Party.REPUBLICAN)
                .count();
    }

    static int countMaleRepublicans(List<Voter> voters) {
        return (int)voters.stream()
                .filter(voter -> voter.sex == Voter.Sex.FEMALE && voter.party == Voter.Party.REPUBLICAN)
                .count();
    }
}
