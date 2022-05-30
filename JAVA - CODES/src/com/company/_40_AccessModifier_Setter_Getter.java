package com.company;


class MyEmployee{
    private  int id;
    private  String name;

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
}

public class _40_AccessModifier_Setter_Getter {
    public static void main(String[] args) {

        MyEmployee emp = new MyEmployee();
//        emp.id = 3;
//        emp.name = "abc";

//        id has private access in com.company.MyEmployee
//        name has private access in com.company.MyEmployee
//        System.out.println(id);
//        System.out.println(name);

        emp.setId(1);
        emp.setName("Pankaj");

        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
