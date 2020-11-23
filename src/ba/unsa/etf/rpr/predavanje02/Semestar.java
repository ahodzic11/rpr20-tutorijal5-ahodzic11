package ba.unsa.etf.rpr.predavanje02;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Semestar {
    private ArrayList<Predmet> predmeti;
    private ArrayList<Student> studenti;
    private int ukupanBrojKredita=0;
    public Semestar(){
        predmeti = new ArrayList<>(0); ukupanBrojKredita=0;
    }
    public ArrayList<Predmet> getPredmeti() {
        return predmeti;
    }

    public void dodajPredmet(Predmet p){
        predmeti.add(p); ukupanBrojKredita+=p.getBrojECTSKredita();
    }

    public ArrayList<Student> getSpisakStudenataNaPredmetu(Predmet predmet){
        ArrayList<Student> naPredmetu = new ArrayList<Student>();
        for(Student s : studenti){
         //   if(s.)
        }
        return naPredmetu;
    }

    public int getUkupanBrojKredita() {
        return ukupanBrojKredita;
    }

    public void setPredmeti(ArrayList<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public void setUkupanBrojKredita(int ukupanBrojKredita) {
        this.ukupanBrojKredita = ukupanBrojKredita;
    }
    public String toString(){
        return "U semestru imate " + predmeti.size() + " predmeta, a ukupan broj ECTS kredita iznosi " + ukupanBrojKredita + ".";
    }
}
