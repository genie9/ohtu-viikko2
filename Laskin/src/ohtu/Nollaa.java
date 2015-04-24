package ohtu;

import javax.swing.JTextField;

class Nollaa implements Komento {

    Sovelluslogiikka sovellus;
    JTextField tuloskenttä;
    JTextField syotekentta;

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.syotekentta = syotekentta;
        this.tuloskenttä = tuloskentta;
    }

    @Override
    public void suorita() {
        sovellus.nollaa();
        tuloskenttä.setText("" + sovellus.tulos());
        syotekentta.setText("");
    }

    @Override
    public void peru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
