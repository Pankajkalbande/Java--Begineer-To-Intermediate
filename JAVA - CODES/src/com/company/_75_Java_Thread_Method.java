package com.company;


class ThreadMethod1 extends Thread{

    public void run(){
        int i = 0 ;
        while (i< 3000){
            System.out.println("************* Thread Method 1");
            i++;
        }
    }
}
class ThreadMethod2 extends Thread{

    public void run(){
        int i = 0 ;
        while (i< 3000){
            System.out.println("Thread Method 2 *************");
            i++;
        }
    }
}
public class _75_Java_Thread_Method {
    public static void main(String[] args) {

        ThreadMethod1 tm1 = new ThreadMethod1();
        ThreadMethod2 tm2 = new ThreadMethod2();

        tm1.start();

        try {
            tm1.join();
        }catch (Exception e){
            System.out.println(e);
        }

        tm2.start();
    }
}
