package Uygulamalar2;

import java.util.Scanner;
public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sıcaklık derecesini giriniz : ");
        sicaklik = input.nextInt();

        if (sicaklik<5){
            System.out.println("Sıcaklık 5 dereceden düşük olduğu için kayak yapmanızı öneriyoruz.");
        }else if(sicaklik<=25){
            if (sicaklik>=15){
                System.out.println("Sıcaklık 15 ile 25 derece arasında Piknik yapmanızı öneriyoruz.");
            }
        }else if(sicaklik<=15){
            if (sicaklik>=5){
                System.out.println("Sıcaklık 5 ile 15 derece arasında Sinemaya gitmenizi öneriyoruz");
            }
        }else{
            System.out.println("Sıcaklık 25 derece üzeri yüzmeye gitmenizi öneriyoruz.");
        }

    }
}
