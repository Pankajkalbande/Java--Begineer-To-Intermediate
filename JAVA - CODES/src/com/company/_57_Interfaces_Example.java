package com.company;

interface Camera{
    void takeSnap();
    void recordVideo();
}
interface Wifi{
    String [] getNetwork();
    void ConnectToNetwork(String network);
}

class MyCellPhone{
    void cellNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void PickCall(){
        System.out.println("Connecting.... ");
    }
}

class SmartPhone extends MyCellPhone implements Camera,Wifi{
    @Override
    public void takeSnap(){
        System.out.println("Taking Photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording in 4K ");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting network List");
        String []  network = {"Harry" ,"Pankaj", "Raj"};
        return network;
    }

    @Override
    public void ConnectToNetwork(String network) {
        System.out.println("Connecting to "+ network);
    }


}
public class _57_Interfaces_Example {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
       String [] arr =  smartPhone.getNetwork();
        for (String item:arr) {
            System.out.println(item);
        }
    }
}
