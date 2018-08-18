package strategy;

public class Voter {

    public enum Sex {MALE, FEMALE}
    public enum Party {DEMOCRAT, REPUBLICAN, OTHER}

    public final Sex sex;
    public final Party party;

    public Voter(Sex sex, Party party) {
        this.sex = sex;
        this.party = party;
    }

}
