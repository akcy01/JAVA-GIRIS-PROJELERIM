package Uygulamalar2;
import java.util.Scanner;
public class Hesapmakinesi {
    public static void main(String[] args) {
        int d1,d2,select;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz : ");
        d1 = input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz : ");
        d2 = input.nextInt();
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();
        switch (select){
            case 1 :
                System.out.println("Toplam Sonucu: " + (d1+d2));
            break;
            case 2 :
                System.out.println("Çıkarma Sonucu: " + (d1-d2));
                break;
            case 3 :
                System.out.println("Çarpma Sonucu: " + (d1*d2));
            break;
            case 4 :
                System.out.println("Bölme Sonucu: " + (d1/d2));
                break;
            default:
                System.out.println("Referans dışı bir değer girdiniz.");

        }


    }
}
