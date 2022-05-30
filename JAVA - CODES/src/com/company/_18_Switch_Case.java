package com.company;

import java.util.Scanner;

public class _18_Switch_Case {
    public static void main(String[] args) {

        int age ;
        System.out.println("Enter Your age: ");
        Scanner sc = new Scanner(System.in);

        age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("Your age is 18");
                break;
            case 21:
                System.out.println("Your age is 21");
                break;
            case 60:
                System.out.println("You are going to retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }
    }
}
