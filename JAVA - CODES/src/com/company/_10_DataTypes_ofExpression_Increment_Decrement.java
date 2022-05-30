package com.company;

public class _10_DataTypes_ofExpression_Increment_Decrement {
    public static void main(String[] args) {

        int a = 456 + 5;
        System.out.println(a);

        int b = 45+4;
        byte c = 6;
        short d = 8;
        int e = c-d;
        System.out.println(e);

//        Increment & Decrement Operator
        int i =56;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);

        int z = 10;
        int x = --z;
        System.out.println(x);

        int y = 7;
        int v = ++y * 8;
        System.out.println(v);

        char ch = 'a';
        System.out.println(++ch);

        char n = 'b';
        n++;
        System.out.println(n);
    }
}
