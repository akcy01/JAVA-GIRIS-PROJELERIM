package Donguler;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.println("Lütfen değer giriniz: ");
        sayi = input.nextInt();

        for(int i=0;i<=sayi;i++){

            for(int k=1;k<i+1;k++){
                System.out.print(" ");
            }

            for(int j=1;j<2*(sayi-i);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
