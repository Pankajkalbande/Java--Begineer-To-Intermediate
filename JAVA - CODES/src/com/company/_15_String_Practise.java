package com.company;

public class _15_String_Practise {
    public static void main(String[] args) {

        String name = "Jack Parker";
        System.out.println(name.toLowerCase());

//        replace space with _
        System.out.println(name.replace(" ","_"));

//        detect double and tripple stapces
        String myString = "This string contains   double and  triple spaces";
        System.out.println(myString.indexOf(" "));
        System.out.println(myString.indexOf("  "));
    }
}
