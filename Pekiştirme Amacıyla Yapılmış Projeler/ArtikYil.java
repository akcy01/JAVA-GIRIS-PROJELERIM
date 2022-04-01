package Uygulamalar2;

import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.println("Lütfen bir yıl giriniz : ");
        yil = input.nextInt();
        if (yil%400==0){
            System.out.println("Girdiğiniz yıl artık bir yıldır.");
        }else if(yil%400!=0){
            System.out.println("Girdiğiniz yıl artık yıl değildir.");
        }else{
            System.out.println("Yanlış karakter girdiniz.");
        }

    }
}
