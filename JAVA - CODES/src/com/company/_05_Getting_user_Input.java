package com.company;
import java.util.Scanner;

public class _05_Getting_user_Input {
    public static void main(String[] args) {

        System.out.println("Enter First Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Your entered number is: " + a);

        System.out.println("Enter Second Number: ");
        Scanner second = new Scanner(System.in);
        int b = second.nextInt();
        System.out.println("Your entered number is: " + b);

        int sum = a + b ;
        System.out.println("Sum is :" + sum);
    }
}
