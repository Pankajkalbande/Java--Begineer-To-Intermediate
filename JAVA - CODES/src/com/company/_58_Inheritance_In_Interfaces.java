package com.company;

interface SampleInterface{
    void method1();
    void method2();
}

interface ChildInterface extends SampleInterface{
    void method3();
    void method4();
}


class SampleClass implements ChildInterface{
    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }
    @Override
    public void method3() {
        System.out.println("Method 3");
    }

    @Override
    public void method4() {
        System.out.println("Method 4");
    }
}
public class _58_Inheritance_In_Interfaces {
    public static void main(String[] args) {

        SampleClass sampleClass = new SampleClass();
        sampleClass.method1();
        sampleClass.method2();
        sampleClass.method3();
        sampleClass.method4();
    }
}
