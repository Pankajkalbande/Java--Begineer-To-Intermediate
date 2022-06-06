package com.company;

class ThreadPriorities extends Thread{
    public ThreadPriorities(String name) {
        super(name);
    }
    public void run(){
        int i = 0;
        while (i< 4000){
            System.out.println("Java maximum Priority " + this.getName());
            i++;
        }
    }
}

public class _74_Java_Thread_Priorities {
    public static void main(String[] args) {

        ThreadPriorities tp1 = new ThreadPriorities("Pankaj");
        ThreadPriorities tp2 = new ThreadPriorities("Nilesh");
        ThreadPriorities tp3 = new ThreadPriorities("Swaraj (Most Important)");
        ThreadPriorities tp4 = new ThreadPriorities("Govind");
        ThreadPriorities tp5 = new ThreadPriorities("Krishna");

//        set max priority
        tp3.setPriority(Thread.MAX_PRIORITY);
        tp1.start();
        tp2.start();
        tp3.start();
        tp4.start();
        tp5.start();

    }
}
