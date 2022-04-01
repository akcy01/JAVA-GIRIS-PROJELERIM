package Uygulamalar2;

import java.util.Scanner;
public class BuyuktenKucuge {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number :  ");
        a = input.nextInt();
        System.out.println("Please enter the second number : ");
        b = input.nextInt();
        System.out.println("Please enter the third number : ");
        c = input.nextInt();

        // a'nin en büyük olduğu durum
        if ((a > b) && (a > c)) {
            if ((b > c)) {
                System.out.print("a > b > c");
            } else
                System.out.print("a > c > b");

            // b'nin en büyük olduğu durum
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.print("b > a > c");
            } else
                System.out.print("b > c > a");

            //c'nin en büyük olduğu durum
        } else {
            System.out.println("c > b > a");
        }


    }

}