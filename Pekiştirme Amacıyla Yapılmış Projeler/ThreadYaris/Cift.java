package ThreadYaris;

import java.util.ArrayList;

public class Cift extends Thread{

    public ArrayList<Integer> ikisiİcin;

    ArrayList<Integer> listemiz = new ArrayList<>();


    public Cift(ArrayList<Integer> ikisiİcin){
        this.ikisiİcin = ikisiİcin;
    }

    @Override
    public void run() {
        for (int i=0; i<ikisiİcin.size(); i++){
            if (ikisiİcin.get(i) % 2 == 0){
                listemiz.add(ikisiİcin.get(i)); //cifticin üzerinden aldığımız çift sayıları listt isimli listemizin içine ekledik
            }
        }
        print();
    }

    public void print(){
        System.out.println(listemiz.toString());
    }
}
