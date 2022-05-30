package com.company;

public class _08_Operators_types {
    public static void main(String[] args) {
//      Arithmatic operator
        int a = 6;
        int b = 10 - a;

        System.out.println(b);

//        Assignment Operator
        b *= 4;
        System.out.println(b);

//        Comparison Operator
        System.out.println(9 == 9);

//        Logical operator
        System.out.println(64>5 && 64>98);
        System.out.println(64>5 && 64<98);

//        Bitwise operator
        System.out.println(2&3);
    }
}
