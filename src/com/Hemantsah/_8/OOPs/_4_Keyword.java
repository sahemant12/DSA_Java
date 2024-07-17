package com.Hemantsah._8.OOPs;

//1. super keyword: It is used when we call the parent class (i).method: super.show()  (ii).variable: super.a (iii).constructor: super()
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
//        obj.show(); //1st print: hello super100->10->20->10
//    }
//}


//2. this keyword: this refers to current object inside a method or constructor.
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


//3. static keyword: It is not dependent on object. It belongs to the class itself. It is used for memory management basically it makes our prgm efficient.
 class Man {
    static int staticVar = 0;

    // Static method E.g
    public static void staticMethod() {
        staticVar++;
        System.out.println("Static method called. staticVar: " + staticVar);
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("Instance method called.");
    }

    public static void main(String[] args) {
        // Calling static method without creating an instance
        Man.staticMethod(); // Static method called. staticVar: 1

        // Calling instance method requires an instance
        Man obj = new Man();
        obj.instanceMethod(); // Instance method called.
    }
}
//1. Static Variables: Shared among all instances of a class. Only one copy exists.
//2. Static Methods: Belong to the class, can be called without creating an instance, can only access static variables and other static methods.
//3. Static Blocks: Used for static initializations, executed once when the class is loaded.
//4. Static Classes: Only nested classes can be static, can be instantiated without an instance of the enclosing class.


//4. final keyword: It is used to restrict the User to change (i) variable value (ii) method overridding (iii) class inheritance


//5. finalize() not keyword. It is method: which is called by the garbage collector before an object is destroyed. The purpose of finalize() is to released the resources that are allocated by unused object such as closing files, releasing memory, etc.

//6. finally: It is a block, which is used with try-catch block. It always get executed.

