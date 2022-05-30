package com.company;

public class _31_Method {
    static int logic(int x , int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x+y)*5;
        }
        return  z;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = logic(a,b);
        System.out.println(c);


        int m = 5;
        int n = 7;
        int o = logic(m,n);
        System.out.println(o);
    }
}
