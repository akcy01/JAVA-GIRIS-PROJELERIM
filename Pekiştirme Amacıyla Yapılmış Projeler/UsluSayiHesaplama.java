package Donguler;

import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k;
        int sonuc = 1;
        System.out.println("Üssü alınacak sayıyı giriniz : ");
        n = input.nextInt();
        System.out.println("Üssü giriniz : ");
        k = input.nextInt();

        for (int i = 1; i<=k;i++){
            sonuc = sonuc*n;

        }
        System.out.println("Bulduğumuz sonuç : " + sonuc);
    }
}
