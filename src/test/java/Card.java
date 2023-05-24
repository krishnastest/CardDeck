public class Card{

    private Suites suites;
    private Ranks ranks;


    public Card(Suites suites, Ranks ranks) {
        this.suites = suites;
        this.ranks = ranks;
    }

    @Override
    public String toString(){
        return "\n" + ranks + " of " + suites;
    }
}
