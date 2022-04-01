package Diziler;

import java.util.Arrays;
// her sayıyı gez
// gezdiğin sayıların eştilerini bul
// eşiti olan sayıdan kaç tane olduğunu yazdır

public class DizilerinFrekansi {

    public static void main(String[] args) {

        int[] list = {10,10,10,20,20,5,30,30};

        Arrays.sort(list); // Sıraladık

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i=0; i< list.length; i++){
            if (list[i] == 10 ){
                count1++;
            }
          }

        for (int i = 0; i< list.length; i++){
            if (list[i] == 20){
                count2++;
            }
        }

        for (int i = 0; i<list.length; i++){
            if (list[i] == 30){  //döngüde i 30 a denk geldiğinde count 3 ü 1 er 1 er arttır demek
                count3++;
            }
        }
        System.out.println("10 sayısı " + count1 + " kere tekrar edilmiştir.");
        System.out.println("20 sayısı " + count2 + " kere tekrar edilmiştir.");
        System.out.println("30 sayısı " + count3 + " kere tekrar edilmiştir.");


       }

    }

