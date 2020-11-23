package ba.unsa.etf.rpr.predavanje02;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Dobrodošli na upis sljedećeg semestra");
        Semestar S = new Semestar();
        ArrayList<Predmet> obavezni= new ArrayList<Predmet>();
        ObavezniPredmet IM1 = new ObavezniPredmet("IM1", 7);
        ObavezniPredmet OE = new ObavezniPredmet("OE", 6);
        obavezni.add(IM1);
        obavezni.add(OE);
        ArrayList<Predmet> izborni = new ArrayList<Predmet>();
        IzborniPredmet SP = new IzborniPredmet("SP", 5);
        izborni.add(SP);
        PlanStudija PS = new PlanStudija(obavezni, izborni);
        Ugovor U = new Ugovor();
    }
}
