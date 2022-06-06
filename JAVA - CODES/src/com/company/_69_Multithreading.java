package com.company;

class MyThread1 extends Thread{

    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("I am running Thread 1");
            System.out.println("I am Happy !");
            i++;
        }
    }
}
class MyThread2 extends Thread{

    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("************** I am running Thread 2 ************");
            System.out.println("I am Sad!");
            i++;
        }
    }
}

public class _69_Multithreading {
    public static void main(String[] args) {

        MyThread1 th1 = new MyThread1();
        MyThread2 th2 = new MyThread2();
        th1.start();
        th2.start();
    }
}
