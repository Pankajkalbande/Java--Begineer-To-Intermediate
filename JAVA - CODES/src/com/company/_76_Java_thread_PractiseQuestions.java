package com.company;

/* 1) write a program to print "Good Morning" and "Welcome" continue on screen using Thread*/
//
//class PrintGoodMorning extends Thread {
//    public void run() {
//        while (true) {
//            System.out.println("Good Morning");
//        }
//    }
//}
//class PrintWelcome extends Thread{
//    public void run() {
//        while (true) {
//            System.out.println("Welcome");
//
//        }
//    }
//}


/* 2) Add a sleep method in welcome thread of question1 to delay its execution for 200 ms*/

class PrintGoodMorning extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
        }
    }
}
class PrintWelcome extends Thread{
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Welcome");

        }
    }
}


public class _76_Java_thread_PractiseQuestions {
    public static void main(String[] args) {

        PrintGoodMorning gm = new PrintGoodMorning();
        PrintWelcome welcome = new PrintWelcome();

//        gm.start();
//        welcome.start();


        /* 3) Demonstrate setPriority and getPriority */
        gm.setPriority(6);
        welcome.setPriority(9);
        System.out.println(gm.getPriority());
        System.out.println(welcome.getPriority());
    }
}
