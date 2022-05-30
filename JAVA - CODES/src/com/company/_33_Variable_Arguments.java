package com.company;

public class _33_Variable_Arguments {
    static int sum(int ...arr){
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("WELCOME TO VAR-ARGS");

        System.out.println("The sum of 4 and 5 is: "+ sum(4,5));
        System.out.println("The sum of 1,2 and 3 is: "+ sum(1,2,3));
        System.out.println("The sum of 1,2 ,3,4 and 5 is: "+ sum(1,2,3,4,5));
    }
}
