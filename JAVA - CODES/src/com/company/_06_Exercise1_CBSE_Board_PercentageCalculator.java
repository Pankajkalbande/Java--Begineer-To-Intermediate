package com.company;

import java.util.Scanner;

public class _06_Exercise1_CBSE_Board_PercentageCalculator {
    public static void main(String[] args) {

        System.out.println("This is CBSE Board Percentage Calculator : ");
        Scanner marks = new Scanner(System.in);

        System.out.print("Enter Marks for Math: ");
        int math =  marks.nextInt();

        System.out.print("Enter Marks for English: ");
        int English =  marks.nextInt();

        System.out.print("Enter Marks for Science: ");
        int Science =  marks.nextInt();

        System.out.print("Enter Marks for Biology: ");
        int Biology =  marks.nextInt();

        System.out.print("Enter Marks for Social Science: ");
        int Social_Science =  marks.nextInt();

        int sum = (math + English + Science + Biology + Social_Science);
        float percentage = ( sum / 500.0f) * 100  ;
        System.out.println("Your Percentage is : " + percentage);

    }
}
