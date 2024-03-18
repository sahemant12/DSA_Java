package com.Hemantsah._8.OOPs;

//Static Block Vs Instance Block
class A1{    //1st execute static block then instance block then constructor
    A1(){ //constructor
        System.out.println("Hello 2");
    }

    {       //instance block: executed during the time of object creation
        System.out.println("Hello 60");
    }

    int a=10; static int b=20;
    static{ //static block: it get executed at the time of loading .class file. It only access static variable i.e static int b=20;
        System.out.println("Hello 3");
        System.out.println(b);
    }

}
class B{
    public static void main(String[] args) {
    A1 obj =new A1();
    }
}