package Uygulamalar;

import java.util.Scanner;
public class TaksimetreHesaplama {
    public static void main(String[] args) {
        int acilisUcret = 10;
        double kmBasina = 2.20;
        double gidilecekKm;
        double tutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç km gideceğinizi giriniz : ");
        gidilecekKm = input.nextDouble();
        tutar = gidilecekKm*kmBasina + acilisUcret;

        //Benim tutarım 20 tlden düşük ise benim totalimin değeri 20 olsun.Değil ise tutarı direkt yazdır.
        tutar = (tutar < 20 ) ? 20 : tutar;
        System.out.println("Toplam tutar : " + tutar);
    }
}
