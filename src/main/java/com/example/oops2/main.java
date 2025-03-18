package com.example.oops2;
import java .util.*;
class pen {
    String color ;
    String type ; // ball , gel point pen
    public void write (){
        System.out.println("Write Something ");
    }
    public void color(){
        System.out.println(this.color);
    }

}

class Student{
    String name ;
    int age ;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
    Student(String name , int age ){
        this.name =name;
        this .age =age ;

    }
}
public class main {
    public static void main(String[] args) {
     /*   pen p1 = new pen ();
        pen p2 = new pen ();
        p1.color = "Blue ";
        p2.color = "BLACK";
        p1.type= "Gel";
        p1.write();
        p1.color();
        p2.color();*/
        Student s1 = new Student("Aryan ",22);

        s1.printInfo();
    }
}