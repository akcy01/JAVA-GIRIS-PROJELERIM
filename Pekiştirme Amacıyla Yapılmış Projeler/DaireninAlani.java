package Uygulamalar;

import java.util.Scanner;
public class DaireninAlani {
    public static void main(String[] args) {
        double r;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçap değerini giriniz : ");
        r = input.nextDouble();

        double alan;
        alan = pi*r*r;
        double cevre;
        cevre = 2*pi*r;

        System.out.println("Dairemizin alanı = " + alan);
        System.out.println("Dairemizin çevresi = " + cevre);

    }
}
