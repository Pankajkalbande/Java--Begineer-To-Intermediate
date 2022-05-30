package com.company;

// Q1. create an abstract class Pen with method write and refill as abstract method
abstract class  Pen{
   abstract void write();
    abstract void refill();
}
// Q2. use Pen class to create a concrete class Fountain Pen with additional method ChangeNib()
class FountainPen extends Pen{
    @Override
    void write(){
        System.out.println("Writing with Pen");
    }
    @Override
    void  refill(){
        System.out.println("Refilling the Pen");
    }
    void ChangeNib(){
        System.out.println("Changing Nib of Pen");
    }
}

// Q3. create a class Monkey with jump() and Bite() methods. Create class Human which inherits this Monkey class and implements
//Basic Animal interface with eat() and sleep() method

class Monkey{
    void Jump(){
        System.out.println("Monkey is jumping");
    }
    void Bite(){
        System.out.println("Bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{

    void speak(){
        System.out.println("Hello sir...");
    }
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

// Q4 . create Telephone Class with ring() ,lift() and disconnect() methods as abstract methods .
//create another class SmartPhone and demonstrate Polymorphism.
abstract class Telephone{
    abstract void Ring();
    abstract void Lift();
    abstract void Disconnect();
}
class newSmartPhone extends Telephone{

    @Override
    void Ring() {
        System.out.println("Ringing....");
    }

    @Override
    void Lift() {
        System.out.println("Lifting");
    }

    @Override
    void Disconnect() {
        System.out.println("Disconnecting");
    }
}

//Q5 . Demonstrate polymorphism using monkey class from Q3.


// Q6 . Create an interface TvRemote and use it to inherit another interface SmartTvRemote
interface TvRemote{
    void volumeUp();
    void volumeDown();
}
interface SmartTvRemote extends TvRemote{
    void On();
    void Off();
}
class Tv implements SmartTvRemote{

    @Override
    public void volumeUp() {
        System.out.println("Volume is Increasing");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume is Decreasing");
    }

    @Override
    public void On() {
        System.out.println("Tv is on");
    }

    @Override
    public void Off() {
        System.out.println("Tv is off");
    }
}
public class _60_AbstractClasses_Interfaces_example {
    public static void main(String[] args) {

//        Q1, Q2.
        FountainPen fountainPen  = new FountainPen();
        fountainPen.ChangeNib();
        fountainPen.write();
        fountainPen.refill();

//        Q3.
        Human human = new Human();
        human.eat();
        human.sleep();
        human.speak();
        human.Bite();
        human.Jump();

// Q4 . create Telephone Class with ring() ,lift() and disconnect() methods as abstract methods .
//create another class SmartPhone and demonstrate Polymorphism.
        newSmartPhone newSmartPhone = new newSmartPhone();
        newSmartPhone.Ring();
        newSmartPhone.Lift();
        newSmartPhone.Disconnect();

//Q5 . Demonstrate polymorphism using monkey class from Q3.
        Monkey m1 = new Human();
        m1.Bite();
        m1.Jump();
//        m1.speak();  // reference is monkey which does not have speak method

// Q6 .
        Tv tv = new Tv();
        tv.volumeDown();
        tv.volumeUp();
        tv.On();
        tv.Off();

    }
}
