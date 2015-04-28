package statistics.matcher;

import statistics.Player;

public class KyselyRakentaja {

    Matcher matcher;

    public KyselyRakentaja() {
        matcher = new Matcher() {

            @Override
            public boolean matches(Player p) {
                return true;
            }
        };
    }

    public KyselyRakentaja and(Matcher... matchers) {
        this.matcher = new And(matchers);
        return this;
    }
    
    public KyselyRakentaja or(Matcher... matchers) {
        this.matcher = new Or(matchers);
        return this;
    }

}
