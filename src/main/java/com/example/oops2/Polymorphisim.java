package com.example.oops2;
class Student2 {
    String name;
    int age;
    public void printinf(String name ){
        System.out.println(name);
    }
    public void printinf(int age ) {
        System.out.println(age);
    }
    public void printinf( String name ,int age ) {
        System.out.println(name +"  " +age);
    }
}

public class Polymorphisim {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.name = "Aryan ";
        s1.age =22;
        s1.printinf(s1.name);
        s1.printinf(s1.name , s1.age);
        s1.printinf(s1.age);
    }
}
