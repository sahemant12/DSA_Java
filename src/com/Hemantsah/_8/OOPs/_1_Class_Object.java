package com.Hemantsah._8.OOPs;

public class _1_Class_Object { }
class Demo{
    int a=10;  //instance variable
    String b="Sah";  //instance variable
    void print(){
        System.out.println("Hemant");
    }
}
//class Test{
//    public static void main(String[] args) {
//        Demo obj = new Demo();  //obj is object reference
//        System.out.println(obj.a+ " "+ obj.b);
//        obj.print();
//    }
//}

//CONSTRUCTOR
class A{
    int a,b;
    A(){ //default constructor
        a=10; b=20;
    }
    A(int x,int y){ //parametrized constructor
        a=x;
        b=y;
    }
    A(A ref){ //Copy constructor
        a=ref.a;
        b=ref.b;
    }
    void show(){
        System.out.println(a+" "+b);
    }

}

//class B{
//    public static void main(String[] args) {
//        A con1=new A();
//        A con2=new A(50,100);
//        A con3=new A(con1);
//        con1.show();
//        con2.show();
//        con3.show();
//    }
//}
//class C{
//    int c,d;
//    private C(){ //Private constructor
//        c=100; d=200;
//    }
//    void display(){
//        System.out.println(c+" "+d);
//    }
//    public static void main(String[] args) {
//        C con4=new C();
//        con4.display();
//    }
//}
//class D{
//    public static void main(String[] args) {
////        C con4=new C(); //can't access outside the class
////        con4.display();
//    }
//}



//Constructor Overloading: Constructor having same name but different parameter.
class E{
    int a,d;
    double b;
    String c;
    E(){
        a=10;
        d=20;
        b=99.98;
        c="Overloading";
        System.out.println(a+" "+d+" "+b+" "+c);
    }
    E(int x,int y){
        a=x;
        d=y;
        System.out.println(a+" "+d);
    }
    E(int x,double z){
        a=x;
        b=z;
        System.out.println(a+" "+b);
    }
    E(String m){
        c=m;
        System.out.println(c);
    }
}
class F{
    public static void main(String[] args) {
        E p0=new E();
        E p2=new E(50,100);
        E p2d=new E(90,10.10);
        E p1=new E("Constructor Overloading");
    }
}