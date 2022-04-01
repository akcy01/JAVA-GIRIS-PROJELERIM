package Uygulamalar;
import java.util.Scanner;
public class VücutKitleEndeksi {
    public static void main(String[] args) {
        double boy;
        double kg;
        double kitleEndex;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boy uzunluğunuzu metre cinsinden giriniz : ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kg = input.nextDouble();

        kitleEndex = kg/(boy*boy);

        System.out.println("Vücut kitle endeksiniz = " + kitleEndex);


    }
}
