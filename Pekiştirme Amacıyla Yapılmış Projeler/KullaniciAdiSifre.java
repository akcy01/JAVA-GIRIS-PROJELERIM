package Uygulamalar2;

import javax.swing.*;
import java.util.Scanner;

public class KullaniciAdiSifre {
    public static void main(String[] args) {
    String userName,password,newPassword;
    int select;

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your username ");
        userName = input.nextLine();
        System.out.println("Please enter your password");
        password = input.nextLine();

        if (userName.equals("popsmoke")&&password.equals("pop123")){
            System.out.println("Logged in");
        }

        else {
            System.out.println("Your informations are wrong.If you want to reset your password press 1 if you dont press 2");
            select = input.nextInt();

            switch (select){
                case 1:
                    System.out.println("Please give us your new password. ");
                    newPassword = input.next();
                    if (newPassword.equals("pop123")){
                        System.out.println("Your new password can't be same!!");
                    }else{
                        System.out.println("Your password created! ");
                    }break;

                case 2:
                    System.out.println("Please try again next time.");

            }
        }


        }
    }

