package com.company;

public class _25_PractiseOnLoop {
    public static void main(String[] args) {
        /* 1)  print * pattern like  ****
                                 ***
                                 **
                                 *
        */

        for (int i =4 ; i>=1 ; i--){
           for (int j=0; j<i ; j++){
               System.out.print("*");
           }
            System.out.print("\n");
        }

        /*2 ) write a program to print sum of first n even number*
         0 2 4 = 6
         */

        int sum = 0;
        int n = 3;
        for(int i = 0 ; i<n; i++){
            sum = sum + (2*i);
        }
        System.out.println("The sum of first even number is " + sum);

        /*3) Multiplication table */
        int num = 5;
        for(int i = 1; i <= 10 ; i++){
            System.out.println(i * num);
        }
        System.out.println("\n");
        /* 4) Multiplication table in reverse order */
        int m = 5;
        for(int j = 10; j >= 1; j--){
            System.out.println(j * m);
        }
        System.out.println("\n");

        /* 5) Factorial of number */
        int n1 = 5;
        int i = 1;
        int factorial = 1;
        while(i<=n1){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
        System.out.println("\n");

        /*6) factorial using for loop*/
        int a = 5;
        int fact = 1;
        for(int b = 1 ; b<= a; b++){
            fact *= b;
        }
        System.out.println(fact);

        System.out.println("\n");
        /* 7) sum of multiplication of 8 and sum them*/
        int number = 8;
        int add = 0;
        for (int l = 1; l<=10 ; l++){
            add = add + (number*l);
        }
        System.out.println("sum is " + add);
    }
}
