package com.company;

public class _17_Relational_Operator {
    public static void main(String[] args) {

        System.out.println("Logical AND"); // need both true for return true
        boolean a = true;
        boolean b  = false;
        if(a && b){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }


        System.out.println("Logical OR"); // one condition is true then return true
        boolean c = true;
        boolean d  = false;
        if(c || c){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }


        System.out.println("Logical NOT");
        System.out.println("Not of a is:" + !a);
        System.out.println("Not of b is:" + !b);
    }
}
