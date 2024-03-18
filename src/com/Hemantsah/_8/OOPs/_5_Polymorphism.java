package com.Hemantsah._8.OOPs;
//polymorphism: same object having different behaviour

//1. compile-time polymorphism(It is also known as static polymorphism)
//method overloading: When there are multiple methods with the same name but different parameters in a same class then these methods are said to be overloading.
//class poly{
//    int a,b,sum;
//    void sum(){
//        a=20; b=10;
//        sum=a+b;
//        System.out.println(sum);
//    }
//    void sum(int a){
//        b=200;
//        sum=a+b;
//        System.out.println(sum);
//    }
//    void sum(int a,int b){
//        sum=a+b;
//        System.out.println(sum);
//    }
//}
//class print{
//    public static void main(String[] args) {
//        poly ob1=new poly();
//        ob1.sum(); ob1.sum(600); ob1.sum(69,31);
//    }
//}


//2. Run-time polymorphism(It is also known as Dynamic Method Dispatch)
//method overriding: If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
class ridding{
    void meth(){
        System.out.println("Hello");
    }
}
class overridding extends ridding{
    @Override
    void meth(){
        System.out.println("override method");
    }
}
class print{
    public static void main(String[] args) {
        ridding over=new overridding();
        over.meth(); //call the method of subclasses
    }
}
