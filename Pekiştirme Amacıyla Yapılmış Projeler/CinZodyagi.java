package Uygulamalar2;

import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birthYear;
        System.out.println("Please enter the birth year : ");
        birthYear = input.nextInt();
        if (birthYear%12==0){
            System.out.println("Your chinese zodiac monkey");
        }else if(birthYear%12==1){
            System.out.println("Your chinese zodiac cockerel");
        }else if(birthYear%12==2){
            System.out.println("Your chinese zodiac dog");
        }else if(birthYear%12==3){
            System.out.println("Your chinese zodiac pig");
        }else if(birthYear%12==4){
            System.out.println("Your chinese zodiac rat");
        }else if(birthYear%12==5){
            System.out.println("Your chinese zodiac bullock");
        }else if(birthYear%12==6){
            System.out.println("Your chinese zodiac tiger");
        }else if(birthYear%12==7){
            System.out.println("Your chinese zodiac rabbit");
        }else if(birthYear%12==8){
            System.out.println("Your chinese zodiac dragon");
        }else if(birthYear%12==9){
            System.out.println("Your chinese zodiac snake");
        }else if(birthYear%12==10){
            System.out.println("Your chinese zodiac horse");
        }else if(birthYear%12==11){
            System.out.println("Your chinese zodiac sheep");
        }else{
            System.out.println("you entered wrong character..");
        }

    }
}
