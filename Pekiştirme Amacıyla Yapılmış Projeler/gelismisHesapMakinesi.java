package Metodlar;

import java.util.Scanner;

public class gelismisHesapMakinesi {

    static int sum(int a,int b){
        int result = a+b;
        System.out.println("Yaptığınız toplama işleminin sonucu : " + result);
        return result;
    }

    static int min(int a,int b){
        int result = a-b;
        System.out.println("Yaptığınız çıkarma işleminin sonucu : " + result);
        return result;
    }

    static int imp(int a,int b){
        int result = a*b;
        System.out.println("Yaptığınız çarpma işleminin sonucu : " + result);
        return result;
    }

    static int div(int a,int b){
        if (b==0){
            System.out.println("Girdiğiniz ikinci değer 0 olamaz ! ");
            return 0;
        }
        int result = a/b;
        System.out.println("Yaptığınız bölme işleminin sonucu : " + result);
        return result;
    }

    static int pow(int a, int b){
        int sonuc = 1;
        for (int i = 1; i<=b; i++){
            sonuc = sonuc*a;
        }
        System.out.println("Yaptığınız üs alma işleminin sonucu : " + sonuc);
        return sonuc;
    }

    static int mod(int a,int b){
        int result = a%b;
        System.out.println("Yaptığınız mod alma işleminin sonucu : " + result);
        return result;
    }

    static void alancvr(int a,int b){
        int result1 = a*b;
        System.out.println("Girdiğiniz sayılara göre dikdörtgenin alanı : " + result1);
        int result2 = 2 * (a+b);
        System.out.println("Girdiğiniz sayılara göre dikdörtgenin çevresi : " + result2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sorular = "1-)Toplama\n" + "2-)Çıkarma\n"+"3-)Çarpma\n"+"4-)Bölme\n"+"5-)Üslü Sayı Hesaplama\n"+"6-)Mod Alma\n"+"7-)Dikdörtgen Alan Ve Çevre Hesabı\n" + "0-)Çıkış Yap";

        System.out.println(sorular);

        while (true){ // False olana kadar çalışacak döngü

            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
            int secim = input.nextInt();

            if (secim == 0){
                break;
            }

            System.out.println("İlk değeri giriniz : ");
            int a = input.nextInt();
            System.out.println("İkinci değeri giriniz : ");
            int b = input.nextInt();

            switch (secim){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    min(a,b);
                    break;
                case 3:
                    imp(a,b);
                    break;
                case 4:
                    div(a,b);
                    break;
                case 5:
                    pow(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    alancvr(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir değer girdiniz !! ");
            }

        }

    }
}
