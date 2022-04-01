package Metodlar;

public class metod1UsluSayilar {
// ilk metodumuz..
    static int power(int sayi,int ussu){
        int sonuc = 1;
        for (int i=1; i<=ussu; i++){
             sonuc = sonuc * sayi;
        }
        return sonuc;
    }

    public static void main(String[] args) {

       int case1 = power(2,3);
        System.out.println(case1);

    }
}
