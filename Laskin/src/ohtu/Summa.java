package ohtu;

import javax.swing.JTextField;

public class Summa implements Komento{
    Sovelluslogiikka sovellus;
    JTextField tuloskenttä;
    JTextField syotekentta;

    Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.syotekentta = syotekentta;
        this.tuloskenttä = tuloskentta;
    }

    @Override
    public void suorita() {
        sovellus.plus(Integer.parseInt(syotekentta.getText()));
        tuloskenttä.setText("" + sovellus.tulos());
        syotekentta.setText("");
    }

    @Override
    public void peru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
