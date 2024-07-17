package com.Hemantsah._8.OOPs.KKLecCoding;
//1. We can't access non-static member inside a static function. But but we can access non-static member inside a static fn by creating its instance inside the non-static fn.
//2. But we can access static member inside a non-static fn. Becoz static is not dependent on object. we can use it anywhere.
class Outerclass{  //class under class is possible and inner class may be, may not be static but outer class will not be static becoz it itself not dependent on other class

   static class inner{   //After making this class as static it will not dependent on outerclass, object of outerclass is not required to run this class
       //and its internal variable, method may dependent on object
      static String name;

       inner(String name) {
            inner.name = name;
        }

    }

    public static void main(String[] args) {
        inner in=new inner("Hemant"); //it is showing error becoz it call the constructor of inner class which is dependent on other class to avoid error we have to make inner class as static.
        // If we put innerclass outside the outerclass then it will not show error

        inner in2=new inner("Sah"); //if we make name variable as static then in both print statement it will print Sah because it does not dependent on object

        System.out.println(in.name);
        System.out.println(in2.name);

    }
    static void fun(){
//       fun2();  //can't access
        Outerclass obj = new Outerclass();
        obj.fun2(); //Now access since we have created its instance.
    }
    void fun2(){
        System.out.println("I'm non-static fn");
    }
}

 class StaticBlock{ //StaticBlock executed exactly once when the class is 1st loaded.
    static int a=10;
    static int b;
    static{  //executed only once when the class is loaded 1st time
        b=a*5;
    }
}

