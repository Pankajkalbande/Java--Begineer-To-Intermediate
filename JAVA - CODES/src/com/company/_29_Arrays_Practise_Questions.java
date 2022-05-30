package com.company;

public class _29_Arrays_Practise_Questions {
    public static void main(String[] args) {

//        1) create array of 5 floats and calculate their sum
       /* float [] marks = {45,7f , 67.8f, 63.4f , 99.2f,100.0f};
        float sum = 0;

        for (float element : marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is: " + sum);

        */
//        2) wap to find out whether a given integer is present in an array or not
        float [] marks = {45,7f , 67.8f, 63.4f , 99.2f,100.0f};
        float number = 100.0f;
        boolean isInArray = false;

        for (float element : marks){
            if(number == element){
                isInArray = true;
                break;
            }
        }
        if (isInArray)
        {
            System.out.println("Element is found");
        }
        else
        {
            System.out.println("Element is not present");
        }
    }
}
