//package com.Hemantsah._8.OOPs;
//import java.util.*;
//public class _8_Interface {
//}
//
////interface introduction
//interface client{
//   void input(); //public and abstract
//   public void output(); //public and abstract
//}
//
// class piyush implements client{
//    String name; double sal;
//   public void input(){ //method should be public
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter the name");
//        name=in.nextLine();
//        System.out.println("Enter the salary");
//        sal=in.nextDouble();
//    }
//  public void output(){  //method should be public
//        System.out.println(name+" "+sal);
//    }
//
////    public static void main(String[] args) {
////         client pi=new piyush();
////         pi.input(); pi.output();
////     }
// }
//
//
// //Interface variable
//interface seller{
//    int amt=5; //public + static + final
//    void purchase(); //public + abstract
//}
//class shrey implements seller{
//
//  public void purchase(){ //interface method is public
//        System.out.println("Shrey want"+" "+amt+" "+"kg of rice");
//    }
//}
////class printrice{
////    public static void main(String[] args) {
////    shrey sh=new shrey();
////    sh.purchase();
////    System.out.println(sh.amt); //static
////    }
////}
//
//
////Interface Method
//interface webdevelopment{
//    void frontend(); //public + abstract
//    void backend();
//}
//abstract class hema implements webdevelopment{
//    @Override
//   public void frontend(){
//        System.out.println("I Will learn frontend");
//    }
//}
//class nishu extends hema{
//    @Override
//   public void backend(){
//        System.out.println("I will learn backend");
//    }
//}
//
//class motivation{
////    public static void main(String[] args) {
////        hema he=new nishu();
////        he.frontend();
////        he.backend();
////    }
//}
//
//
////multiple inheritance
//interface AA{
//    void show();
//}
//interface BB{
//    void display();
//}
//class C implements AA,BB{
//   public void show(){
//        System.out.println("Hello i am from interface AA");
//    }
//    public void display(){
//        System.out.println("Hello i am from interface BB");
//    }
//
////    public static void main(String[] args) {
////        C c=new C();
////        c.show(); c.display();
////    }
//}
//
//
//////Extending interface
//interface suman{
//    void add(); //public + abstract
//}
//interface baibhav extends suman{
//    void sub();
//}
//class basu implements baibhav{
//    public void add(){
//        int a=10,b=20;
//        int sum=a+b;
//        System.out.println(sum);
//    }
//    public void sub(){
//        int a=10,b=20;
//        int minus=a-b;
//        System.out.println(minus);
//    }
//
////    public static void main(String[] args) {
////        basu ba=new basu();
////            ba.add(); ba.sub();
////    }
//}
////
////
////
//////interface JDK 1.8
//////part 1
////interface jdk{
////    void A(); //public + abstract
////    void B();
////   default void C(){
////       System.out.println("now the interface method is default and static also");
////   }
////   static void D(){
////       System.out.println("now the interface method is default and static also");
////   }
////}
////class x implements jdk{
////    public void A(){
////        System.out.println("Hello i am x->A");
////    }
////    public void B(){
////        System.out.println("Hello i am x-> B");
////    }
////}
////class y implements jdk{
////    public void A(){
////        System.out.println("Hello i am y->A");
////    }
////    public void B(){
////        System.out.println("Hello i am y-> B");
////    }
////    public void C(){
////        System.out.println("Now the method D() is override");
////    }
////}
////class z{
////    public static void main(String[] args) {
////        x obj1=new x();
////        y obj2=new y();
////        obj1.A(); obj1.B();  obj1.C();
////        obj2.A(); obj2.B(); obj2.C();
////     //   obj1.D(); obj2.D(); //with static we can't use object
////        jdk.D();
////    }
////}
////
////
//////part2
////interface jdk2{
////    static void fn(){
////        System.out.println("Static method can't be override");
////    }
////}
////class xy implements jdk2{
////    public void fn(){
////   //     @Override
////   //     System.out.println("Can't be override");
////    }
////}
////class w{
////    public static void main(String[] args) {
////        xy x=new xy();
////        x.fn();
////        jdk2.fn();
////    }
////}
////
////interface CanWriteMainMethod //becoz main method is static and we don't need object to call it
////{
////    public static void main(String[] args) {
////        System.out.println("Hello");
////    }
////}
////
////
//////interface JDK 1.9
////interface A{
////  default void another(){
////        sum(600,150);
////    }
////    static void another2(){
////      mul(9,3);
////    }
////    private static void mul(int a, int b) { //make this method static becoz we are calling this method in static method
////        System.out.println("mul:"+(a*b));
////    }
////
////    private void sum(int a,int b){
////        System.out.println("sum:"+(a+b));
////    }
////}
////class BB implements A{
////    public void sub(int a,int b){
////        System.out.println("Sub:"+(a-b));
////    }
////}
////class display{
////    public static void main(String[] args) {
////        BB b=new BB();
////     //   b.sum(500,150); //we can't access interface method through object
////        b.another(); //we can access private method by calling another method i.e(by static and default) which call private method
////        b.sub(500,150);
////        A.another2();
////    }
////}
//
////Not necessary that much: Co-varient return type
////class x{
////    x show(){ //type class
////        System.out.println("Hello i am learning OOPS");
////        System.out.println("x  "+this);
////        return this; //this is a keyword in java which refers to current object
////    }
////}
////class y extends x {
////    @Override
////    y show(){  //type class
////        super.show(); //super is a keyword in java by which we can access parent class variable + method + constructor
////        System.out.println("Hello i am learing co-varient");
////        System.out.println("y  "+this);
////
////        return this; //this is a keyword in java which refers to current object
////    }
////}
////class printy{
////    public static void main(String[] args) {
////        y obj=new y();
////        obj.show();
////    }
////}