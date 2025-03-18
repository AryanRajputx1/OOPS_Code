package com.example.oops2;
import java.util.Scanner;
class shape{
    String color ;
    public void area (){
        System.out.println("Display Area ");
    }

}
class Triangle extends shape {
    public void area (int l , int h){
        System.out.println(1/2*l*h);
    }
}
class eqtriangle extends Triangle{
    public void area (int l , int h){
        System.out.println(1/2*l*h);
    }
}

class circle extends shape{
    public void area(int r ){
        System.out.println((3.14)*r*r);
    }
}
public class inheritance {
    public static void main(String[] args) {
        Triangle T1= new Triangle();
        T1.color= "red";
        circle c1= new circle();
        c1.area(2);
    }
}
