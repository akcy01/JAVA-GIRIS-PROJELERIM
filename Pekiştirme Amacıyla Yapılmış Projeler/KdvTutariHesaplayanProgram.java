package Uygulamalar;

import java.util.Scanner;
public class KdvTutariHesaplayanProgram {
    public static void main(String[] args) {
        double tutar,kdvOran=0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Para değerinizi giriniz : ");
        tutar = input.nextDouble();
        System.out.println("KDV olmayan fiyat = " + tutar);
        double kdvTutar = tutar * kdvOran;
        System.out.println("KDV tutarı = " + kdvTutar);
        double kdvFiyat = tutar + kdvTutar;
        System.out.println("KDV olan fiyat = " + kdvFiyat);

    }
}
