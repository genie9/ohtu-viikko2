package ohtu;

import javax.swing.JTextField;

class Nollaa implements Komento {

    Sovelluslogiikka sovellus;
    JTextField tuloskentta;
    JTextField syotekentta;

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.syotekentta = syotekentta;
        this.tuloskentta = tuloskentta;
    }

    @Override
    public void suorita() {
        sovellus.nollaa();
        tuloskentta.setText("" + sovellus.tulos());
        syotekentta.setText("");
        if (Komento.tulokset.isEmpty()) {
            Komento.tulokset.add(0);
        }
    }

    @Override
    public void peru() {
        if (!Komento.tulokset.isEmpty()) {
            int last = Komento.tulokset.size() - 1;
            tuloskentta.setText("" + Komento.tulokset.get(last));
            Komento.tulokset.remove(last);
        }
    }

    @Override
    public boolean isNotEmpty() {
        return !Komento.tulokset.isEmpty();
    }

}
