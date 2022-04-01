package Uygulamalar2;

import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int birthDay;
    String birthMonth;
        System.out.println("Please enter the day you were born  : ");
        birthDay= input.nextInt();
        System.out.println("Please enter the month you were born : ");
        birthMonth= input.next();

        if (birthMonth.equals("January")){
            if (birthDay >=1 && birthDay<=21){
                System.out.println("Your zodiac sign is Capricorn");
            }else if(birthDay >=22 && birthDay<=31){
                System.out.println("Your zodiac sign is Aquarius");
            }
        }
        if (birthMonth.equals("February")){
            if (birthDay >=1 && birthDay <=19) {
                System.out.println("Your zodiac sign is Aquarius");
            }else if(birthDay>=20 && birthDay<=28){
                System.out.println("Your zodiac sign is Fish ");
            }
        }
        if (birthMonth.equals("March")){
            if (birthDay>=1 && birthDay<=20){
                System.out.println("Your zodiac sign is Fish");
            }else if (birthDay>=21 && birthDay<=31){
                System.out.println("Your zodiac sign is Aries ");
            }
        }
        if (birthMonth.equals("April")){
            if (birthDay>=1 && birthDay<=20){
                System.out.println("Your zodiac sign is Aries");
            }else if (birthDay>=21 && birthDay<=30){
                System.out.println("Your zodiac sign is Taurus ");
            }
        }
        if (birthMonth.equals("May")){
            if (birthDay>=1 && birthDay<=21 ){
                System.out.println("Your zodiac sign is Taurus");
            }else if(birthDay>=22 && birthDay<=31){
                System.out.println("Your zodiac sign is Gemini ");
            }
        }
        if (birthMonth.equals("June")){
            if (birthDay>=1 && birthDay<=22){
                System.out.println("Your zodiac sign is Gemini");
            }else if (birthDay>=23 && birthDay<=30){
                System.out.println("Your zodiac sign is Crab");
            }
        }
        if (birthMonth.equals("July")){
            if (birthDay>=1 && birthDay<=22){
                System.out.println("Your zodiac sign is Crab");
            }else if (birthDay>=23 && birthDay<=31){
                System.out.println("Your zodiac sign is a Lion ");
            }
        }
        if (birthMonth.equals("August")){
            if (birthDay>=1 && birthDay<=22){
                System.out.println("Your zodiac sign is a Lion");
            }else if (birthDay>=23 && birthDay<=30){
                System.out.println("Your zodiac sign is Virgo ");
            }
        }
        if (birthMonth.equals("September")){
            if (birthDay>=1 && birthDay<=22){
                System.out.println("Your zodiac sign is Virgo");
            }else if (birthDay>=23 && birthDay<=31){
                System.out.println("Your zodiac sign is Libra ");
            }
        }
        if (birthMonth.equals("October")){
            if (birthDay>=1 && birthDay<=22){
                System.out.println("Your zodiac sign is Libra");
            }else if (birthDay>=23 && birthDay<=30){
                System.out.println("Your zodiac sign is Scorpio ");
            }
        }
        if (birthMonth.equals("November")){
            if (birthDay>=1 && birthDay<=21){
                System.out.println("Your zodiac sign is Scorpio ");
            }else if (birthDay>=22 && birthDay<=31){
                System.out.println("Your zodiac sign is Sagittarius");
            }
        }
        if (birthMonth.equals("December")){
            if (birthDay>=1 && birthDay<=21){
                System.out.println("Your zodiac sign is Sagittarius");
            }else if (birthDay>=22 && birthDay<=30){
                System.out.println("Your zodiac sign is Capricorn ");
            }
        }else{
            System.out.println("You entered wrong.");
        }

    }
}
