package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class AlinanElemanlariYazdirma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen n değerini giriniz : ");
        int n = input.nextInt();

        int [] list  = new int[n]; //Boyutunu kullanıcıdan aldık.

        int deger;  //kullanıcının girdiği değerleri tutması için bu değişkeni atadık.

        for (int i = 0; i< n;i++){
            System.out.println(i+1 + ". değeri gir ");
            deger = input.nextInt();
             list[i] = deger;
        }
        System.out.println(Arrays.toString(list)); // Kullanıcının yarattığı dizi

        Arrays.sort(list);  // bu diziyi küçükten büyüğe sıraladık

        System.out.println("Sıralama => " + Arrays.toString(list)); // sıralanmış halini yazdırdık.

    }
}
