package SiniflarMetotlar;

//Kullanıcının belirli bir hakkı olacak ve o şekilde sayıyı tahmin etmeye çalışacak.

import java.util.Arrays;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 100) ; //(int) ile ondalıklı bir sayıyı tam sayıya çevirmesini sağladık
        Scanner input = new Scanner(System.in);
        int rights = 0;
        int selected;
        int [] wrong = new int[7];
        boolean isWin = false;

        // Let's give 5 rights to the user
        while (rights<5){
            System.out.println(number);
            System.out.println("Please enter your estimate value. ");
            selected= input.nextInt();

            if (selected < 0 || selected > 99){

                System.out.println("You must enter a value between 0 and 100 ! ");
                continue; // so that our right is not wasted
            }

            if (selected == number){

                System.out.println("Excellent!! You guessed right !! This is the number you guess => " +  number);
                isWin = true;
                break;

            }

            else{
                rights++;
                System.out.println("You enter wrong value ! ");
                if (selected > number){
                    System.out.println(selected + " your selected number greater than the hidden number. ");
                }else{
                    System.out.println(selected + " your selected number is smaller than the secret number. ");
                }

                wrong[rights]=selected;
                System.out.println("Your remaining right => " + (5 - rights));

            }

        }

        if (!isWin){
            System.out.println("You Lost ! ");
            System.out.println("Your predictions " + Arrays.toString(wrong));
        }
    }
}
