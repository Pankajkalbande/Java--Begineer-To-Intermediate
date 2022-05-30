package com.company;

interface Bycycle{
    int a = 45;
    void Break(int decrement);
    void SpeedUp(int increment);
}

interface BlowHorn{
    void BlowPeePee();
    void BlowPeePooPeePoo();
}
class AvonCycle implements Bycycle,BlowHorn{
    @Override
    public void Break(int decrement){
        System.out.println("Applying Break");
    }
    @Override
    public void SpeedUp(int increment){
        System.out.println("Increasing Speed");
    }

    @Override
    public void BlowPeePee() {
        System.out.println("Pee------Pee");
    }

    @Override
    public void BlowPeePooPeePoo() {
        System.out.println("PeePooPeePoo");
    }
}
public class _54_Interfaces {
    public static void main(String[] args) {

        AvonCycle cycle = new AvonCycle();
        cycle.Break(5);
        System.out.println(cycle.a);

        cycle.BlowPeePee();
        cycle.BlowPeePooPeePoo();


//        cycle.a = 454;  // You can not assign value to Interfaces as they are final
    }
}
