package Uygulamalar;

import java.util.Scanner;
public class HipotenusBulanProgram {
    public static void main(String[] args) {
        int ilk,ikinci;
        double hipotenus;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk kenarı giriniz : ");
        ilk = input.nextInt();
        System.out.println("İkinci kenarı giriniz : ");
        ikinci = input.nextInt();

        //Math.sqrt karekök almamıza yarıyor.
        hipotenus = Math.sqrt((ilk*ilk) + (ikinci*ikinci));

        System.out.println("Hipotenüsümüz = " + hipotenus);

    }
}
