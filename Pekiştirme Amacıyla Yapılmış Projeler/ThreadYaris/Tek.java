package ThreadYaris;

import java.util.ArrayList;

public class Tek extends Thread{

    public ArrayList<Integer> ikisiİcin;

    ArrayList<Integer> digerListe = new ArrayList<>();

    public Tek(ArrayList<Integer> ikisiİcin){
        this.ikisiİcin = ikisiİcin;
    }

    @Override
    public void run() {
        for (int i = 0; i< ikisiİcin.size(); i++){
            if (ikisiİcin.get(i) % 2 != 0){
                digerListe.add(ikisiİcin.get(i));
            }
        }
        print();
    }

    public void print(){
        System.out.println(digerListe.toString());
    }
}
