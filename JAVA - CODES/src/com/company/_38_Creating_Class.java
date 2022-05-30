package com.company;

class  Employee{
    int id;
    int salary;
    String name;

    public void printDetails(){
        System.out.println(id);
        System.out.println(salary);
        System.out.println(name);

    }
}

public class _38_Creating_Class {
    public static void main(String[] args) {

        Employee pk = new Employee();
        Employee sp = new Employee();

//        setting attributes for pk
        pk.id = 1;
        pk.name = "Pankaj";
        pk.salary = 5000000;

//        setting attributes for sp
        sp.id = 2;
        sp.name = "Sachin";
        sp.salary = 4500000;

//        System.out.println(pk.id);
//        System.out.println(pk.salary);
//        System.out.println(pk.name);
//
//        System.out.println(sp.id);
//        System.out.println(sp.salary);
//        System.out.println(sp.name);

        System.out.println("Printing Details about Pk");
        pk.printDetails();
        System.out.println("\nPrinting Details about sp");
        sp.printDetails();



    }
}
