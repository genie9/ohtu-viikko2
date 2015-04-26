package statistics;

import statistics.matcher.*;

public class Main {

    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));

        Matcher m = new And(new HasAtLeast(10, "goals"),
                new HasFewerThan(30, "assists"),
                new PlaysIn("PHI"));

        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }

        System.out.println("");

        m = new Or(new HasAtLeast(30, "goals"),
                new HasFewerThan(5, "assists"));

        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }

        System.out.println("");

        m = new Not(new PlaysIn("PHI"), new PlaysIn("ANA"), new PlaysIn("LAK"), new PlaysIn("MIN"), new PlaysIn("PIT"), new PlaysIn("CAR"));

        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }

        KyselyRakentaja kr = new KyselyRakentaja();
        m = kr.and(new HasAtLeast(30, "goals"), new HasFewerThan(5, "assists")).or(new HasAtLeast(30, "goals"), new HasFewerThan(5, "assists"));

        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }
    }

}
