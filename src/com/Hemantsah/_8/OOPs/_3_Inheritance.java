package com.Hemantsah._8.OOPs;

class Student{
    String name; int roll;
    void input(){
        System.out.println("Enter name and roll Number");
    }

    void sum(){
        int a=30,b=10;
        int s=a+b;
        System.out.println("Sum:"+s);
    }
}

// Single Inheritance
class hemant extends Student{
    void display(){
        name="Sahemant";
        roll=25;
        System.out.println(name+" "+roll);
    }
//
//    public static void main(String[] args) {
//        hemant obj1 = new hemant();
//        obj1.display();
//        obj1.input();
//    }
}


// Multi-level Inheritance
class student2 extends Student{
    void sub(){
        int a=30,b=10;
        int m=a-b;
        System.out.println("Sub:"+m);
    }
}
class student3 extends student2{
    void mul(){
        int a=30,b=10;
        int mu=a*b;
        System.out.println("mul:"+mu);
    }
    public static void main(String[] args) {
        student3 obj=new student3();
        obj.sum(); obj.sub(); obj.mul();
    }
}


//hierarchical inheritance
class shape{
    void shape_type(){
        System.out.println("Triangle circle square");
    }
}
class triangle extends shape{
    void tri(){
        System.out.println("Triangle");
    }
}
class circle extends shape{
    void cir(){
        System.out.println("circle");
    }
}
class square extends shape{
    void sq(){
        System.out.println("square");
    }
}
class show{
    public static void main(String[] args) {
        triangle otri=new triangle();
        circle ocir=new circle();
        square osq=new square();
        otri.shape_type();
        ocir.shape_type();
        osq.shape_type();
        otri.tri();
        ocir.cir();
        osq.sq();
    }
}



