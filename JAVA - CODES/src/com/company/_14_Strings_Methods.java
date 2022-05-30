package com.company;

public class _14_Strings_Methods {
    public static void main(String[] args) {

        String a = "Harry";
        System.out.println(a);

        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());

        System.out.println(a.length());

//        trim() --  return new string after removing white space
        String name = "     Pankaj Kalbande     ";
        System.out.println(name);
        System.out.println(name.trim());

//        substring() -- return from start to end .
        System.out.println(a.substring(3));
        System.out.println(a.substring(2));

        System.out.println(a.substring(1,4));
        System.out.println(a.substring(1,5));

//        replace()
        System.out.println(a.replace("r","p"));

//        startWith()
        System.out.println(a.startsWith("H"));
        System.out.println(a.startsWith("p"));

        System.out.println(a.endsWith("y"));

        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("y"));
        System.out.println(a.indexOf("r"));
        System.out.println(a.lastIndexOf("r"));

        System.out.println(a.equals("Harry"));
        System.out.println(a.equalsIgnoreCase("harrY"));

    }
}
