package strategy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static strategy.VoterCounter.*;

public class VoterTest {

    private final List<Voter> voters = Arrays.asList(
            new Voter(Voter.Sex.MALE, Voter.Party.REPUBLICAN),
            new Voter(Voter.Sex.MALE, Voter.Party.DEMOCRAT),
            new Voter(Voter.Sex.MALE, Voter.Party.REPUBLICAN),
            new Voter(Voter.Sex.MALE, Voter.Party.DEMOCRAT),
            new Voter(Voter.Sex.MALE, Voter.Party.DEMOCRAT),
            new Voter(Voter.Sex.MALE, Voter.Party.DEMOCRAT),
            new Voter(Voter.Sex.MALE, Voter.Party.REPUBLICAN),
            new Voter(Voter.Sex.FEMALE, Voter.Party.DEMOCRAT),
            new Voter(Voter.Sex.FEMALE, Voter.Party.REPUBLICAN),
            new Voter(Voter.Sex.FEMALE, Voter.Party.DEMOCRAT),
            new Voter(Voter.Sex.FEMALE, Voter.Party.REPUBLICAN),
            new Voter(Voter.Sex.FEMALE, Voter.Party.REPUBLICAN),
            new Voter(Voter.Sex.FEMALE, Voter.Party.REPUBLICAN),
            new Voter(Voter.Sex.FEMALE, Voter.Party.REPUBLICAN),
            new Voter(Voter.Sex.FEMALE, Voter.Party.REPUBLICAN)
    );

    @Test
    public void voterCount() {
        assertThat(count(voters)).isEqualTo(15);
    }

    @Test
    public void males() {
        assertThat(countMales(voters)).isEqualTo(7);
    }

    @Test
    public void females() {
        assertThat(countFemales(voters)).isEqualTo(8);
    }

    @Test
    public void democrats() {
        assertThat(countDemocrats(voters)).isEqualTo(6);
    }

    @Test
    public void republicans() {
        assertThat(countRepublicans(voters)).isEqualTo(9);
    }

    @Test
    public void femaleDemocrats() {
        assertThat(countFemaleDemocrats(voters)).isEqualTo(2);
    }

    @Test
    public void maleDemocrats() {
        assertThat(countMaleDemocrats(voters)).isEqualTo(4);
    }

    @Test
    public void femaleRepublicans() {
        assertThat(countFemaleRepublicans(voters)).isEqualTo(6);
    }

    @Test
    public void maleRepublicans() {
        assertThat(countMaleRepublicans(voters)).isEqualTo(3);
    }
}
