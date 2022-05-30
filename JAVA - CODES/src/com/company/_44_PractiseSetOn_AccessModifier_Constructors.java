package com.company;

//   01------     crate a class Cylinder and use getter and setter to set its radius and height
class Cylinder{
   private int radius;
   private int height;

   public void setRadius(int r){
       this.radius = r;
   }
   public int getRadius(){
       return  radius;
   }

   public void setHeight(int h){
       this.height = h;
   }
   public int getHeight(){
       return  height;
   }


//    02-----    use que1 and calculate area and volume
    public double SurfaceArea(){
       return 2* Math.PI* radius * radius  + 2*Math.PI*radius*height;
    }
    public double Volume(){
       return Math.PI* radius * radius *height;
    }

//    03 ------ use constructor and do the same problem

    public Cylinder(int radius, int height){
        System.out.println("Constructor is called");
       this.radius = radius;
       this.height = height;
    }

}
//     04------ overload a constructor used to initialize a rectangle of length 4 and breadth 5 for custom parameter

class Rectangle{
    private int length;
    private int breadth;

//    public Rectangle() {
//        this.length = 4;
//        this.breadth = 5;
//    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class _44_PractiseSetOn_AccessModifier_Constructors {
    public static void main(String[] args) {
//   01------     crate a class Cylinder and use getter and setter to set its radius and height
    /*
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(9);
        cylinder.setHeight(12);

        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getHeight());
    */

//    02-----    use que1 and calculate area and volume
//
    /*
    System.out.println(cylinder.SurfaceArea());
        System.out.println(cylinder.Volume());
    */

//    03 ------ use constructor and do the same problem

        Cylinder cylinder = new Cylinder(9, 12);
        System.out.println(cylinder.Volume());
        System.out.println(cylinder.SurfaceArea());

//     04------ overload a constructor used to initialize a rectangle of length and breadth for custom parameter
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getBreadth());
    }
}