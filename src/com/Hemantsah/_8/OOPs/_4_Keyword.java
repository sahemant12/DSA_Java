package com.Hemantsah._8.OOPs;

//super keyword: It is used when we call the parent class (i).method: super.show()  (ii).variable: super.a (iii).constructor: super()
class keyword1{
    int a=10;
    keyword1(int a){
        System.out.println("Hello super:"+a);
    }
    keyword1(){
        System.out.println("super keyword call the constructor of parent class");
    }
    void show(){
        System.out.println(a);
    }

}
class word extends keyword1{
    int a=20;

    word(){
        super();  //super keyword call the constructor of parent class
//        super(100); //super in constructor
    }


    void show(){

        super.show();  //super in method
        System.out.println(a);
        System.out.println(super.a); //super in variable
    }
}
//class display{
//    public static void main(String[] args) {
//        word obj=new word();
//        obj.show(); //1st print hello super100->10->20->10
//    }
//}


//this keyword: this refers to current object inside a method or constructor.
// Uses:
//1. It is used to avoid confusion b/w local variable and instance variable.
//2. It is used to call constructor of its own class.
//3. It is used to call the current class method.
class keyword2{
    int x; //instance variable
    keyword2(int x){  //local variable
        this(); //calling default constructor
        this.x=x; //this keyword refers to current object
    }
    keyword2(){ //default constructor
        System.out.println("call default constructor");
    }
    void show(){
        System.out.println(x);
    }
}
class p{
    public static void main(String[] args) {
        keyword2 object1=new keyword2(100);
        object1.show();
    }
}

