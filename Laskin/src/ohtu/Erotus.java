package ohtu;

import javax.swing.JTextField;

public class Erotus implements Komento {

    Sovelluslogiikka sovellus;
    JTextField tuloskentta;
    JTextField syotekentta;

    Erotus(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.syotekentta = syotekentta;
        this.tuloskentta = tuloskentta;
        if (Komento.tulokset.isEmpty()) {
            Komento.tulokset.add(0);
        }
    }

    @Override
    public void suorita() {
        sovellus.miinus(Integer.parseInt(syotekentta.getText()));
        tuloskentta.setText("" + sovellus.tulos());
        syotekentta.setText("");
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
