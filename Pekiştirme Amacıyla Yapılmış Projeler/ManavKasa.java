package Uygulamalar;

import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {

        double armut,elma,domates,muz,patlican;

        double armutPrc = 2.14;
        double elmaPrc = 3.67;
        double domatesPrc =1.11;
        double muzPrc =0.95;
        double patlicanPrc=5;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç kg armut aldığınızı giriniz : ");
        armut = input.nextDouble();
        System.out.println("Kaç kg elma aldığınızı giriniz : ");
        elma = input.nextDouble();
        System.out.println("Kaç kg domates aldğınızı giriniz : ");
        domates = input.nextDouble();
        System.out.println("Kaç kg muz aldığınızı giriniz : ");
        muz = input.nextDouble();
        System.out.println("Kaç kg patlıcan aldığınızı giriniz : ");
        patlican = input.nextDouble();

        double armutTop=armut*armutPrc;
        double elmaTop=elma*elmaPrc;
        double domatesTop=domates*domatesPrc;
        double muzTop=muz*muzPrc;
        double patlicanTop=patlican*patlicanPrc;
        double toplamPrc=armutTop+elmaTop+domatesTop+muzTop+patlicanTop;

        System.out.println("Aldığınız armutun toplam fiyatı = " + armutTop);
        System.out.println("Aldığınız elmanın toplam fiyatı = " + elmaTop);
        System.out.println("Aldığınız domatesin toplam fiyatı = " + domatesTop);
        System.out.println("Aldığınız muzun toplam fiyatı = " + muzTop);
        System.out.println("Aldığınız patlıcanın toplam fiyatı = " + patlicanTop);

        System.out.println("Aldığınız her şeyin toplamı = " + toplamPrc);

    }
}
