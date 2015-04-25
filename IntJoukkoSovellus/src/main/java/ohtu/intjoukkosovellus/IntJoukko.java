package ohtu.intjoukkosovellus;

public class IntJoukko {

    public final static int KAPASITEETTI = 5, // aloitustaulukon koko
            /* luotava uusi taulukko on näin paljon isompi kuin vanha*/
                            OLETUSKASVATUS = 5;

    private int             kasvatuskoko;     // Uusi taulukko on tämän verran vanhaa suurempi.
    private int[]           lukuljono;         // Joukon luvut säilytetään taulukon alkupäässä. 
    private int             alkioidenLkm;   // Tyhjässä joukossa alkioiden_määrä on nolla. 

    public IntJoukko() {
        this.lukuljono = new int[KAPASITEETTI];
        this.alkioidenLkm = 0;
        this.kasvatuskoko = OLETUSKASVATUS;
    }

    public boolean lisaa(int luku) {
        if (!kuuluu(luku)) {
            lukuljono[alkioidenLkm] = luku;
            alkioidenLkm++;
            if (alkioidenLkm == lukuljono.length) {
                int[] taulukkoOld = lukuljono;
                lukuljono = new int[alkioidenLkm + kasvatuskoko];
                System.arraycopy(taulukkoOld, 0, lukuljono, 0, alkioidenLkm);
            }
            return true;
        }
        return false;
    }

    public boolean kuuluu(int luku) {
        for (int i = 0; i < alkioidenLkm; i++) {
            if (luku == lukuljono[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean poista(int luku) {
        for (int i = 0; i < alkioidenLkm; i++) {
            if (luku == lukuljono[i]) {
                alkioidenLkm--;
                lukuljono[i] = lukuljono[alkioidenLkm];
                lukuljono[alkioidenLkm] = 0;
                return true;
            }
        }
        return false;
    }

    public int mahtavuus() {
        return alkioidenLkm;
    }

    @Override
    public String toString() {
        if (alkioidenLkm == 0) {
            return "{}";
        } else if (alkioidenLkm == 1) {
            return "{" + lukuljono[0] + "}";
        } else {
            String tuotos = "{";
            for (int i = 0; i < alkioidenLkm - 1; i++) {
                tuotos += lukuljono[i] + ", ";
            }
            return tuotos + lukuljono[alkioidenLkm - 1] + "}";
        }
    }

    public static IntJoukko yhdiste(IntJoukko a, IntJoukko b) {
        IntJoukko y = new IntJoukko();
        for (int i = 0; i < a.alkioidenLkm; i++) {
            y.lisaa(a.lukuljono[i]);
        }
        for (int i = 0; i < b.alkioidenLkm; i++) {
            y.lisaa(b.lukuljono[i]);
        }
        return y;
    }

    public static IntJoukko leikkaus(IntJoukko a, IntJoukko b) {
        IntJoukko x = new IntJoukko();
        for (int i = 0; i < a.alkioidenLkm; i++) {
            for (int j = 0; j < b.alkioidenLkm; j++) {
                if (a.lukuljono[i] == b.lukuljono[j]) {
                    x.lisaa(b.lukuljono[j]);
                }
            }
        }
        return x;
    }

    public static IntJoukko erotus(IntJoukko a, IntJoukko b) {
        IntJoukko z = new IntJoukko();
        for (int i = 0; i < a.alkioidenLkm; i++) {
            z.lisaa(a.lukuljono[i]);
        }
        for (int i = 0; i < b.alkioidenLkm; i++) {
            z.poista(b.lukuljono[i]);
        }
        return z;
    }
}
