package com.company;

public class _32_Method_Overloading {
    static void tellJoke(){
        System.out.println("I am President");
    }

    static void ChangeArray(int [] arr){
        arr[0] = 100;
    }

//    method overloading
    static void greet(){
        System.out.println("Good Morning");
    }
    static void greet(String name){
        System.out.println("Good Morning " + name);
    }
    static void greet(String name , int age){
        System.out.println("Good Morning "+ name + ", " + "your age is:" + age);
    }
    public static void main(String[] args) {
        tellJoke();

        System.out.println("\n ");

        int [] marks = {52,73,77,89,98,94};
//        change the value in array
        ChangeArray(marks);
        System.out.println("After changing the array " + marks[0]);

        System.out.println("\n");
//        method overloading
        greet();
        greet("Pankaj");
        greet("Pankaj",22);
    }
}
