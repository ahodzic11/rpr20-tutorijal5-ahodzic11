package ba.unsa.etf.rpr.predavanje02;

import java.util.ArrayList;
import java.util.HashMap;

public class Ugovor {
    private HashMap<Predmet, ArrayList<Student>> studentiPoPredmetu;

    public void Ugovor(){
        studentiPoPredmetu = new HashMap<Predmet, ArrayList<Student>>(0);
    }

    public void dodajStudente(ArrayList<Student> studenti, Predmet predmet){
        studentiPoPredmetu.put(predmet, studenti);
    }
    public void dodajStudentaNaPredmet(Student student, Predmet predmet){
        for(Predmet p : studentiPoPredmetu.keySet()){
            if(p.equals(predmet)) studentiPoPredmetu.get(p).add(student);
        }
    }
}
