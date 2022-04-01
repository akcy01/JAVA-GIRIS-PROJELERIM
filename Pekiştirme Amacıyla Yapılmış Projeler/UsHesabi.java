package Metodlar;

import javax.print.attribute.standard.PresentationDirection;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class UsHesabi {
    static int power(int taban , int us){
        if (us==0){
            return 1;
        }else{
            int result = taban *power(taban,us-1);
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değerini giriniz : ");
        int taban = input.nextInt();
        System.out.println("Üs değerini giriniz : ");
        int us = input.nextInt();

        System.out.println(power(taban,us));

    }
}
