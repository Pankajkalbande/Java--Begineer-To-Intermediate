package com.company;

// factorial program
public class _34_Recursion {
    static int factorial_recursion(int n){
        if (n== 0 || n==1){
            return 1;
        }
        else {
            return n * factorial_recursion(n-1);
        }
    }


    static int factorial_iteration(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i = 1; i<= n ; i++){
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {

        int x =5;
        System.out.printf("Factorial of 5 is :"+ factorial_recursion(x));

        System.out.println("\n");

        System.out.println("Factorial of 4 is :" + factorial_recursion(4));
    }
}
