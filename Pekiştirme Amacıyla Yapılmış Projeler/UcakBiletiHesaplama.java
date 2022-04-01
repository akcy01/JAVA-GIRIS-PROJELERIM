package Uygulamalar2;

import java.util.Scanner;
public class UcakBiletiHesaplama {
    public static void main(String[] args) {

/*Make a program that calculates air ticket prices according to distance and conditions with Java. Get Distance (KM), age and trip type (One Way, Round-Round) information from the user. Take the fare per distance as 0.10 TL / km. First, calculate the total price of the flight and then apply the following discounts to the customer according to the conditions;

Values received from the user must be valid (distance and age are positive numbers, trip type is 1 or 2). Otherwise, "You Have Entered Wrong Data!" A warning should be given.
If the person is younger than 12 years old, 50% discount is applied on the ticket price.
If the person is between the ages of 12-24, a 10% discount is applied on the ticket price.
If the person is over 65 years old, a 30% discount is applied on the ticket price.
If the person has chosen the "Journey Type" round trip, 20% discount is applied on the ticket price. */

        Scanner input = new Scanner(System.in);
        int distance,age,tripType ;
        System.out.println("Please enter the distance in kilometers. : ");
        distance  = input.nextInt();
        System.out.println("Please enter your age : ");
        age = input.nextInt();
        System.out.println("Please enter the type of trip  1=>One direction  & 2=>Round trip");
        tripType = input.nextInt();
        double price = distance * 0.10;
        double tripDiscount1 = price * 0.20;
        if (age<12 && tripType==2){
            double ageDiscount1 = price * 0.50;
            double kidPrice = price - ageDiscount1 - tripDiscount1;
            System.out.println(kidPrice);
        }else if (age<12){
            double ageDiscount1 = price * 0.50;
            double kidPrice = price - ageDiscount1;
            System.out.println(kidPrice);
        }
        if (age<24 && age>12 && tripType==2){
            double ageDiscount2 = price * 0.10;
            double teenPrice = price - ageDiscount2 - tripDiscount1;
            System.out.println(teenPrice);
        }else if (age<24 && age>12){
            double ageDiscount2 = price * 0.10;
            double teenPrice = price - ageDiscount2;
            System.out.println(teenPrice);
        }
        if (age>65 && tripType==2){
            double ageDiscount3 = price * 0.30;
            double oldPrice = price - ageDiscount3 - tripDiscount1;
            System.out.println(oldPrice);
        }else if (age>65){

            double ageDiscount3 = price * 0.30;
            double oldPrice = price - ageDiscount3;
            System.out.println(oldPrice);

        }else {
            System.out.println("You entered wrong data!!");
        }

    }
}
