package com.company;


interface Camera1{
    void takeSnap();
    void recordVideo();
}
interface Wifi1{
    String [] getNetwork();
    void ConnectToNetwork(String network);
}

class MyCellPhone1{
    void cellNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void PickCall(){
        System.out.println("Connecting.... ");
    }
}

class SmartPhone1 extends MyCellPhone1 implements Camera1,Wifi1{
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
        String [] network = {"Harry" ,"Pankaj", "Raj"};
        return network;


    }

    @Override

    public void ConnectToNetwork(String network) {
        System.out.println("Connecting to "+ network);
    }


}


public class _59_Polymorphism_In_Interfaces {
    public static void main(String[] args) {

        Camera1 cam1 = new SmartPhone1();
        cam1.recordVideo();
        cam1.takeSnap();

//      cam1.getNetwork(); // not allowed this bcoz you're using smartphone as camera not Wi-Fi

        SmartPhone1 smartPhone1 = new SmartPhone1();
        smartPhone1.ConnectToNetwork("Harry");
        smartPhone1.getNetwork();
        smartPhone1.takeSnap();
        smartPhone1.recordVideo();
        smartPhone1.cellNumber(8999);
    }
}
