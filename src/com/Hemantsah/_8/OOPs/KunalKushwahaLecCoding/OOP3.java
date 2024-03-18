package KunalKushwahaLecCoding;

public class OOP3 {
    int a;
    int b;
    int c;
    OOP3(){
        a=5;
        b=25;
        c=125;
    }
    void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
class OOP3child extends OOP3{
    int d;
    OOP3child(){
        d=1200;
    }
    void show1(){
        System.out.println(d);
    }
}
class print{
    public static void main(String[] args) {

//        OOP3child ch=new OOP3child();   //OOP3child is refernce variable
//        System.out.println(ch.d); //we can access all the variable that are present in parent class as well as child class since both, class and constructor are of 'childClass'

//        OOP3 ch=new OOP3child();   //OOP3 is refernce variable
//        System.out.println(ch.d); //we can't access childclass variable since refernce variable is of type parent class

//        OOP3child ch=new OOP3();
//        System.out.println(ch.a); //we can't do this since we can't have a child reference variable and parent class object
        //here obj is itself of parent class, how will we call constructor of childclass that's why we can't do this


//it is not the type of object that determines what variable/member can be access but it is the type of refernce variable which determine which variable/member can be access

        // when we are refering child object to parent one then we can access only parent member
        // when we are refering child object to child one then we can access both members of child and parent class

    }
}
