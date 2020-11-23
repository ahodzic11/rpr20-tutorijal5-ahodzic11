package ba.unsa.etf.rpr.predavanje02;

import java.util.ArrayList;

public class Student {
    private String imeStudenta;
    private int brojIndeksa;
    private ArrayList<Predmet> predmetiStudenta;
    public String getImeStudenta() {
        return imeStudenta;
    }

    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
}
