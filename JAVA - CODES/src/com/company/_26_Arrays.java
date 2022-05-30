package com.company;

public class _26_Arrays {
    public static void main(String[] args) {

//        int [] marks = new int[5];
//        marks[0] = 1;
//        marks[1] = 2;
//        marks[2] = 3;
//        marks[3] = 4;
//        marks[4] = 5;


//        declaration , memory allocation and initialization together

        int [] marks = {10,20,30,40,50};
        System.out.println(marks[3]);
//        for each loop
        System.out.println("The length of array is : " + marks.length);


        String [] students = {"Harry", "Rohan", "Shubham","Pankaj"};
        System.out.println(students.length);
        System.out.println(students[2]);

//        DISPLAY ARRAY USING FOR LOOP
        System.out.println("DISPLAY ARRAY USING FOR LOOP");
        for (int i= 0; i < students.length ; i++){
            System.out.println(students[i]);
        }
//        REVERSE ARRAY
        System.out.println("DISPLAY ARRAY USING FOR LOOP -- reverse order");
        for (int i=students.length-1  ; i >=0 ;i--){
            System.out.println(students[i]);
        }


//        FOR EACH LOOP
        System.out.println("DISPLAYING USING FOR EACH LOOP");
        for (int element : marks){
            System.out.println(element);
        }
    }
}
