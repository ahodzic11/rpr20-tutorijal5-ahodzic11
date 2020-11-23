package ba.unsa.etf.rpr.predavanje02;

public class Predmet {
    private String imePredmeta;
    private int brojECTSKredita;
    private static int brojUpisanihStudenata=0;

    public Predmet(String imePredmeta, int brojKredita){
        this.imePredmeta=imePredmeta; brojECTSKredita=brojKredita;
    }

    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public int getBrojECTSKredita() {
        return brojECTSKredita;
    }

    public void setBrojECTSKredita(int brojECTSKredita) {
        this.brojECTSKredita = brojECTSKredita;
    }

    public static int getBrojUpisanihStudenata() {
        return brojUpisanihStudenata;
    }

    public static void setBrojUpisanihStudenata(int brojUpisanihStudenata) {
        Predmet.brojUpisanihStudenata = brojUpisanihStudenata;
    }
}
