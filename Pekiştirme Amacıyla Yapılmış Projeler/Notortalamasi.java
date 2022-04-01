package Uygulamalar;

import java.util.Scanner;
public class Notortalamasi {
    public static void main(String[] args) {
        //Değişkenlerimizi Oluşturalım
        int matematik,fizik,kimya,turkce,tarih,muzik;

        Scanner input = new Scanner(System.in);

        //Kullanıcımızdan verileri alalım
        System.out.println("Matematik notunuzu giriniz : ");
        matematik = input.nextInt();
        System.out.println("Fizik Notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.println("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        System.out.println("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();
        System.out.println("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();
        int notToplami = matematik + fizik + kimya + turkce + tarih + muzik;
        double notOrtalamasi = notToplami/6;
        System.out.println("Not ortalamanız = " + notOrtalamasi);
    }
}
