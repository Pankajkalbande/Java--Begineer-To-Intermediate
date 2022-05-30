package com.company;

public class _35_Practise_on_Methods {
//    multiplication table of a number n using method
    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
//        print pattern in forward direction
    static void pattern(int x) {
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

//    sum of first n natural number using recursive function
    static int sum(int a){
        if(a==1){
            return 1;
        }
        return a + sum(a-1);
    }


//    print pattern in reverse direction
    static void reversePattern(int r){
        for (int i = r; i>=0; r++){
            for (int j = 0; j>i; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }


//    fibonacci series
    static int fib(int p){
        if(p==1){
            return 0;
        } else if (p==2) {
            return 1;
        }
        else {
            return fib(p-1) + fib(p-2);
        }
    }
    public static void main(String[] args) {
        table(5);
        pattern(9);
        System.out.println("\n");
        System.out.println("The sum of first n natural number is: "+ sum(3));

        System.out.println("\n");

//        reversePattern(6);
        System.out.println("fibonacci series is:" + fib(7));
    }
}
