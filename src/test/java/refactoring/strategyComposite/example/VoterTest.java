package refactoring.strategyComposite.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static refactoring.strategyComposite.example.Voter.Party;
import static refactoring.strategyComposite.example.Voter.Sex;
import static refactoring.strategyComposite.example.VoterCounter.*;

public class VoterTest {

    private final List<Voter> voters = Arrays.asList(
            new Voter(Sex.MALE, Party.REPUBLICAN),
            new Voter(Sex.MALE, Party.DEMOCRAT),
            new Voter(Sex.MALE, Party.REPUBLICAN),
            new Voter(Sex.MALE, Party.DEMOCRAT),
            new Voter(Sex.MALE, Party.DEMOCRAT),
            new Voter(Sex.MALE, Party.DEMOCRAT),
            new Voter(Sex.MALE, Party.REPUBLICAN),
            new Voter(Sex.FEMALE, Party.DEMOCRAT),
            new Voter(Sex.FEMALE, Party.REPUBLICAN),
            new Voter(Sex.FEMALE, Party.DEMOCRAT),
            new Voter(Sex.FEMALE, Party.REPUBLICAN),
            new Voter(Sex.FEMALE, Party.REPUBLICAN),
            new Voter(Sex.FEMALE, Party.REPUBLICAN),
            new Voter(Sex.FEMALE, Party.REPUBLICAN),
            new Voter(Sex.FEMALE, Party.REPUBLICAN)
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
