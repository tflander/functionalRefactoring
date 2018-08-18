package strategy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class VoterTest {

    private final List<Voter> voters = Arrays.asList(
            new Voter(Voter.Sex.MALE, Voter.Party.REPUBLICAN),
            new Voter(Voter.Sex.MALE, Voter.Party.DEMOCRAT),
            new Voter(Voter.Sex.MALE, Voter.Party.REPUBLICAN),
            new Voter(Voter.Sex.FEMALE, Voter.Party.DEMOCRAT),
            new Voter(Voter.Sex.FEMALE, Voter.Party.REPUBLICAN),
            new Voter(Voter.Sex.FEMALE, Voter.Party.DEMOCRAT),
            new Voter(Voter.Sex.FEMALE, Voter.Party.REPUBLICAN)
    );

    @Test
    public void countVoters() {
        assertThat(VoterCounter.count(voters)).isEqualTo(7);
    }

    @Test
    public void countMales() {
        assertThat(VoterCounter.countMales(voters)).isEqualTo(3);
    }

    @Test
    public void countFemales() {
        assertThat(VoterCounter.countFemales(voters)).isEqualTo(4);
    }

    @Test
    public void countDemocrats() {
        assertThat(VoterCounter.countDemocrats(voters)).isEqualTo(3);
    }

    @Test
    public void countRepublicans() {
        assertThat(VoterCounter.countRepublicans(voters)).isEqualTo(4);
    }

    @Test
    public void countFemaleDemocrats() {
        assertThat(VoterCounter.countFemaleDemocrats(voters)).isEqualTo(2);
    }

    @Test
    public void countMaleDemocrats() {
        assertThat(VoterCounter.countMaleDemocrats(voters)).isEqualTo(1);
    }

    @Test
    public void countFemaleRepublicans() {
        assertThat(VoterCounter.countFemaleRepublicans(voters)).isEqualTo(2);
    }

    @Test
    public void countMaleRepublicans() {
        assertThat(VoterCounter.countMaleRepublicans(voters)).isEqualTo(2);
    }
}
