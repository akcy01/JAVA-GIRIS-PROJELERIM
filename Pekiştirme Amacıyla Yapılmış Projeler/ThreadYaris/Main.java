package ThreadYaris;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>(10000);

        ArrayList<Integer> liste1 = new ArrayList<>(2500);
        ArrayList<Integer> liste2 = new ArrayList<>(2500);
        ArrayList<Integer> liste3 = new ArrayList<>(2500);
        ArrayList<Integer> liste4 = new ArrayList<>(2500);

        for (int i = 0; i<10000; i++){
            liste.add(i);
        }

        liste1.addAll(liste.subList(0,2500));
        liste2.addAll(liste.subList(2500,5000));
        liste3.addAll(liste.subList(5000,7500));
        liste4.addAll(liste.subList(7500,10000));

        Tek t1 = new Tek(liste1);
        Thread o1 = new Thread(t1);
        o1.start();

        Cift c1 = new Cift(liste1);
        Thread g1 = new Thread(c1);
        g1.start();

    }

}
