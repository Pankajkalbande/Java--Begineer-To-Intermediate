package com.company;

class FirstThread extends Thread{
    public FirstThread(String name) {
        super(name);
    }

    public void run(){
//        int i = 0;
//        while (i<2000){
//            System.out.println("I am a Thread");
//            i++;
//        }
    }
}

public class _73_Java_Thread_Constructors {
    public static void main(String[] args) {

        FirstThread ft = new FirstThread("Pankaj");
        ft.start();

        System.out.println(ft.getId());
        System.out.println(ft.getName());

    }
}
