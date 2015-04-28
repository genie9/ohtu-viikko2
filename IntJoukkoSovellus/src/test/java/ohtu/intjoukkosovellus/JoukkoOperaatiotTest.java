package ohtu.intjoukkosovellus;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JoukkoOperaatiotTest {

    IntJoukko eka;
    IntJoukko toka;

    @Before
    public void setUp() {
        eka = teeJoukko(1, 2, 3, 4);
        toka = teeJoukko(3, 4, 5);
    }

    @Test
    public void testYhdiste() {
        IntJoukko y = IntJoukko.yhdiste(eka, toka);

        String odotettu = "{1, 2, 3, 4, 5}";

        assertEquals(odotettu, y.toString());
    }

    @Test
    public void testLeikkaus() {
        IntJoukko x = IntJoukko.leikkaus(eka, toka);

        String odotettu = "{3, 4}";

        assertEquals(odotettu, x.toString());
    }

    @Test
    public void testErotus() {
        IntJoukko e = IntJoukko.erotus(eka, toka);

        String odotettu = "{1, 2}";

        assertEquals(odotettu, e.toString());
    }

    private static IntJoukko teeJoukko(int... luvut) {
        IntJoukko joukko = new IntJoukko();

        for (int luku : luvut) {
            joukko.lisaa(luku);
        }
        return joukko;
    }
}
