package com.company;

public class _09_Associativity_ofOperator {
    public static void main(String[] args) {

        int a = 6*5-34/2;
        System.out.println(a);

//        Precedence and Associativity
        int b = 60/5 - 34*2;
        System.out.println(b);

        a = b = 45;
        System.out.println(a);
        System.out.println(b);

        int x = 6;
        int y = 1;
        int k = x * y/2;
        System.out.println(k);
    }
}
