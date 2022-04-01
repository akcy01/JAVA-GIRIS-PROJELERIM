package Uygulamalar2;

import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        double Matematik, Fizik, Turkce, Kimya, Muzik;
        int gecmeNotu = 55;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen matematik notunu giriniz : ");

        Matematik = input.nextDouble();
        if (Matematik > 100 ) {
            System.out.println("Referans dışı değer girdiniz.");
        } else if (Matematik < 0){
            System.out.println("Referans dışı değer girdiniz.");
        } else{
            System.out.println("Değeriniz alınmıştır.");
        }

        System.out.println("Lütfen fizik notunuzu giriniz : ");

        Fizik = input.nextDouble();
        if (Fizik > 100 ) {
            System.out.println("Referans dışı değer girdiniz.");
        } else if (Fizik < 0){
            System.out.println("Referans dışı değer girdiniz.");
        } else{
            System.out.println("Değeriniz alınmıştır.");
        }

        System.out.println("Lütfen türkçe notunuzu giriniz.");

        Turkce = input.nextDouble();
        if (Turkce > 100 ) {
            System.out.println("Referans dışı değer girdiniz.");
        } else if (Turkce < 0){
            System.out.println("Referans dışı değer girdiniz.");
        } else{
            System.out.println("Değeriniz alınmıştır.");
        }

        System.out.println("Lütfen kimya notunuzu giriniz");

        Kimya = input.nextDouble();
        if (Kimya > 100 ) {
            System.out.println("Referans dışı değer girdiniz.");
        } else if (Kimya < 0){
            System.out.println("Referans dışı değer girdiniz.");
        } else{
            System.out.println("Değeriniz alınmıştır.");
        }

        System.out.println("Lütfen müzik notunuzu giriniz");

        Muzik = input.nextDouble();
        if (Muzik > 100 ) {
            System.out.println("Referans dışı değer girdiniz.");
        } else if (Muzik < 0){
            System.out.println("Referans dışı değer girdiniz.");
        } else{
            System.out.println("Değeriniz alınmıştır.");
        }

        double ortalama = (Turkce+Kimya+Fizik+Muzik+Matematik) / 5 ;

        if (ortalama < 55){
            System.out.println(ortalama + " 55'ten küçük olduğu için geçemediniz..");
        }else
            System.out.println("Başarılı oldunuz");

    }
}
