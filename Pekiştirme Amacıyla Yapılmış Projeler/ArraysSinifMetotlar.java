package Diziler;

import java.util.Arrays; // önce böyle import edilmeli

public class ArraysSinifMetotlar {
    public static void main(String[] args) {


        /* //Arrays.toString İLE Dizilere ait elemanları ekrana yazmak için kullanılan metot.

         int [] örnek = {1,2,3,4,};
        double[] örnek2 = {22,34,5,51,12};

        System.out.println(Arrays.toString(örnek2));

         */

        /*

        //Arrays.fill ile diziye değerler atarız

        int [] fillOrnek = {11,22,33,44,55,66};
        System.out.println(Arrays.toString(fillOrnek));
        Arrays.fill(fillOrnek,10);
        System.out.println(Arrays.toString(fillOrnek));

        ******BURDA ÇIKTILARIN HEPSİ 10 OLACAK DİZİLERİN BÜTÜN DEĞERİ 10 OLACAK***********

        int [] fillOrnek2 = {1,2,3,4,5,6,7,8,9};
        Arrays.fill(fillOrnek2,2,5,15); //2. indexten başla 5. indexe kadar tüm değerleri 15 yap demek.
        System.out.println(Arrays.toString(fillOrnek2));
        ******BURDA ÇIKTILAR DAHA FARKLI OLACAK ************

            */

        /* // Arrays.sort ile diziyi sıralarız.

         int [] sortOrnek = {-90,-50,-10,5,15,95,84};
         Arrays.sort(sortOrnek);
         System.out.println(Arrays.toString(sortOrnek)); // Bu dizideki değerleri küçükten büyüğe doğru sıralar.
         *****BURDA ÇIKTILAR KÜÇÜKTEN BÜYÜĞE DOĞRU SIRALANACAKTIR*******
         -90,-50..... GİBİ

        */

        /* //Arrays.binarySearch ile dizinin içindeki değişkenin değerinin index numarasını bulabiliriz!!

            önce sıralayacağız !!

        int [] binaryOrnek = {15,32,11,0,44,97,65};
        Arrays.sort(binaryOrnek); // Önce sıraladık
        System.out.println(Arrays.toString(binaryOrnek));
        System.out.println(Arrays.binarySearch(binaryOrnek,11));

        //önce küçükten büyüğe sıralıyor ve öğrenmek istediğimiz değerin index numarasını bize yazdırıyor
        //mesela bunun verdiği sonuç 1 !!!

        */

        /* Arrays.copyOf ile dizinin bir kısmını kopyalayabiliriz.

        int [] copyOrnek = {1,2,3,4,5,6,7,8,9};
        int [] copyOrnekList = Arrays.copyOf(copyOrnek,4); //copyOrnek dizisinin ilk 4 indexini getir dedik
        System.out.println(Arrays.toString(copyOrnekList));
        // Çıktısı 1,2,3,4 olur !!!!!!

         */

        /*Arrays.copyOfRange'de dizilerde belirlediğimiz elemanların kopyasını alırız

        int [] copyOrnek = {1,2,3,4,5,6,7,8,9};
        int [] copyOrnekList = Arrays.copyOfRange(copyOrnek,2,6);//2 den 6. indexe kadar olan kısımları kopyala demek bu
        System.out.println(Arrays.toString(copyOrnekList));

        */

        /*Arrays.equals'da ise iki ayrı dizinin eşit olup olmadığını kontrol ederiz
        eğer eşitse true döndürür değilse false döndürür!!

        int [] equalsOrnek = {1,2,3};
        int [] equalsOrnek2 = {1,2,3};
        System.out.println(Arrays.equals(equalsOrnek,equalsOrnek2));

         //bu iki dizi aynı oldugu için true değeri verecek

         */
    }
}