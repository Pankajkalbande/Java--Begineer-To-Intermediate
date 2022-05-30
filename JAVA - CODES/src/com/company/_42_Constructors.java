package com.company;


class MyEmployee1{
    private  int id;
    private  String name;
    private int salary;

//    constructor without argument

    MyEmployee1(){
         id = 10;
         name = "Pankaj";
         salary = 45000;
    }

//    constructor with argument

//    MyEmployee1(int myId, String MyName){
//         id = myId;
//         name = MyName;
//    }



    public void setId(int i){
        this.id = i;
    }
    public int getId() {
        return id;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}


public class _42_Constructors {
    public static void main(String[] args) {

//        MyEmployee1 obj = new MyEmployee1(1, "Pankaj");
        MyEmployee1 obj = new MyEmployee1();

        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
    }
}
