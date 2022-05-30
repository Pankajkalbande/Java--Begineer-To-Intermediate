package com.company;

public class _24_Break_continue {
    public static void main(String[] args) {

        for(int i = 0; i <5; i++){
            System.out.println(i);

            if(i == 2){
                break;
            }
        }
        System.out.println("Loop ended");

        System.out.println("**************** continue ***********");

//        continue
        for(int j=0;j<10;j++){
            if(j == 2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(j);
            System.out.println("Java is great");
        }
    }
}
